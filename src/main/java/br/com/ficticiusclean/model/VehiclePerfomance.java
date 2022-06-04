package br.com.ficticiusclean.model;

import java.time.Year;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiclePerfomance
{
	@Column(nullable = false, length = 255)
	private String name;

	@Column(nullable = false, length = 255)
	private String brand;

	@Column(nullable = false, length = 255)
	private String model;

	@Column(nullable = false, length = 4)
	private Year manufacturingYear;

	@Column(nullable = false, length = 30)
	private Integer totalFuel;

	@Column(nullable = false, length = 30)
	private Integer totalValue;
}
