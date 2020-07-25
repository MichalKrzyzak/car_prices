package com.main.dto;

import com.main.dto.enums.CarDriveType;
import com.main.dto.enums.CarType;
import com.main.dto.enums.GearboxType;

public class Car {
    private String brand;
    private String model;
    private String yearOfProduction;
    private Long mileage;
    private String fuelType;
    private int horsePower;
    private GearboxType gearboxType;
    private CarDriveType carDrive;
    private CarType carType;
    private String percentageDifference;
    private String imageLink;

    public Car() {
    }

    public Car(CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.model = carBuilder.model;
        this.yearOfProduction = carBuilder.yearOfProduction;
        this.mileage = carBuilder.mileage;
        this.fuelType = carBuilder.fuelType;
        this.horsePower = carBuilder.horsePower;
        this.gearboxType = carBuilder.gearboxType;
        this.carDrive = carBuilder.carDrive;
        this.carType = carBuilder.carType;
        this.percentageDifference = carBuilder.percentageDifference;
        this.imageLink = carBuilder.imageLink;
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private String yearOfProduction;
        private Long mileage;
        private String fuelType;
        private int horsePower;
        private GearboxType gearboxType;
        private CarDriveType carDrive;
        private CarType carType;
        private String percentageDifference;
        private String imageLink;

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYearOfProduction(String yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public CarBuilder setMileage(Long mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public CarBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public CarBuilder setGearboxType(GearboxType gearboxType) {
            this.gearboxType = gearboxType;
            return this;
        }

        public CarBuilder setCarDrive(CarDriveType carDrive) {
            this.carDrive = carDrive;
            return this;
        }

        public CarBuilder setCarType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public CarBuilder setPercentageDifference(String percentageDifference) {
            this.percentageDifference = percentageDifference;
            return this;
        }

        public CarBuilder setImageLink(String imageLink) {
            this.imageLink = imageLink;
            return this;
        }

        public Car createCar() {
            return new Car(this);
        }

    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public Long getMileage() {
        return mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public CarDriveType getCarDrive() {
        return carDrive;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getPercentageDifference() {
        return percentageDifference;
    }

    public String getImageLink() {
        return imageLink;
    }
}
