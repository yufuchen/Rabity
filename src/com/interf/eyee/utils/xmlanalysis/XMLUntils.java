package com.interf.eyee.utils.xmlanalysis;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ExpectBaseDataEntity;
import com.interf.eyee.entity.ExpectBaseEntity;
import com.interf.eyee.utils.Log;

/**
 * @author Ksewen
 *
 */
public class XMLUntils {
	protected static Log log = new Log(XMLUntils.class);
	
	public static LinkedHashMap<String, BaseDataEntity> readXMLCase(String path) {
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
			JSONObject j = (JSONObject) JSONObject.toJSON(parse(page));
			BaseDataEntity baseDate = new BaseDataEntity();
			baseDate = j.toJavaObject(baseDate.getClass());
			caseMap.put(page.attributeValue("id") + "_" + page.attributeValue("name"), baseDate);
		
		}
		return caseMap;
	}
	
	private static Object parse(Element element) {// data
		List<?> elements = element.elements();
		if (elements.size() == 0) {
			return element.getText();
		} else {
			// 有子元素
			String prev = null;
			boolean guess = true; // 默认按照数组处理

			Iterator<?> iterator = elements.iterator();
			while (iterator.hasNext()) {
				Element elem = (Element) iterator.next();
				String name = elem.getName();
				if (prev == null) {
					prev = name;
				} else {
					guess = name.equals(prev);
					break;
				}
			}
			iterator = elements.iterator();
			if (guess) {
				JSONArray data = new JSONArray();
				while (iterator.hasNext()) {
					Element elem = (Element) iterator.next();
					data.add(parse(elem));
				}
				return data;
			} else {
				JSONObject data = new JSONObject();
				while (iterator.hasNext()) {
					Element elem = (Element) iterator.next();
					data.put(elem.getName(), parse(elem));
				}
				return data;
			}
		}

	}
}
