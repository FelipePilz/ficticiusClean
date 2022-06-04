package br.com.ficticiusclean.model;

import javax.persistence.Column;
import lombok.Data;

@Data
public class Expense
{
	@Column
	private Integer gasPrice;

	@Column
	private Integer kmInCity;

	@Column
	private Integer kmInHighway;
}
