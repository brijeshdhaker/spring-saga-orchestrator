/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.service;

import sample.multimodule.dto.PaymentResponseDTO;
import sample.multimodule.dto.request.PaymentRequestDTO;

/**
 *
 * @author brijeshdhaker
 */
public interface PaymentService {

    void credit(final PaymentRequestDTO requestDTO);

    PaymentResponseDTO debit(final PaymentRequestDTO requestDTO);
    
}
