package com.peakit.learner.dao;

import java.math.BigDecimal;

import com.peakit.learner.domain.Course;
import com.peakit.learner.domain.Learner;

public interface Datasource {

	void createCourse(Integer id, String name, String description, BigDecimal cost);

	void addLearner(Integer id, String firstName, String lastName);

	void subscribe(Learner learner, Course course);

	void addSaleDayDiscount(Double discountPct);

	Double getSaleDayDiscount();

}
