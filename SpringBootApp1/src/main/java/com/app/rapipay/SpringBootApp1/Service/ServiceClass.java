package com.app.rapipay.SpringBootApp1.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass implements ServiceInterface{
	public int sum(int num1, int num2) {

		return num1 + num2;
	}

	public int addition(int num1, int num2) {

		return num1 + num2;
	}
}
