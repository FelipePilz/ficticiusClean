package br.com.ficticiusclean.models;

import java.time.Year;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 255)
	private String name;

	@Column(nullable = false, length = 255)
	private String brand;

	@Column(nullable = false, length = 255)
	private String model;

	@Column(nullable = false, length = 4)
	private Year manufacturingYear;

	@Column(nullable = false, length = 10)
	private Integer averageConsumptionInCity;

	@Column(nullable = false, length = 10)
	private Integer averageConsumptionInHighways;
}
