package com.sena.apiparking.dto;

import java.time.LocalDateTime;

import com.sena.api.parking.model.Tarifa;
import com.sena.api.parking.model.TipoVehiculo;

public record TarifaResponse(Long idTarifa, com.sena.apiparking.model.TipoVehiculo tipo, Long valorHora, Long valorFraccion,
		Integer fraccionMinutos, LocalDateTime vigenteDesde, LocalDateTime vigenteHasta, boolean vigente) {
	public static TarifaResponse de(com.sena.apiparking.model.Tarifa t) {
		return new TarifaResponse(t.getId_tarifa(), t.getTipo(), t.getValorHora(), t.getValorFraccion(),
				t.getFraccionMinutos(), t.getVigenteDesde(), t.getVigenteHasta(), t.getVigenteHasta() == null);

	}

}