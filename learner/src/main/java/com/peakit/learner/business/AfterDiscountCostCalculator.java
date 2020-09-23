package com.peakit.learner.business;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.peakit.learner.dao.Datasource;
import com.peakit.learner.domain.Course;
import com.peakit.learner.domain.Learner;

public class AfterDiscountCostCalculator implements CostCalculator {

	@Autowired
	private Datasource ds;

	@Override
	public BigDecimal calculateCost(Learner learner, Course course) {
		BigDecimal courseFee = course.getFees();
		BigDecimal totalCost = courseFee;

		Double discPct = ds.getSaleDayDiscount();
		if (discPct != null) {
			totalCost = courseFee.subtract(courseFee.multiply(BigDecimal.valueOf(discPct)));
		}
		return totalCost;
	}

	public void setDs(Datasource ds) {
		this.ds = ds;
	}

}
