package br.com.ficticiusclean.services;

import br.com.ficticiusclean.models.ExpenseData;
import br.com.ficticiusclean.models.VehiclePerfomance;
import java.util.List;

public interface ExpenseService
{
	List<VehiclePerfomance> calculateExpense(ExpenseData expenseData);
}
