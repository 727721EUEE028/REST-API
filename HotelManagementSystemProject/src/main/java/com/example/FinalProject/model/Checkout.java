package com.example.FinalProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "checkin")
public class Checkout {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private int roomnumber;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getRoomnumber() {
			return roomnumber;
		}

		public void setRoomnumber(int roomnumber) {
			this.roomnumber = roomnumber;
		}
	    
	    
	   
	}



