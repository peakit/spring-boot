package com.peakit.business;

import java.math.BigDecimal;

import com.peakit.dao.Datasource;
import com.peakit.dao.SimpleDatasource;
import com.peakit.domain.Course;
import com.peakit.domain.Learner;

public class AfterDiscountCostCalculator implements CostCalculator {

	private Datasource ds = new SimpleDatasource();

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

}
