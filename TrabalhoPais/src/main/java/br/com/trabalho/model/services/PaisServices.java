
package br.com.trabalho.model.services;

import br.com.trabalho.model.Pais;
import java.util.Collection;

/**
 *
 * @author joao vitor
 */
public interface PaisServices {
    
    Pais findById(Long id);
    
    Collection<Pais> findAll();
    
    Pais create(Pais pais);
    
    Pais update(Pais pais);
    
    void delete(Pais pais);
  
}
