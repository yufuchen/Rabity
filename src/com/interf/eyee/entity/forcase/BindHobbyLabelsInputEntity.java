package com.interf.eyee.entity.forcase;
/**
 * @author Ksewen
 *
 */

import java.util.List;

import com.interf.eyee.entity.InputEntity;

public class BindHobbyLabelsInputEntity extends InputEntity {
	private List<BindHobbyLabelsItemEntity> hobbylabels;

	public List<BindHobbyLabelsItemEntity> getHobbylabels() {
		return hobbylabels;
	}

	public void setHobbylabels(List<BindHobbyLabelsItemEntity> hobbylabels) {
		this.hobbylabels = hobbylabels;
	}
}
