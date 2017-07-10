package com.interf.eyee.entity;

import java.util.List;

/**
 * @author Ksewen
 *
 */
public class BindHobbyLabelsEntity extends BaseEntity {
	private List<BindHobbyLabelsItemEntity> hobbylabels;

	public List<BindHobbyLabelsItemEntity> getHobbylabels() {
		return hobbylabels;
	}

	public void setHobbylabels(List<BindHobbyLabelsItemEntity> hobbylabels) {
		this.hobbylabels = hobbylabels;
	}




}
