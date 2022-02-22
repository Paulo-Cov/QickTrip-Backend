package org.generation.QuickTrip.tour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/tour/")
public class tourController {

    private final tourService tService;

    @Autowired
	public tourController(tourService tService) {
		this.tService = tService;
	}//constructor
    @GetMapping
    public List<tour> getTour(){
        return tService.getTours();
    }//getTour

    @GetMapping(path = "{tourId}")
    public tour getTours(@PathVariable("tourId") Long tourId){
		return tService.getTour(tourId);
		
	}//getTours
    
    @DeleteMapping(path="{tourId}")
	public void deleteTour(@PathVariable("tourId") Long tourId) {
		tService.deleteTour(tourId);
	}//deleteTour
	
	@PostMapping
	public void addTour() {
		
	}//addTour
	
	@PutMapping
	public void updateTour() {
		
	}

}