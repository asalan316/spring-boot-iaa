package com.ak.iaa;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FoodOfferService {

    public List<String> getFoodOffersForEmployee(){
        return Arrays.asList("Barbecue", "Chicken with italian sauce", "Russian Salad");
    }

    public List<String> getFoodOffersForOthers(){
        return Arrays.asList("Potatoes with kidney beans", "Lentils");

    }
}
