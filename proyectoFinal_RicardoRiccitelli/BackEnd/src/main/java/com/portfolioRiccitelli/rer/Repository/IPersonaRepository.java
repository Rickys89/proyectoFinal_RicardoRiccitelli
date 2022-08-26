package com.portfolioRiccitelli.rer.Repository;

import com.portfolioRiccitelli.rer.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
