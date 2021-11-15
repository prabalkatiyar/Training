package com.app.rapipay.SpringBootApp1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.rapipay.SpringBootApp1.Service.ServiceClass;

@RestController("/client")
public class ControllerClass {
	@Autowired
	ServiceClass service;

	@GetMapping("/sum/{num1}/{num2}")
	public int sum(@PathVariable int num1, @PathVariable int num2) {
		return service.sum(num1, num2);

	}

	@GetMapping("/addition")
	public int addition(@RequestParam int num1, @RequestParam int num2) {
		return service.addition(num1, num2);

	}

}
