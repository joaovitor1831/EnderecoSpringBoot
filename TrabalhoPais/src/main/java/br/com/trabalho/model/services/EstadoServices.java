package br.com.trabalho.model.services;

import br.com.trabalho.model.Estado;
import java.util.Collection;

/**
 *
 * @author joao vitor
 */
public interface EstadoServices {
    
    Estado findById(Long id);
    
    Collection<Estado> findAll();
    
    Estado create(Estado estado);
    
    Estado update(Estado estado);
    
    void delete(Estado estado);

    
}
