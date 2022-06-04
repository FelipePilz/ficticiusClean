package br.com.ficticiusclean.controller;

import br.com.ficticiusclean.exception.VehicleNotFoundException;
import br.com.ficticiusclean.model.Vehicle;
import br.com.ficticiusclean.repository.VehicleRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController
{

	@Autowired
	private VehicleRepository vehicleRepository;

	@GetMapping
	public List<Vehicle> getVehicleList()
	{
		return vehicleRepository.findAll();
	}

	@GetMapping("/{id}")
	public Vehicle getVehicleById(@PathVariable Long id)
	{
		Optional<Vehicle> vehicleFound = vehicleRepository.findById(id);
		if (!vehicleFound.isEmpty())
		{
			return vehicleFound.get();
		}
		throw new VehicleNotFoundException("Vehicle not found!");
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicle addVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicleRepository.save(vehicle);
	}

	@DeleteMapping("/{id}")
	public void deleteVehicleById(@PathVariable Long id)
	{
		vehicleRepository.deleteById(id);
	}
}
