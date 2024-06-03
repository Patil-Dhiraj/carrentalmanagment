package com.carrentalmanagment.in;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating a new customer
		
        
        Car car1 = new Car("MH-09 BC9119", "Hundai", "creta", 2018, false);
        
        System.out.println("License Plate: " + car1.getLicensePlate());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Available: " + car1.isAvailable());
        
        car1.markAsRented();
        System.out.println("Available after marking as rented: " + car1.isAvailable());
        
        car1.markAsReturned();
        System.out.println("Available after marking as returned: " + car1.isAvailable());
        
        Customer customer1 = new Customer("1", "Dhiraj Patil", "dhirajpatil@gmail.com");
        System.out.println("Customer ID: " + customer1.getCustomerid());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Email: " + customer1.getEmail());
        customer1.returnCar(car1);
        System.out.println("Rented cars: " + customer1.getRentedCars());
        customer1.returnCar(car1);
        System.out.println("Rented cars after returning: " + customer1.getRentedCars());
        
        Rental rental1 = new Rental(car1, customer1, LocalDate.now());
        System.out.println("Rental Date: " + rental1.getRentalDate());
        System.out.println("Return Date: " + rental1.getReturnDate());
        rental1.returnCar();
        System.out.println("Return Date after returning: " + rental1.getReturnDate());
/*
        // Creating a new car
        Car car = new Car("ABC123", "Toyota", "Corolla", 2020, true);

        // Renting the car
        customer.returnCar(car);
        System.out.println("Rented Cars: " + customer.getRentedCars().length);

        // Returning the car
        customer.returnCar(car);
        System.out.println("Rented Cars after return: " + customer.getRentedCars().length);
        */
    }
	}


