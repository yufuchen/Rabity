package main.java.com.interf.eyee.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Ksewen
 *
 */
public class DBUtil {
	private static ApplicationContext atcx = new ClassPathXmlApplicationContext("jdbcTemplateConfig.xml");
	private static JdbcTemplate jdbcTemplate = (JdbcTemplate) atcx.getBean("mssqlJdbcTemplate");
	private static Log log = new Log(DBUtil.class);
	
	public static int deleteFromTable(String tableName, String keyName) {
		String sql = "DELETE FROM " + tableName + " WHERE mobile=?";
		int count = jdbcTemplate.update(sql, keyName);
		log.info("从表 : " + tableName +  " 删除记录,共计 : " + count + "条...");
		return count;
	}
}
