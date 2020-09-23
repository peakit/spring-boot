package com.peakit.learner.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.peakit.learner.domain.Course;
import com.peakit.learner.domain.Learner;

@Component
public class SimpleDatasource implements Datasource {

	private Set<Learner> learners = new HashSet<>();
	private Set<Course> courses = new HashSet<>();
	private Map<Learner, Set<Course>> subscriptions = new HashMap<>();
	private Double discountPct = null;

	@Override
	public void createCourse(Integer id, String name, String description, BigDecimal cost) {
		Course course = new Course(id, name, description, cost);
		courses.add(course);
	}

	@Override
	public void addLearner(Integer id, String firstName, String lastName) {
		Learner learner = new Learner(id, firstName, lastName);
		learners.add(learner);
	}

	@Override
	public void addSaleDayDiscount(Double discountPct) {
		if (discountPct != null) {
			this.discountPct = discountPct;
		}
	}

	@Override
	public Double getSaleDayDiscount() {
		return discountPct;
	}

	@Override
	public void subscribe(Learner learner, Course course) {
		Set<Course> existingCourses = subscriptions.get(learner);
		if (CollectionUtils.isEmpty(existingCourses)) {
			existingCourses = new HashSet<>();
		}
		existingCourses.add(course);
	}

}
