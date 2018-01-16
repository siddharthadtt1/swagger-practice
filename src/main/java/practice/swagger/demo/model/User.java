package practice.swagger.demo.model;

import io.swagger.annotations.ApiModelProperty;

public class User {
	
	@ApiModelProperty(notes="name of the user")
	private String name;

	@ApiModelProperty(notes="salary of the user")
	private Long salary;
	
	public User(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", salary=" + salary + "]";
	}

}
