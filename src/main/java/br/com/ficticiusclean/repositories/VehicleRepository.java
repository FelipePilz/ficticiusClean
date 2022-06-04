package br.com.ficticiusclean.repositories;

import br.com.ficticiusclean.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
}
