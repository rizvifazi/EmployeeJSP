package com.pack.EmployeeJSP;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Configuration
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeConfig {
	private Long id;
	private String name;
	private Integer age;
	private String department;
	private Double salary;
}
