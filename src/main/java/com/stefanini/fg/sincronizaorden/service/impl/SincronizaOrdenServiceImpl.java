package com.stefanini.fg.sincronizaorden.service.impl;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.stefanini.fg.sincronizaorden.service.SincronizaOrdenService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SincronizaOrdenServiceImpl implements SincronizaOrdenService {

	@Async
	@Override
	public CompletableFuture<String> llamaServicioSincronizaInformacion(String input) {
		
		log.info("Ejecutando el método asincrónicamente con la entrada: {}", input);
        
        try {
        	//TODO AQUI LLAMA AL SERVICIO
            // Simulamos una tarea larga ( llamada a API )
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        log.info("Método finalizado para el input: {}", input);
        
        return CompletableFuture.completedFuture("Resultado para: " + input);
    }
	
}
