package org.generation.QuickTrip.tour;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tour")
public class tour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
    private String name;
    private String location;
    private String category;
    private String image;
    private Long price;
    private String about;
    private String city;
    private double rating;
    private int reviews_num;
	
    
    public tour() {
    	
    }//constructor vacio
    
    public tour(Long id, String name, String location, String category, String image, Long price, String about,
			String city, double rating, int reviews_num) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.category = category;
		this.image = image;
		this.price = price;
		this.about = about;
		this.city = city;
		this.rating = rating;
		this.reviews_num = reviews_num;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getReviews_num() {
		return reviews_num;
	}

	public void setReviews_num(int reviews_num) {
		this.reviews_num = reviews_num;
	}

	@Override
	public String toString() {
		return "tour [id=" + id + ", name=" + name + ", location=" + location + ", category=" + category + ", image="
				+ image + ", price=" + price + ", about=" + about + ", city=" + city + ", rating=" + rating
				+ ", reviews_num=" + reviews_num + "]";
	}
    
    
   
    
}
