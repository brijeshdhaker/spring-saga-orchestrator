/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.configs;

/**
 *
 * @author brijeshdhaker
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import sample.multimodule.dto.OrchestratorRequestDTO;

@Configuration
public class OrderConfig {

    @Bean
    public DirectProcessor<OrchestratorRequestDTO> publisher(){
        return DirectProcessor.create();
    }

    @Bean
    public FluxSink<OrchestratorRequestDTO> sink(DirectProcessor<OrchestratorRequestDTO> publisher){
        return publisher.sink();
    }

}