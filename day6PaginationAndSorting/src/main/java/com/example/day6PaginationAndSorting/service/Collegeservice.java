package com.example.day6PaginationAndSorting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6PaginationAndSorting.model.College;
import com.example.day6PaginationAndSorting.repository.Collegerep;

@Service
public class Collegeservice {
             @Autowired
             public Collegerep crep;
             
             //post the data
             public College saveDetails(College c) {
            	 return crep.save(c);
             }
             //sorting
             
             public List<College>sortByAsc(String Collegename){
            	 return crep.findAll(Sort.by(Collegename).ascending());
             }
             
             public List<College>sortByDesc(String collegename){
            	 return crep.findAll(Sort.by(collegename).descending());
             }
             //pagination
             public List<College>pagination(int num,int size){
            	 Page<College>cont=crep.findAll(PageRequest.of(num, size));
            	 return cont.getContent();
             }
             //pagination and sorting
             public List<College> paginationAndSort(int num,int size,String collegename){
                            Page<College> cont1=crep.findAll(PageRequest.of(num,size,Sort.by(collegename)));
                            return cont1.getContent();
             }
}
