
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.modelo.Reservation;
import co.usa.ciclo3.ciclo3.repository.ReservationRepository;
    
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    
    public List<Reservation> getAll() {
        return (List<Reservation>) reservationRepository.getAll();
    }
  
    public Optional<Reservation> getReservation(int id) {
        return reservationRepository.getReservation(id);
        }
  
    public Reservation save(Reservation reservation) { 
        if (reservation.getIdReservation()== null){
            return reservationRepository.save(reservation);
        }
        else
        {
            Optional<Reservation> co =  reservationRepository.getReservation(reservation.getIdReservation());
            if (co.isEmpty()){
                return reservationRepository.save(reservation);
            }
            else
            {
                return reservation;
            }
        }
 
    }
    
}