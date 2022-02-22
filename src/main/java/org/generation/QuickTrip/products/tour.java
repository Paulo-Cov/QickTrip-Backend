package org.generation.QuickTrip.products;

public class tour {
	private int id;
    private String name;
    private String location;
    private String category;
    private String image;
    private double price;
    private String about;
    private static int total=0;
    
	public tour(String name, String location, String category, String image, double price, String about) {
		super();
		total ++; 
		this.id = total;
		this.name = name;
		this.location = location;
		this.category = category;
		this.image = image;
		this.price = price;
		this.about = about;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
    
    
}
