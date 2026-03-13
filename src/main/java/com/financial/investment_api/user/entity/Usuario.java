package com.financial.investment_api.user.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;
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

}
