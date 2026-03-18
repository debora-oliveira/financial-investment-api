package com.financial.investment_api.user.entity;

import com.financial.investment_api.investment.entity.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cpf;

    private LocalDateTime dataCriacao;

    @OneToMany(mappedBy = "usuario")
    private List<Investimento> investimentos;

}
