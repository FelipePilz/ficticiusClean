package br.com.ficticiusClean.model;

import java.time.Year;
import lombok.Data;

@Data
public class Ranking
{
	private String name;
	private String brand;
	private String model;
	private Year manufacturingDate;
	private Integer totalFuel;
	private Integer totalValue;
}
