package main.java.com.interf.eyee.entity;

/**
 * @author Ksewen
 *
 */
public class TestCaseEntity {
	private String api;
	private Integer id;
	private Integer assertType;
	private String name;
	private InputEntity input;
	private BaseLineEntity baseLine;

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InputEntity getInput() {
		return input;
	}

	public void setInput(InputEntity input) {
		this.input = input;
	}

	public BaseLineEntity getBaseLine() {
		return baseLine;
	}

	public void setBaseLine(BaseLineEntity baseLine) {
		this.baseLine = baseLine;
	}

	public Integer getAssertType() {
		return assertType;
	}

	public void setAssertType(Integer assertType) {
		this.assertType = assertType;
	}

}
