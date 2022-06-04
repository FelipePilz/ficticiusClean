package br.com.ficticiusclean.model;

import java.time.Year;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vehicle
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String brand;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private Year manufacturingDate;

	@Column(nullable = false)
	private Integer averageConsumptionInCity;

	@Column(nullable = false)
	private Integer averageConsumptionInHighways;
}
