
package br.com.trabalho.model.services;

import br.com.trabalho.model.Cidade;
import java.util.Collection;

/**
 *
 * @author joao vitor
 */
public interface CidadeServices {
    
    
    Cidade findById(Long id);
    
    Collection<Cidade> findAll();
    
    Cidade create(Cidade cidade);
    
    Cidade update(Cidade cidade);
    
    void delete(Cidade cidade);
  
}
