
package br.com.trabalho.repository;

import br.com.trabalho.model.Estado;
import br.com.trabalho.model.Pais;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author joao vitor
 */
@RepositoryRestResource(collectionResourceRel = "estado", path = "estados")
public interface EstadoRepository extends CrudRepository<Estado, Long> {
    
    @Query("SELECT es.nome  FROM Estado es where es.id = :id") 
    Estado  findByNome(String nome);
    
    
    
}
