package br.com.ficticiusclean.services.impl;

import br.com.ficticiusclean.models.ExpenseData;
import br.com.ficticiusclean.models.VehiclePerfomance;
import br.com.ficticiusclean.models.Vehicle;
import br.com.ficticiusclean.repositories.VehicleRepository;
import br.com.ficticiusclean.services.ExpenseService;
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
	public List<VehiclePerfomance> calculateExpense(ExpenseData expenseData)
	{
		List<Vehicle> vehicleList = vehicleRepository.findAll();

		if (!vehicleList.isEmpty())
		{
			List<VehiclePerfomance> vehiclePerfomanceList = new ArrayList<>();
			for (Vehicle vehicle : vehicleList)
			{
				VehiclePerfomance vehiclePerfomance = new VehiclePerfomance();

				Integer totalFuel = expenseData.getKmInCity() / vehicle.getAverageConsumptionInCity()
					+ expenseData.getKmInHighway() / vehicle.getAverageConsumptionInHighways();
				Integer totalValue = totalFuel * expenseData.getGasPrice();

				vehiclePerfomance.setName(vehicle.getName());
				vehiclePerfomance.setBrand(vehicle.getBrand());
				vehiclePerfomance.setModel(vehicle.getModel());
				vehiclePerfomance.setManufacturingYear(vehicle.getManufacturingYear());
				vehiclePerfomance.setTotalFuel(totalFuel);
				vehiclePerfomance.setTotalValue(totalValue);
				vehiclePerfomanceList.add(vehiclePerfomance);
			}
			return vehiclePerfomanceList;
		}
		return Collections.emptyList();
	}
}
