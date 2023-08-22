package com.example.day5PutandDeleteMapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day5PutandDeleteMapping.model.PetShop;
import com.example.day5PutandDeleteMapping.repository.PetShopRep;

@Service
public class PetShopService {
           @Autowired
           public PetShopRep prep;
           
           public String savePet(PetShop p) {
        	    prep.save(p);
        	    return "data is saved successfully";
           }
           public List<PetShop>getPet(){
        	   return prep.findAll();
           }
           public PetShop updatePet(PetShop ps) {
        	   return prep.saveAndFlush(ps);
           }
           //delete if id is present
           public boolean deletePetif(int petId) {
        	   if(prep.existsById(petId)) {
        		   prep.deleteById(petId);
        		   return true;
        	   }
        	   return false;
           }
           //delete the data
           public void deletePet(int pet_Id) {
        	   System.out.println("Deleted");
        	   prep.deleteById(pet_Id);
           }
           
}
