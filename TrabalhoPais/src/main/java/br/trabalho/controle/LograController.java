
package br.trabalho.controle;

import br.com.trabalho.model.Logradouro;
import br.com.trabalho.model.services.LogradouroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author joao vitor
 */
@RequestMapping(value = "/api/logradouro",produces = MediaType.APPLICATION_JSON_VALUE)
public class LograController {
    
      @Autowired
    private LogradouroServices services;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Logradouro get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Logradouro post(Logradouro l ){
        return services.create(l);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Logradouro put(Logradouro l){
        return services.update(l);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Logradouro l = services.findById(id);
        services.delete(l);
    }
    
}
