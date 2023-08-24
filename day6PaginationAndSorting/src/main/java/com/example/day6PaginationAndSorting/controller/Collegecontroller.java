package com.example.day6PaginationAndSorting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6PaginationAndSorting.model.College;
import com.example.day6PaginationAndSorting.service.Collegeservice;

@RestController
public class Collegecontroller {
              @Autowired
              Collegeservice csev;
              
              //postMapping
              
              @PostMapping("/saveCollege")
              
            	  public College saveDetails(@RequestBody College cl) 
            	  {
            		  return csev.saveDetails(cl);
            	  }
              
              //sort by ascending
              @GetMapping("/sortAsc/{collegename}")
              public List<College> sortasc(@PathVariable("collegename") String collegename)
              {
            	  return csev.sortByAsc(collegename);
              }
              @GetMapping("/sortDesc/{collegename}")
              public List<College> sortdesc(@PathVariable("collegename") String collegename)
              {
            	  return csev.sortByDesc(collegename);
              }
              //pagination
              @GetMapping("/pagination/{num}/{size}")
              public List<College>paginationEx(@PathVariable("num") int num,@PathVariable("size")int size)
              {
            	  return csev.pagination(num, size);
              }
              //pagination and sorting
              
              @GetMapping("paginationAndSort/{num}/{size}/{collegename}")
              public List<College> paginationAndSort(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("collegename") String collegename)
              { 
            	  return csev.paginationAndSort(num,size,collegename);
              }
              
}
