package com.financial.investment_api.investment.repository;

import com.financial.investment_api.investment.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
        Optional<Investimento> findById(Long id);
}
