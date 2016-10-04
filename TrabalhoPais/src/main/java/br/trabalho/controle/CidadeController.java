
package br.trabalho.controle;

import br.com.trabalho.model.Cidade;
import br.com.trabalho.model.services.CidadeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author joao vitor
 */
@RequestMapping(value = "/api/cidades",produces = MediaType.APPLICATION_JSON_VALUE)
public class CidadeController {
    
    
    @Autowired
    private CidadeServices services;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cidade get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Cidade post(Cidade cidade ){
        return services.create(cidade);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Cidade put(Cidade cidade){
        return services.update(cidade);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Cidade cidade = services.findById(id);
        services.delete(cidade);
    }   
}
