package com.example.day5PutandDeleteMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5PutandDeleteMapping.model.PetShop;
import com.example.day5PutandDeleteMapping.service.PetShopService;

@RestController
//@RequestMapping("/pet")
public class PetShopController {
        @Autowired
        public PetShopService psep;
         @PostMapping("/savePet")
         public  String postPetInfo(@RequestBody PetShop ph) {
        	  psep.savePet(ph);
        	  return "data saved successfully";
         }
         @GetMapping("/getPet")
         public List<PetShop>getPetInfo(){
        	 return psep.getPet();
         }
         @PutMapping("/updatePet")
         public PetShop updatePetInfo(@RequestBody PetShop ps) {
        	 return psep.updatePet(ps);
         }
         @DeleteMapping("/deletePetif/{id}")
         public ResponseEntity<String> deleteHotel(@PathVariable int id){
        	 boolean deleted =psep.deletePetif(id);
        	 if(deleted) {
        		 return ResponseEntity.ok("Pet with id "+id+"deleted successfully");
        	 }
        	 else {
        		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel with ID "+id+"not found");
        	 }
         }
         @DeleteMapping("/deletePet/{id}")
         public String removePet(@PathVariable("id")int petId) {
        	 psep.deletePet(petId);
        	 return "pet with Id"+petId+"is deleted";
         }
         @DeleteMapping("/byReqParm")
         public String removeByRequestPam(@RequestParam("id") int id) {
        	 psep.deletePet(id);
        	 return "Hotel with Id "+id+" is deleted";
         }
         
         @GetMapping("/")
         public String Welcome() {
        	 return "Welcome";
         }
         
         
}
