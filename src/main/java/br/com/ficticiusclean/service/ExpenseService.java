package br.com.ficticiusclean.service;

import br.com.ficticiusclean.model.ExpenseData;
import br.com.ficticiusclean.model.VehiclePerfomance;
import java.util.List;

public interface ExpenseService
{
	List<VehiclePerfomance> calculateExpense(ExpenseData expenseData);
}
