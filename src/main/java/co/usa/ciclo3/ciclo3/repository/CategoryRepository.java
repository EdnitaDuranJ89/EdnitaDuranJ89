
package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.modelo.Category;
import co.usa.ciclo3.ciclo3.modelo.CategoryCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;



@Repository
public class CategoryRepository {
    
    @Autowired
    private CategoryCrud categoryCrudRepository;
    
    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    
    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }
    
    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }
    
}



 