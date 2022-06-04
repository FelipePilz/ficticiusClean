package br.com.ficticiusclean.models;

import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseData
{
	@Column(nullable = false, length = 10)
	private Integer gasPrice;

	@Column(nullable = false, length = 10)
	private Integer kmInCity;

	@Column(nullable = false, length = 10)
	private Integer kmInHighway;
}
