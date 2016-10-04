
package br.com.trabalho.repository;

import br.com.trabalho.model.Endereco;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author joao vitor
 */
@RepositoryRestResource(collectionResourceRel = "endereco", path = "end")
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{
    @Query("SELECT en.observacao FROM Endereco en where en.id = :id") 
    Endereco findByNome(String nome);
}
