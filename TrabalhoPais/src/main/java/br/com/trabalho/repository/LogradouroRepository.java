
package br.com.trabalho.repository;

import br.com.trabalho.model.Logradouro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author joao vitor
 */
@RepositoryRestResource(collectionResourceRel = "logradouro", path = "logra")
public interface LogradouroRepository extends CrudRepository<Logradouro, Long> {
    @Query("SELECT l.alamedas FROM Logradouro l where l.id = :id") 
    Logradouro  findByNome(String nome);
}
