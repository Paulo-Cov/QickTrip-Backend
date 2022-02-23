package org.generation.QuickTrip.reservations;

public class reservation {
    private int id;
    private int numReservations;
    private String date;
    private double totalPrice;
    private static int total=0;

	public reservation(int numReservations, String date, double totalPrice) {
		super();
		total ++; 
		this.id = total;
        this.date = date;
		this.numReservations = numReservations;
		this.totalPrice = totalPrice;
	}

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
	public String toString() {
		return "reservation [id=" + id + " numReservations=" + numReservations + " date=" + date + " totalPrice=" + totalPrice+"]";
	}
    

}
