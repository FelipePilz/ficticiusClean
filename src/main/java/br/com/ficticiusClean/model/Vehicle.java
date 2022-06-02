package br.com.ficticiusClean.model;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
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
	private GregorianCalendar manufacturingDate;

	@Column(nullable = false)
	private BigDecimal averageConsumptionInCity;

	@Column(nullable = false)
	private BigDecimal averageConsumptionInHighways;
}
