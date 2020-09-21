package business;

import java.math.BigDecimal;

import domain.Course;
import domain.Learner;

public interface CostCalculator {

	BigDecimal calculateCost(Learner learner, Course course);
}
