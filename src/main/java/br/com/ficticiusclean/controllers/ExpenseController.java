package br.com.ficticiusclean.controllers;

import br.com.ficticiusclean.models.dtos.ExpenseDataDto;
import br.com.ficticiusclean.models.dtos.VehiclePerformanceDto;
import br.com.ficticiusclean.services.ExpenseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expense")
public class ExpenseController
{
	@Autowired
	private ExpenseService expenseService;

	@PostMapping
	public List<VehiclePerformanceDto> calculateExpense(@RequestBody ExpenseDataDto expenseDataDto)
	{
		return expenseService.calculateExpense(expenseDataDto);
	}
}
