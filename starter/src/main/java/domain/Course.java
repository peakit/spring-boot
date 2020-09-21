package domain;

import java.math.BigDecimal;

public class Course {

	private Integer id;

	private String name;

	private String description;

	private BigDecimal fees;

	public Course(Integer id, String name, String description, BigDecimal fees) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.fees = fees;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getFees() {
		return fees;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

}
