
package com.portfolio.federico.Interface;

import com.portfolio.federico.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar un usuario por ID
    public Persona findPersona(Long id);
}
