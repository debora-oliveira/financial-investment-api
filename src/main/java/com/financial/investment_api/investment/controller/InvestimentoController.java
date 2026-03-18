package com.financial.investment_api.investment.controller;

import com.financial.investment_api.investment.dto.*;
import com.financial.investment_api.investment.entity.*;
import com.financial.investment_api.investment.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/investimentos")
@RequiredArgsConstructor
public class InvestimentoController {

    private final InvestimentoService investimentoService;

    @PostMapping
    public ResponseEntity<InvestimentoResponse> criarInvestimento(@RequestBody InvestimentoRequest investimentoRequest){

        InvestimentoResponse response = investimentoService.criarInvestimento(investimentoRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
