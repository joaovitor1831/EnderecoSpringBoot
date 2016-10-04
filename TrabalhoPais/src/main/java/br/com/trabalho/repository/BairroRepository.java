
package br.com.trabalho.repository;

import br.com.trabalho.model.Bairro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author joao vitor
 */
@RepositoryRestResource(collectionResourceRel = "bairro", path = "bairros")
public interface BairroRepository extends CrudRepository<Bairro, Long> {
    @Query("SELECT b.nome FROM Bairro b where b.id = :id") 
    Bairro findByNome(String nome);
}
