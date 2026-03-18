package com.financial.investment_api.investment.entity;

import com.financial.investment_api.enums.*;
import com.financial.investment_api.user.entity.*;
import jakarta.persistence.*;
import lombok.*;

import java.math.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "tipo_investimento_id")
    private TipoInvestimento tipoInvestimento;

    private String nomeAtivo;

    private BigDecimal valorInvestido;

    private BigDecimal taxa;

    private LocalDate dataAplicacao;

    private LocalDate dataVencimento;

    @Enumerated(EnumType.STRING)
    private StatusInvestimento status;
}
