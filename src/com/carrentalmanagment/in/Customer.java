package com.carrentalmanagment.in;

public class Customer {
	private String customerid;
	private String name;
	private String email;
	private Car[] rentedCars; //list of cars
	
	
		Customer(String cusomerid, String name, String email) {
			
				if(customerid == null || customerid.isEmpty()) {
					System.out.println("Please provide customer id ");
				}
				
				if(!email.contains("@")) {
					System.out.println("Invalid Email ");
				}
			this.customerid = customerid;
			this.name = name;
			this.email = email;
			this.rentedCars = new Car[5]; // initialize car with fixed vaalue..
		}

		public String getCustomerid() {
			return customerid;
		}

		public void setCustomerid(String customerid) {
			this.customerid = customerid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		public Car[] getRentedCars() {
	        return rentedCars;
	    }
		
		public void setRentedCars() {
			this.rentedCars = rentedCars;
		}
		
		public void rentedCars(Car car) {
			boolean rentedCar = false;
				for(int i=0; i<rentedCars.length; i++) {
					if (rentedCars[i] == null) {
			            rentedCars[i] = car;
			            car.markAsRented(); // Mark the car as rented
			            rentedCar = true; // Set the flag to true indicating successful renting
			            break; // Exit the loop after renting the car
			        }
			    }
				
				if (!rentedCar) {
			        System.out.println("Customer already has maximum rented cars.");
			    }
				
				}
		/*
		public void returnCar(Car car) {
	        for (int i = 0; i < rentedCars.length; i++) {
	            if (rentedCars[i] == car) {
	                rentedCars[i] = null; // Remove the car from the array
	                car.markAsReturned();
	                return;
	            }
	        }
	        System.out.println("The car is not rented by this customer.");
	    }
*/
		public void returnCar(Car car) {
			// TODO Auto-generated method stub
			for (int i = 0; i < rentedCars.length; i++) {
	            if (rentedCars[i] == car) {
	                rentedCars[i] = null; // Remove the car from the array
	                car.markAsReturned();
	                return;
	            }
	        }
	        System.out.println("The car is not rented by this customer.");
		}
}
