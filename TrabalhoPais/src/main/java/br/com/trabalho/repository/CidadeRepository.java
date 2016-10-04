
package br.com.trabalho.repository;

import br.com.trabalho.model.Cidade;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author joao vitor
 */
@RepositoryRestResource(collectionResourceRel = "cidade", path = "cidades")
public interface CidadeRepository extends CrudRepository<Cidade, Long>{
    @Query("SELECT c.nome FROM Cidade c where c.id = :id") 
    Cidade  findByNome(String nome);
}
