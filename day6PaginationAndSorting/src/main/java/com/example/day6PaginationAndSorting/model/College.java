package com.example.day6PaginationAndSorting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="College")
public class College {
          @Id
          private int collegeid;
          private String collegename;
          private String address;
          private int ranking;
          private String website;
		public int getCollegeid() {
			return collegeid;
		}
		public void setCollegeid(int collegeid) {
			this.collegeid = collegeid;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getRanking() {
			return ranking;
		}
		public void setRanking(int ranking) {
			this.ranking = ranking;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		
          
}
