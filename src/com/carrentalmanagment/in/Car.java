package com.carrentalmanagment.in;

public class Car {
	private String licensePlate;
	private String model;
	private String brand;
	private int year;
	private boolean available;
	private boolean rented;
	
		Car(String licensePlate, String model, String brand, int year, boolean available) {
				
				if(licensePlate == null || licensePlate.isEmpty()) {
					System.out.println("please provide the value");
				}
				
				if(year <= 0) {
					System.out.println("Provide positive value ");
				}
				
			this.licensePlate = licensePlate;
			this.model = model;
			this.brand = brand;
			this.year = year;
			this.available = available;
			
		}

		public String getLicensePlate() {
			return licensePlate;
		}

		public void setLicensePlate(String licensePlate) {
			this.licensePlate = licensePlate;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public boolean isAvailable() {
			return available;
		}

		public void setAvailable(boolean available) {
			this.available = available;
		}

		public void markAsRented() {
			// TODO Auto-generated method stub
			rented = true;
		}

		public void markAsReturned() {
			// TODO Auto-generated method stub
			rented = false;
		}
}
