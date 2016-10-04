
package br.com.trabalho.model.services;

import br.com.trabalho.model.Logradouro;
import java.util.Collection;

/**
 *
 * @author joao vitor
 */
public interface LogradouroServices {
    
    Logradouro findById(Long id);
    
    Collection<Logradouro> findAll();
    
    Logradouro create(Logradouro logradouro);
    
    Logradouro update(Logradouro logradouro);
    
    void delete(Logradouro logradouro);
 
}
