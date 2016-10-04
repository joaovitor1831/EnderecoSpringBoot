
package br.com.trabalho.repository;

import br.com.trabalho.model.Pais;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 *
 * @author Tiago
 */
@RepositoryRestResource(collectionResourceRel = "pais", path = "paises") 
public interface PaisRepository extends CrudRepository<Pais, Long> {
    
    @Query("SELECT p.nome FROM Pais p where p.id = :id") 
    Pais  findByNome(String nome);
    
    
}
