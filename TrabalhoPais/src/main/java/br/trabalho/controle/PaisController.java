
package br.trabalho.controle;

import br.com.trabalho.model.Pais;
import br.com.trabalho.model.services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joao vitor
 */
@RestController
@RequestMapping(value = "/api/pais",produces = MediaType.APPLICATION_JSON_VALUE)
public class PaisController {
    
    @Autowired
    private PaisServices services;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pais get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Pais post(Pais pais ){
        return services.create(pais);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Pais put(Pais pais){
        return services.update(pais);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Pais  pais = services.findById(id);
        services.delete(pais);
    } 
}
