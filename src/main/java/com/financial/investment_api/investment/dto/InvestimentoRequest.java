package com.financial.investment_api.investment.dto;

import java.math.*;
import java.time.*;

public record InvestimentoRequest(
        Long usuarioId,
        Long tipoInvestimentoId,
        String nomeAtivo,
        BigDecimal valorInvestido,
        BigDecimal taxa,
        LocalDate dataAplicacao,
        LocalDate dataVencimento,
        String status
) {
}
