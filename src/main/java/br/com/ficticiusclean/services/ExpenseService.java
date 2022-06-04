package br.com.ficticiusclean.services;

import br.com.ficticiusclean.models.dtos.ExpenseDataDto;
import br.com.ficticiusclean.models.dtos.VehiclePerformanceDto;
import java.util.List;

public interface ExpenseService
{
	List<VehiclePerformanceDto> calculateExpense(ExpenseDataDto expenseDataDto);
}
