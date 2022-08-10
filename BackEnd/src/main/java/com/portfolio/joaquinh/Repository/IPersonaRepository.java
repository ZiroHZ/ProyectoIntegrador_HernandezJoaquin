
package com.portfolio.joaquinh.Repository;

import com.portfolio.joaquinh.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
