package com.stefanini.demoFG;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.stefanini.fg.sincronizaorden.controller.SincronizaOrdenController;
import com.stefanini.fg.sincronizaorden.service.SincronizaOrdenService;

@SpringBootTest
@SpringBootConfiguration
public class SincronizaOrdenControllerTest {
	
	private MockMvc mockMvc;

    @Mock
    private SincronizaOrdenService coService;

    @InjectMocks
    private SincronizaOrdenController coController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(coController).build();
    }

    @Test
    public void testSincronizaOrden() throws Exception {
    	
    	CompletableFuture<String> valueFuture =
    	        CompletableFuture.completedFuture(new String());
    	
        when(coService.llamaServicioSincronizaInformacion("")).thenReturn(valueFuture);

        mockMvc.perform(post("/sincronizaOrden/hola"))
               .andExpect(status().isOk());
    }

}
