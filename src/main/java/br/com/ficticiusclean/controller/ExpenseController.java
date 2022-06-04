package br.com.ficticiusclean.controller;

import br.com.ficticiusclean.model.ExpenseData;
import br.com.ficticiusclean.model.Ranking;
import br.com.ficticiusclean.service.ExpenseService;
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
	public List<Ranking> calculateExpense(@RequestBody ExpenseData expenseData)
	{
		return expenseService.calculateExpense(expenseData);
	}
}
