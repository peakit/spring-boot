package com.peakit.api;

import java.math.BigDecimal;

import com.peakit.dao.Datasource;

public class CourseServiceImpl implements CourseService {

	private Datasource ds;

	@Override
	public void addCourse(Integer id, String name, String description, BigDecimal fees) {
		ds.createCourse(id, name, description, fees);
	}

}
