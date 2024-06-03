package com.carrentalmanagment.in;

import java.time.LocalDate;

public class Rental {
	 private Car car;
	 private Customer customer;
	 private LocalDate rentalDate;
	 private LocalDate returnDate;

	   public Rental(Car car, Customer customer, LocalDate rentalDate) {
		   
	      if (rentalDate.isAfter(LocalDate.now())) {
	            System.out.println("Rental Date cannot be future");
	        }
	      
	        this.car = car;
	        this.customer = customer;
	        this.rentalDate = rentalDate;
	        car.markAsRented();
	        customer.returnCar(car);
	        
	    }

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	 public void returnCar() {
	        returnDate = LocalDate.now();
	        car.markAsReturned();
	        customer.returnCar(car);
	    }
}
