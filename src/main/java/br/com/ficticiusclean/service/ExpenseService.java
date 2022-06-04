package br.com.ficticiusclean.service;

import br.com.ficticiusclean.model.ExpenseData;
import br.com.ficticiusclean.model.Ranking;
import java.util.List;

public interface ExpenseService
{
	List<Ranking> calculateExpense(ExpenseData expenseData);
}
