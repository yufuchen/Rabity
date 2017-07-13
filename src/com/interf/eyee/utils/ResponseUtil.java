package com.interf.eyee.utils;
/**
 * @author Ksewen
 *
 */

import java.math.BigInteger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ResponseEntity;

public class ResponseUtil {
	
	@SuppressWarnings("unchecked")
	public static <T extends BaseDataEntity> ResponseEntity<T> handle(String body, T data) {
		ResponseEntity<T> response = new ResponseEntity<T>();
		Gson gson = new GsonBuilder().create();
		JsonObject temp = new JsonParser().parse(body).getAsJsonObject();
		response.setCode(new BigInteger(temp.get("code").getAsString()));
		response.setMsg(temp.get("msg").getAsString());
		if (!temp.get("data").toString().equals("null")) {
			data = (T) gson.fromJson(temp.get("data"), data.getClass());
		}
		response.setData(data);
		return response;
	}
}
