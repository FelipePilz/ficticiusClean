package br.com.ficticiusclean.models.dtos;

import java.math.BigDecimal;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDataDto
{
	@Column(nullable = false)
	private BigDecimal gasPrice;

	@Column(nullable = false)
	private BigDecimal kmInCity;

	@Column(nullable = false)
	private BigDecimal kmInHighway;
}
