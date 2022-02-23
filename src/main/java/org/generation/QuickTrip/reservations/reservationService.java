package org.generation.QuickTrip.reservations;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service

public class reservationService {
    public final ArrayList<reservation> lista = new ArrayList<reservation>();
    
    public reservationService(){

        lista.add(new reservation(3, "02mar22", 600.5));

        lista.add(new reservation(2, "13abr22", 1000));

        lista.add(new reservation(1, "2abr22", 400));
    }

    public ArrayList<reservation> getReservations(){
        return lista;
    }//getReservations

    public reservation getReservation(Long reservationId){
        reservation tmpReservation = null;
		for (reservation r : lista) {
			if(r.getId() == reservationId){
				tmpReservation = r;
			}//if
		}//for each
		return tmpReservation;
	}//getTour

    public void deleteReservation(Long reservationId) {
		for (reservation r : lista) {
			if(r.getId() == reservationId){
				lista.remove(r);
                break;
			}//if
		}//for eachfor each
	}
}
