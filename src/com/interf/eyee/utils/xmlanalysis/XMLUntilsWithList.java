package com.interf.eyee.utils.xmlanalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.expect.ExpectBaseEntity;

/**
 * @author Ksewen
 *
 */
public class XMLUntilsWithList extends BaseXMLUntils {

	@Override
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
//				JSONObject data = new JSONObject();
//				data = handleData(element);
				Object obj = handleData(element);
				System.err.println(JSON.toJSON(obj));
//				baseline.setData(JSONObject.toJSON(obj););
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

	private Object handleData(Element element) {// data
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
					data.add(handleData(elem));
				}
				return data;
			} else {
				JSONObject data = new JSONObject();
				while (iterator.hasNext()) {
					Element elem = (Element) iterator.next();
					data.put(elem.getName(), handleData(elem));
				}
				return data;
			}
		}

	}
}
