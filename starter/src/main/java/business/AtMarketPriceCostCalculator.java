package business;

import java.math.BigDecimal;

import domain.Course;
import domain.Learner;

public class AtMarketPriceCostCalculator implements CostCalculator {

	@Override
	public BigDecimal calculateCost(Learner learner, Course course) {
		return course.getFees();
	}

}
