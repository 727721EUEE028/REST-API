package com.example.day3.model;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Hotelmanagement")
public class HotelManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Hotelid;
  
	private String Hotelname;
	public String city;
	public String getHotelname() {
		return Hotelname;
	}
	public void setHotelname(String hotelname) {
		Hotelname = hotelname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	       
    
			
}
