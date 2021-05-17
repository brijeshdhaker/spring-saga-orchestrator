/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.eventhandlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import sample.multimodule.dto.OrchestratorRequestDTO;
import sample.multimodule.dto.OrchestratorResponseDTO;
import sample.multimodule.service.impl.OrderEventUpdateService;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class OrderEventHandler {

    @Autowired
    private DirectProcessor<OrchestratorRequestDTO> source;

    @Autowired
    private OrderEventUpdateService service;

    @Bean
    public Supplier<Flux<OrchestratorRequestDTO>> supplier(){
        return () -> Flux.from(source);
    };

    @Bean
    public Consumer<Flux<OrchestratorResponseDTO>> consumer(){
        return (flux) -> flux.subscribe(responseDTO -> this.service.updateOrder(responseDTO));
    };

}