package br.com.ficticiusclean.models;

import java.math.BigDecimal;
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

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String brand;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private Year manufacturingYear;

	@Column(nullable = false)
	private BigDecimal averageCityConsumption;

	@Column(nullable = false)
	private BigDecimal averageHighwayConsumption;
}
