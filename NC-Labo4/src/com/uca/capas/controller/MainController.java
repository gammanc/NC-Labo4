package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		
		mav.setViewName("main");
		mav.addObject("message","Tarea Guía 4");
		mav.addObject("product", product);
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView formData(@Valid @ModelAttribute Product product,
							BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.addObject("message","Se detectaron errores en los campos");
			mav.setViewName("main");
		} else {
			mav.addObject("message", "Producto agredado con éxito");
			mav.setViewName("form");
		}
		return mav;
	}
}
