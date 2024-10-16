package com.stefanini.fg.sincronizaorden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.fg.sincronizaorden.service.SincronizaOrdenService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/sincroniza")
public class SincronizaOrdenController {
	
	@Autowired
	SincronizaOrdenService cargaOrdenService;
	
    @Operation(summary = "Sincroniza Orden: Se encarga de RECIBIR la informacion de "
    		+ "las ordenes a las sucursales que corresponden y actualizar la Base de Datos "
    		+ "de la sucursal.")
    @PostMapping("/orden")
    public void sincronizaOrden(
    		@Parameter(description = "Orden a cargar") 
    		@RequestBody String orden) {
    	
    	log.info("Recibiendo solicitud de Sincronizacion de Orden ODEN RECIBIDA {}",orden);
    	
    	cargaOrdenService.llamaServicioSincronizaInformacion(orden);
    	
    }
}
