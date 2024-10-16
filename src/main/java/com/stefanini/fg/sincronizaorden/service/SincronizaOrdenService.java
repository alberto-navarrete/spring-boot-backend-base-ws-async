package com.stefanini.fg.sincronizaorden.service;

import java.util.concurrent.CompletableFuture;

public interface SincronizaOrdenService {

	public CompletableFuture<String> llamaServicioSincronizaInformacion(String input);
	
}
