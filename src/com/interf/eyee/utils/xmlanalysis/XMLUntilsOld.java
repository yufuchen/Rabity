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
import com.interf.eyee.entity.expect.ExpectBaseEntity;
import com.interf.eyee.utils.Log;

/**
 * @author Ksewen
 *
 */
public class XMLUntilsOld {
	public static LinkedHashMap<String, BaseDataEntity> readXMLDocument(String path) {
		Log log = new Log(XMLUntilsOld.class);
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
				// 提取baseLine标签特殊处理，其他加入JSONObject
				if (!nodes.getName().equals("baseLine")) {
					if (nodes.elementIterator().hasNext()) {
						for (Iterator<?> k = nodes.elementIterator(); k.hasNext();) {
							Element element = (Element) k.next();
							if (element.getName().equals("list")) {
								// 待实现，获取list子标签里的内容并转成JSONArray
							} else {
								log.error("用例文件格式不正确，确保子标签为list");
							}
						}
					} else {
						if (nodes.getText().equals("")) {
							input.put(nodes.getName(), null);
						}
						input.put(nodes.getName(), nodes.getText());
					}

				} else {
					// 循环获取<baseLine>的子标签
					for (Iterator<?> k = nodes.elementIterator(); k.hasNext();) {
						Element element = (Element) k.next();
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
				}
			}
			baseData.setTestCase(input);
			baseData.setBaseline(baseline);
			caseMap.put(page.attributeValue("id") + "_" + page.attributeValue("name"), baseData);
		}
		return caseMap;
	}
}
