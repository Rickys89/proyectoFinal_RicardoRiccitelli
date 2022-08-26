package com.portfolioRiccitelli.rer.Service;

import com.portfolioRiccitelli.rer.Entity.Persona;
import com.portfolioRiccitelli.rer.Interface.IPersonaService;
import com.portfolioRiccitelli.rer.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImplementacionPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonarepository;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonarepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonarepository.findById(id). orElse(null);
        return persona;
    }
    
}
