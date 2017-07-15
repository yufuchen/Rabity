package com.interf.eyee.utils;
/**
 * @author Ksewen
 *
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.entity.forcase.MobileLoginDataEntity;

public class ResponseUtil {
	public static ResponseEntity handle(String body, BaseDataEntity data) {
		ResponseEntity response = new ResponseEntity();
		Gson gson = new GsonBuilder().create();
		JsonObject temp = new JsonParser().parse(body).getAsJsonObject();
		response.setCode(Long.parseLong(temp.get("code").getAsString()));
		response.setMsg(temp.get("msg").getAsString());
		if (!temp.get("data").toString().equals("null")) {
			data = gson.fromJson(temp.get("data"), data.getClass());
			response.setData(data);
		}
		return response;
	}
}