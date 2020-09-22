package com.peakit.dao;

import java.math.BigDecimal;

import com.peakit.domain.Course;
import com.peakit.domain.Learner;

public interface Datasource {

	void createCourse(Integer id, String name, String description, BigDecimal cost);

	void addLearner(Integer id, String firstName, String lastName);

	void subscribe(Learner learner, Course course);

	void addSaleDayDiscount(Double discountPct);

	Double getSaleDayDiscount();

}
