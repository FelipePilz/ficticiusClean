package br.com.ficticiusclean.models.dtos;

import java.math.BigDecimal;
import java.time.Year;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiclePerformanceDto
{
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String brand;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private Year manufacturingYear;

	@Column(nullable = false)
	private BigDecimal totalFuelUsed;

	@Column(nullable = false)
	private BigDecimal totalFuelValue;
}
