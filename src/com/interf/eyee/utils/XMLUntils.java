package com.interf.eyee.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author Ksewen
 *
 */
public class XMLUntils {
	public static LinkedHashMap<String, ArrayList<HashMap<String, String>>> readXMLDocument(String path) {
		Log log = new Log(XMLUntils.class);
		File xmlFile = new File(path);
		if (!xmlFile.exists()) {
			log.error("找不到" + path + "文件！");
		}
		LinkedHashMap<String, ArrayList<HashMap<String, String>>> caseMap = new LinkedHashMap<String, ArrayList<HashMap<String, String>>>();
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
			HashMap<String, String> input = new HashMap<String, String>();
			HashMap<String, String> baseline = new HashMap<String, String>();
			ArrayList<HashMap<String, String>> caseArray = new ArrayList<HashMap<String, String>>();

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
						if (!element.getName().equals("data")) {
							baseline.put(element.getName(), element.getText());
						} else {
							// data标签放入data容器，并转化成JSONObject
							JSONObject data = new JSONObject();
							for (Iterator<?> l = element.elementIterator(); l.hasNext();) {
								Element sub = (Element) l.next();
								if (sub.getText().equals("")) {
									input.put(sub.getName(), null);
								}
								data.put(sub.getName(), sub.getText());
							}
							baseline.put(element.getName(), data.toJSONString());
						}
					}
				}
			}
			caseArray.add(input);
			caseArray.add(baseline);
			caseMap.put(page.attributeValue("id") + "_" + page.attributeValue("name"), caseArray);
		}
		return caseMap;
	}
}
