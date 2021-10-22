
package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.modelo.Client;
import co.usa.ciclo3.ciclo3.modelo.ClientCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;



@Repository
public class ClientRepository {
    
    @Autowired
    private ClientCrud categoryCrudRepository;
    
    public List<Client> getAll(){
        return (List<Client>) categoryCrudRepository.findAll();
    }
    
    public Optional<Client> getClient(int id){
        return categoryCrudRepository.findById(id);
    }
    
    public Client save(Client p){
        return categoryCrudRepository.save(p);
    }
    
}