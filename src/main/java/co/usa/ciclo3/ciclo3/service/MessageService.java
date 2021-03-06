
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.modelo.Message;
import co.usa.ciclo3.ciclo3.repository.MessageRepository;
    
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;
    
    public List<Message> getAll() {
        return (List<Message>) messageRepository.getAll();
    }
  
    public Optional<Message> getMessage(int id) {
        return messageRepository.getMessage(id);
        }
  
    public Message save(Message message) { 
        if (message.getIdMessage()== null){
            return messageRepository.save(message);
        }
        else
        {
            Optional<Message> co =  messageRepository.getMessage(message.getIdMessage());
            if (co.isEmpty()){
                return messageRepository.save(message);
            }
            else
            {
                return message;
            }
        }
 
    }
    
}