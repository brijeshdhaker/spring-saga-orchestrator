package sample.multimodule.configs;
/**
 *
 * @author brijeshdhaker
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import sample.multimodule.dto.OrchestratorRequestDTO;
import sample.multimodule.dto.OrchestratorResponseDTO;
import sample.multimodule.service.OrchestratorService;

import java.util.function.Function;

@Configuration
public class OrchestratorConfig {
    
    private static final Logger log = LoggerFactory.getLogger(OrchestratorConfig.class);
    
    @Autowired
    private OrchestratorService orchestratorService;

    @Bean
    public Function<Flux<OrchestratorRequestDTO>, Flux<OrchestratorResponseDTO>> processor(){
        return flux -> flux.flatMap(in_dto -> {
            System.out.println("Order DTO Request Received at @processor:flatMap ...for orderid : - " + in_dto.getOrderId());
            return this.orchestratorService.orderProduct(in_dto);
        }).doOnNext(out_dto -> {
            System.out.println("Order DTO Request Received at @processor:doOnNext ...for orderid : - " + out_dto.getOrderId());
            System.out.println("Status : " + out_dto.getStatus());
        });
    }
    
}
