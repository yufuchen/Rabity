package com.interf.eyee.utils;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.interf.eyee.entity.BaseEntity;


/**
 * @author Ksewen
 *
 */
public class Post {
	private HttpClient httpClient = null;
	private HttpPost postMethod = null;
	private long startTime = 0L;
	private long endTime = 0L;
	private int status = 0;

	public String doPost(String baseUrl, BaseEntity postEntity) {
		Log log = new Log(Post.class);
		httpClient = new DefaultHttpClient();
		postMethod = new HttpPost(baseUrl);
		String param = postEntity.toString();
		String body = null;
		
		log.info("输入参数: " + param);

		if (postMethod != null && param != null && !"".equals(param.trim())) {
			try {
				StringEntity se = new StringEntity(param);
				se.setContentEncoding("UTF-8");
				se.setContentType("application/json");
				postMethod.setEntity(se);
				startTime = System.currentTimeMillis();

				HttpResponse response = httpClient.execute(postMethod);

				endTime = System.currentTimeMillis();
				int statusCode = response.getStatusLine().getStatusCode();

				log.info("statusCode:" + statusCode);
				log.info("调用API 花费时间(单位：毫秒)：" + (endTime - startTime));
				if (statusCode != HttpStatus.SC_OK) {
					log.error("请求失败 :" + response.getStatusLine());
					status = 1;
				}

				// Read the response body
				body = EntityUtils.toString(response.getEntity());

			} catch (IOException e) {
				status = 3;
				log.error("网络连接失败");
			} finally {
				log.info("调用接口状态：" + status);
			}
		}

		return body;
	}

	/**
	 * 0.成功 1.执行方法失败 2.协议错误 3.网络错误
	 * 
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the startTime
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * @return the endTime
	 */
	public long getEndTime() {
		return endTime;
	}
}
