package com.financial.investment_api.investment.dto;

import java.math.*;
import java.time.*;

public record InvestimentoResponse(
        Long id,
        String nomeAtivo,
        BigDecimal valorInvestido,
        BigDecimal taxa,
        LocalDate dataAplicacao,
        LocalDate dataVencimento,
        String status,
        String usuarioNome,
        String tipoInvestimentoNome
) {
}
