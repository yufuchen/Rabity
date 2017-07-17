package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class UpdateEverydayMissionInfoInputEntity extends InputEntity {
	List<UpdateEverydayMissionInfoInputItemEntity> items;

	public List<UpdateEverydayMissionInfoInputItemEntity> getItems() {
		return items;
	}

	public void setItems(List<UpdateEverydayMissionInfoInputItemEntity> items) {
		this.items = items;
	}
}
