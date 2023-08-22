package com.example.day5PutandDeleteMapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="petshop")
public class PetShop {
           @Id
           @GeneratedValue(strategy=GenerationType.IDENTITY)
           private int petId;
           @Column(name="petbreed")
           private String petbreed;
           private String petname;
           private int petprice;
		public int getPetId() {
			return petId;
		}
		public void setPetId(int petId) {
			this.petId = petId;
		}
		public String getPetbreed() {
			return petbreed;
		}
		public void setPetbreed(String petbreed) {
			this.petbreed = petbreed;
		}
		public String getPetname() {
			return petname;
		}
		public void setPetname(String petname) {
			this.petname = petname;
		}
		public int getPetprice() {
			return petprice;
		}
		public void setPetprice(int petprice) {
			this.petprice = petprice;
		}
		
}
