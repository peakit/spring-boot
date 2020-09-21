package dao;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import domain.Course;
import domain.Learner;

public class SimpleDatasource implements Datasource {

	private Set<Learner> learners = new HashSet<>();
	private Set<Course> courses = new HashSet<>();
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
			discountPct = this.discountPct;
		}
	}

	@Override
	public Double getSaleDayDiscount() {
		return discountPct;
	}

}
