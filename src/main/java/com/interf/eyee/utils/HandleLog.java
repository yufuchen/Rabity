package main.java.com.interf.eyee.utils;
/**
 * @author Ksewen
 *
 */
public class HandleLog {
	public static void write(boolean flag, String paramName, String actual, String expected) {
		Log log = new Log(HandleLog.class);
		if (flag == true) {
			log.info("字段名称 : " + paramName + "   实际结果 : " + actual + " ========= 预期结果 : " + expected);
		} else if (flag == false) {
			log.error("字段名称 :" + paramName + "   实际结果 : " + actual + " ========= 预期结果 : " + expected);
		}
	}
}
