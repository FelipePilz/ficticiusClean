package br.com.ficticiusclean.services.impl;

import br.com.ficticiusclean.models.dtos.ExpenseDataDto;
import br.com.ficticiusclean.models.dtos.VehiclePerformanceDto;
import br.com.ficticiusclean.models.Vehicle;
import br.com.ficticiusclean.repositories.VehicleRepository;
import br.com.ficticiusclean.services.ExpenseService;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService
{

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public List<VehiclePerformanceDto> calculateExpense(ExpenseDataDto expenseDataDto)
	{
		List<Vehicle> vehicleList = vehicleRepository.findAll();

		if (!vehicleList.isEmpty())
		{
			List<VehiclePerformanceDto> vehiclePerformanceDtoList = new ArrayList<>();
			for (Vehicle vehicle : vehicleList)
			{
				VehiclePerformanceDto vehiclePerformanceDto = new VehiclePerformanceDto();

				BigDecimal totalCityFuel = BigDecimal.valueOf(0);
				BigDecimal totalHighwayFuel = BigDecimal.valueOf(0);

				if (expenseDataDto.getKmInCity().intValue() > 0)
				{
					totalCityFuel = expenseDataDto.getKmInCity()
						.divide(vehicle.getAverageCityConsumption(), 2, RoundingMode.HALF_EVEN);
				}

				if (expenseDataDto.getKmInHighway().intValue() > 0)
				{
					totalHighwayFuel = expenseDataDto.getKmInHighway()
						.divide(vehicle.getAverageHighwayConsumption(), 2, RoundingMode.HALF_EVEN);
				}

				BigDecimal totalFuel = totalCityFuel.add(totalHighwayFuel);
				BigDecimal totalValue = totalFuel.multiply(expenseDataDto.getGasPrice(), new MathContext(4));

				vehiclePerformanceDto.setName(vehicle.getName());
				vehiclePerformanceDto.setBrand(vehicle.getBrand());
				vehiclePerformanceDto.setModel(vehicle.getModel());
				vehiclePerformanceDto.setManufacturingYear(vehicle.getManufacturingYear());
				vehiclePerformanceDto.setTotalFuelUsed(totalFuel);
				vehiclePerformanceDto.setTotalFuelValue(totalValue);
				vehiclePerformanceDtoList.add(vehiclePerformanceDto);
			}

			Collections.sort(vehiclePerformanceDtoList,
				Comparator.comparing(VehiclePerformanceDto::getTotalFuelValue));
			return vehiclePerformanceDtoList;
		}
		return Collections.emptyList();
	}
}
