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
	
	public static int delete(String sql, String keyValue) {
		int count = jdbcTemplate.update(sql, keyValue);
		log.info("即将执行Sql : " + sql.substring(0, sql.length() - 1) + "\'" + keyValue + "\';");
		log.info("删除记录,共计 : " + count + "条...");
		return count;
	}
	
	public static String queryForString(String sql) {
		String str = jdbcTemplate.queryForObject(sql, String.class);
		log.info("即将执行Sql : " + sql + ";");
		log.info("查询结果  : " + str);
		return str;
	}
}