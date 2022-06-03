package br.com.ficticiusClean.service;

import br.com.ficticiusClean.model.Expense;
import br.com.ficticiusClean.model.Ranking;
import java.util.List;

public interface ExpenseService
{
	List<Ranking> calculateExpense(Expense expense);
}
