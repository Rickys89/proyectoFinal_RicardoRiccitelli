package com.portfolioRiccitelli.rer.Interface;

import com.portfolioRiccitelli.rer.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    //guardar objeto de tipo persona
    public void savePersona(Persona persona);
    //eliminar persona
    public void deletePersona(Long id);
    //buscar una persona por ID
    public Persona findPersona(Long id);
}
