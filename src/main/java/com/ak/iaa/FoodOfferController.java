package com.ak.iaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class FoodOfferController {

    @Autowired
    private FoodOfferService foodOfferService;

    @GetMapping("/")
    public String getOffers(final Model model){
        model.addAttribute("otherOffers", this.foodOfferService.getFoodOffersForOthers());
        return "external-offers";
    }

    @GetMapping("/employee/offers")
    public String getEmployeeOffers(final Model model){
        model.addAttribute("employeeOffers", this.foodOfferService.getFoodOffersForEmployee());
        model.addAttribute("loginStatus", true);
        return "employee-offers";
    }

    @GetMapping("/logout")
    public String logout(final Model model, final HttpServletRequest httpServletRequest) throws ServletException {
        httpServletRequest.logout();
        model.addAttribute("otherOffers", this.foodOfferService.getFoodOffersForOthers());
        return "external-offers";
    }
}
