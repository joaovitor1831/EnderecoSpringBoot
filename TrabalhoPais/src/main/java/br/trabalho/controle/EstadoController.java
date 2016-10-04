
package br.trabalho.controle;

import br.com.trabalho.model.Estado;
import br.com.trabalho.model.services.EstadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author joao vitor
 */
@RequestMapping(value = "/api/estados",produces = MediaType.APPLICATION_JSON_VALUE)
public class EstadoController {
  
    @Autowired
    private EstadoServices services;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Estado get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Estado post(Estado estado ){
        return services.create(estado);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Estado put(Estado estado){
        return services.update(estado);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Estado  estado = services.findById(id);
        services.delete(estado);
    }   
}
