package com.financial.investment_api.investment.repository;

import com.financial.investment_api.investment.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
    Optional<Investimento> findByIdAndUsuarioId(Long id, Long usuarioId);
}
