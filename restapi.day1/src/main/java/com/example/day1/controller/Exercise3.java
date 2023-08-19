package com.example.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise3 {
        @Value("${var1}")
        private String yourFavColor;
        @GetMapping("color")
        public String getFavColor() {
        return "My Favorite Color is "+yourFavColor;
}
}
