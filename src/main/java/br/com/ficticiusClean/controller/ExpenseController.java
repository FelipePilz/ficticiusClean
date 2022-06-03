package br.com.ficticiusClean.controller;

import br.com.ficticiusClean.model.Expense;
import br.com.ficticiusClean.model.Ranking;
import br.com.ficticiusClean.service.ExpenseService;
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
	public List<Ranking> calculateExpense(@RequestBody Expense expense)
	{
		return expenseService.calculateExpense(expense);
	}
}
