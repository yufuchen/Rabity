package main.java.com.interf.eyee.utils;
/**
 * @author Ksewen
 *
 */

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import main.java.com.interf.eyee.entity.BaseDataEntity;
import main.java.com.interf.eyee.entity.ResponseEntity;

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
	
	public static ResponseEntity handle(String body, Class<?> clazz) {
		ResponseEntity response = new ResponseEntity();
		Gson gson = new GsonBuilder().create();
		JsonObject temp = new JsonParser().parse(body).getAsJsonObject();
		response.setCode(Long.parseLong(temp.get("code").getAsString()));
		response.setMsg(temp.get("msg").getAsString());
		if (!temp.get("data").toString().equals("null")) {
			ArrayList<Object> data = new ArrayList<>();
			for (JsonElement element : temp.get("data").getAsJsonArray()) {
				data.add(gson.fromJson(element, clazz));
			}
			response.setData(data);
		}
		return response;
	}
}
