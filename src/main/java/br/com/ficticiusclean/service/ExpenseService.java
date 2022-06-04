package br.com.ficticiusclean.service;

import br.com.ficticiusclean.model.Expense;
import br.com.ficticiusclean.model.Ranking;
import java.util.List;

public interface ExpenseService
{
	List<Ranking> calculateExpense(Expense expense);
}
