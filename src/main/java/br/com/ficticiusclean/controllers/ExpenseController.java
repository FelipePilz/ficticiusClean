package br.com.ficticiusclean.controllers;

import br.com.ficticiusclean.models.ExpenseData;
import br.com.ficticiusclean.models.VehiclePerfomance;
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
	public List<VehiclePerfomance> calculateExpense(@RequestBody ExpenseData expenseData)
	{
		return expenseService.calculateExpense(expenseData);
	}
}
