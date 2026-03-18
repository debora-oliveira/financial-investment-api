package com.financial.investment_api.investment.mapper;

import com.financial.investment_api.investment.dto.*;
import com.financial.investment_api.investment.entity.*;

public class InvestimentoMapper {

    public static InvestimentoResponse toResponseDTO(Investimento investimento) {
        return new InvestimentoResponse(
                investimento.getId(),
                investimento.getNomeAtivo(),
                investimento.getValorInvestido(),
                investimento.getTaxa(),
                investimento.getDataAplicacao(),
                investimento.getDataVencimento(),
                investimento.getStatus().name(),
                investimento.getUsuario().getNome(),
                investimento.getTipoInvestimento().getNome()
        );
    }
}