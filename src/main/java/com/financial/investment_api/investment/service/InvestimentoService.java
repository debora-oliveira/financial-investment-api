package com.financial.investment_api.investment.service;

import com.financial.investment_api.enums.*;
import com.financial.investment_api.investment.dto.*;
import com.financial.investment_api.investment.entity.*;
import com.financial.investment_api.investment.mapper.*;
import com.financial.investment_api.investment.repository.*;
import com.financial.investment_api.user.entity.*;
import com.financial.investment_api.user.repository.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class InvestimentoService {

    private final InvestimentoRepository investimentoRepository;
    private final UsuarioRepository usuarioRepository;
    private final TipoInvestimentoRepository tipoInvestimentoRepository;

    public InvestimentoResponse criarInvestimento(InvestimentoRequest investimentoRequest) {
        Usuario investidor = usuarioRepository.findById(investimentoRequest.usuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        TipoInvestimento tipoInvestimento = tipoInvestimentoRepository.findById(investimentoRequest.tipoInvestimentoId())
                .orElseThrow(() -> new RuntimeException("Tipo de investimento não encontrado"));

        Investimento investimento = new Investimento();
        investimento.setUsuario(investidor);
        investimento.setTipoInvestimento(tipoInvestimento);
        investimento.setNomeAtivo(investimentoRequest.nomeAtivo());
        investimento.setValorInvestido(investimentoRequest.valorInvestido());
        investimento.setTaxa(investimentoRequest.taxa());
        investimento.setDataAplicacao(investimentoRequest.dataAplicacao());
        investimento.setDataVencimento(investimentoRequest.dataVencimento());
        investimento.setStatus(StatusInvestimento.valueOf(investimentoRequest.status()));

        Investimento investimentoSalvo = investimentoRepository.save(investimento);

        return InvestimentoMapper.toResponseDTO(investimentoSalvo);
    }

}
