package org.generation.QuickTrip.reservations;

public class reservation {
    private Long id;
    private int numReservations;
    private String date;
    private double totalPrice;
    
	public reservation(int numReservations, String date, double totalPrice) {
		super();
		this.numReservations = numReservations;
		this.date = date;
		this.totalPrice = totalPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumReservations() {
		return numReservations;
	}

	public void setNumReservations(int numReservations) {
		this.numReservations = numReservations;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
    
    
    

}