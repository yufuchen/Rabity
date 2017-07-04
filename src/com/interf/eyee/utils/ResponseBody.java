package com.interf.eyee.utils;
/**
 * @author Ksewen
 *
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.ResponseEntity;

public class ResponseBody {
	
	public static ResponseEntity handle(String body) {
		ResponseEntity response = new ResponseEntity();
		JSONObject temp = JSON.parseObject(body);
		response.setCode(temp.getLong("code"));
		response.setMsg(temp.getString("msg"));
		response.setData(temp.getString("data"));
		return response;
	}
}
