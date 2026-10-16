package com.sena.apiparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sena.apiparking.model.Tarifa;
import com.sena.apiparking.model.TipoVehiculo;

public interface TarifaRepository extends JpaRepository<Tarifa, Long> {

	@Query("select count(t) > 0 from Tarifa t where t.tipo = :tipo and t.vigenteHasta is null")
	boolean existsByTipoAndVigenteHastaIsNull(@Param("tipo") TipoVehiculo tipo);
}
