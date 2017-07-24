package main.java.com.interf.eyee.utils.assertutils;

/**
 * @author Ksewen
 *
 */
public interface BaseAssertUtil {
	public abstract void assertCode(long actual, long expect);
	public abstract void assertMsg(String actual, String expect);
	public abstract void assertData(Object actual, Object expect);
	
}
