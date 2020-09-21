package dao;

import java.math.BigDecimal;

public interface Datasource {

	void createCourse(Integer id, String name, String description, BigDecimal cost);

	void addLearner(Integer id, String firstName, String lastName);

	void addSaleDayDiscount(Double discountPct);

	Double getSaleDayDiscount();
}
