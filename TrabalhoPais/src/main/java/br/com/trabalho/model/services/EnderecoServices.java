
package br.com.trabalho.model.services;

import br.com.trabalho.model.Endereco;
import java.util.Collection;

/**
 *
 * @author joao vitor
 */
public interface EnderecoServices {
    
    Endereco findById(Long id);
    
    Collection<Endereco> findAll();
    
    Endereco create(Endereco endereco);
    
    Endereco update(Endereco endereco);
    
    void delete(Endereco endereco);
  
}
