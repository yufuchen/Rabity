package com.interf.eyee.utils.xmlanalysis;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.BaseDataEntity;
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
			BaseDataEntity baseData = new BaseDataEntity();
			baseData = j.toJavaObject(baseData.getClass());
			caseMap.put(page.attributeValue("id") + "_" + page.attributeValue("name"), baseData);
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
			boolean guess = false; // 默认按照数组处理
			if (((Element) elements.iterator().next()).getName().equals("listelement")) {
				guess = true;
			}

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
				List<Object> data = new ArrayList<Object>();
				while (iterator.hasNext()) {
					Element elem = (Element) iterator.next();
					((List<Object>) data).add(parse(elem));
				}
				return data;
			} else {
				Map<String, Object> data = new HashMap<String, Object>();
				while (iterator.hasNext()) {
					Element elem = (Element) iterator.next();
					((Map<String, Object>) data).put(elem.getName(), parse(elem));
				}
				return data;
			}
		}

	}
}
