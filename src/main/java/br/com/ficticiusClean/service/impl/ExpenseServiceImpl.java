package br.com.ficticiusClean.service.impl;

import br.com.ficticiusClean.model.Expense;
import br.com.ficticiusClean.model.Ranking;
import br.com.ficticiusClean.model.Vehicle;
import br.com.ficticiusClean.repository.VehicleRepository;
import br.com.ficticiusClean.service.ExpenseService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService
{

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public List<Ranking> calculateExpense(Expense expense)
	{
		List<Vehicle> vehicleList = vehicleRepository.findAll();

		if (!vehicleList.isEmpty())
		{
			List<Ranking> rankingList = new ArrayList<>();
			for (Vehicle vehicle : vehicleList)
			{
				Ranking ranking = new Ranking();

				Integer totalFuel = expense.getKmInCity() / vehicle.getAverageConsumptionInCity()
					+ expense.getKmInHighway() / vehicle.getAverageConsumptionInHighways();
				Integer totalValue = totalFuel * expense.getGasPrice();

				ranking.setName(vehicle.getName());
				ranking.setBrand(vehicle.getBrand());
				ranking.setModel(vehicle.getModel());
				ranking.setManufacturingDate(vehicle.getManufacturingDate());
				ranking.setTotalFuel(totalFuel);
				ranking.setTotalValue(totalValue);
				rankingList.add(ranking);
			}
			return rankingList;
		}
		return Collections.emptyList();
	}
}
