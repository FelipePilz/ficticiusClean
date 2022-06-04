package br.com.ficticiusclean.service.impl;

import br.com.ficticiusclean.model.ExpenseData;
import br.com.ficticiusclean.model.Ranking;
import br.com.ficticiusclean.model.Vehicle;
import br.com.ficticiusclean.repository.VehicleRepository;
import br.com.ficticiusclean.service.ExpenseService;
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
	public List<Ranking> calculateExpense(ExpenseData expenseData)
	{
		List<Vehicle> vehicleList = vehicleRepository.findAll();

		if (!vehicleList.isEmpty())
		{
			List<Ranking> rankingList = new ArrayList<>();
			for (Vehicle vehicle : vehicleList)
			{
				Ranking ranking = new Ranking();

				Integer totalFuel = expenseData.getKmInCity() / vehicle.getAverageConsumptionInCity()
					+ expenseData.getKmInHighway() / vehicle.getAverageConsumptionInHighways();
				Integer totalValue = totalFuel * expenseData.getGasPrice();

				ranking.setName(vehicle.getName());
				ranking.setBrand(vehicle.getBrand());
				ranking.setModel(vehicle.getModel());
				ranking.setManufacturingYear(vehicle.getManufacturingYear());
				ranking.setTotalFuel(totalFuel);
				ranking.setTotalValue(totalValue);
				rankingList.add(ranking);
			}
			return rankingList;
		}
		return Collections.emptyList();
	}
}