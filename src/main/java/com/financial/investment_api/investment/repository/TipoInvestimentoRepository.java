package com.financial.investment_api.investment.repository;

import com.financial.investment_api.investment.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface TipoInvestimentoRepository extends JpaRepository<TipoInvestimento, Long> {
        Optional<TipoInvestimento> findById(Long id);
}
