package com.interf.eyee.utils.xmlanalysis;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ExpectBaseEntity;
import com.interf.eyee.utils.Log;

/**
 * @author Ksewen
 *
 */
public class BaseXMLUntils {
	private Log log = new Log(BaseXMLUntils.class);

	public LinkedHashMap<String, BaseDataEntity> readXMLDocument(String path) {
		File xmlFile = new File(path);
		if (!xmlFile.exists()) {
			log.error("找不到" + path + "文件！");
		}
		LinkedHashMap<String, BaseDataEntity> caseMap = new LinkedHashMap<String, BaseDataEntity>();
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(xmlFile);
		} catch (DocumentException e) {
			log.error("读取xml文件失败");
			e.printStackTrace();
		}
		Element root = document.getRootElement();
		for (Iterator<?> i = root.elementIterator(); i.hasNext();) {
			Element page = (Element) i.next();
			BaseDataEntity baseData = new BaseDataEntity();
			HashMap<String, String> input = new HashMap<String, String>();
			ExpectBaseEntity baseline = new ExpectBaseEntity();		
			
			// 循环获取<TestCase>的子标签
			for (Iterator<?> j = page.elementIterator(); j.hasNext();) {
				Element nodes = (Element) j.next();
				switch (nodes.getName()) {
				case "baseLine":
					baseline = handleBaseLine(nodes);
					break;
				default:
					handleDefault(nodes, input);
					break;
				}
			}
			baseData.setTestCase(input);
			baseData.setBaseline(baseline);
			caseMap.put(page.attributeValue("id") + "_" + page.attributeValue("name"), baseData);
		}
		return caseMap;
	}

	protected void handleDefault(Element nodes, HashMap<String, String> input) {
		if (nodes.getText().equals("")) {
			input.put(nodes.getName(), null);
		} else {
			input.put(nodes.getName(), nodes.getText());
		}
	}
	
	protected ExpectBaseEntity handleBaseLine(Element nodes) {
		ExpectBaseEntity baseline = new ExpectBaseEntity();
		// 循环获取<baseLine>的子标签
		for (Iterator<?> i = nodes.elementIterator(); i.hasNext();) {
			Element element = (Element) i.next();
			// 提取data标签特殊处理，其他加入JSONObject
			switch (element.getName()) {
			case "code":
				baseline.setCode(Long.parseLong(element.getText()));
				break;
			case "msg":
				baseline.setMsg(element.getText());
				break;
			case "data":
				JSONObject data = new JSONObject();
				for (Iterator<?> l = element.elementIterator(); l.hasNext();) {
					Element sub = (Element) l.next();
					if (sub.getText().equals("")) {
						data.put(sub.getName(), "null");
					}
					data.put(sub.getName(), sub.getText());
				}
				baseline.setData(data);
				break;
			case "servertime":
				baseline.setServerTime(null);
				break;
			default:
				log.error("BaseLine下有多余的子标签 : " + element.getName());
				throw new RuntimeException("BaseLine子标签设置错误");
			}
		}
		return baseline;
	}
}
