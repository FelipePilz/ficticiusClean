package br.com.ficticiusclean.controller;

import br.com.ficticiusclean.model.Vehicle;
import br.com.ficticiusclean.repository.VehicleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController
{

	@Autowired
	private VehicleRepository vehicleRepository;

	@GetMapping
	public List<Vehicle> vehicleList()
	{
		return vehicleRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}
}
