
package com.portfolioRiccitelli.rer.Security.Repository;

import com.portfolioRiccitelli.rer.Security.Entity.Rol;
import com.portfolioRiccitelli.rer.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rricc
 */
@Repository

public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
