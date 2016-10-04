
package br.trabalho.controle;

import br.com.trabalho.model.Endereco;
import br.com.trabalho.model.services.EnderecoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author joao vitor
 */
@RequestMapping(value = "/api/endereco",produces = MediaType.APPLICATION_JSON_VALUE)
public class EnderecoController {
    
    
      @Autowired
    private EnderecoServices services;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Endereco get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Endereco post(Endereco end ){
        return services.create(end);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Endereco put(Endereco end){
        return services.update(end);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Endereco end = services.findById(id);
        services.delete(end);
    }   
}
