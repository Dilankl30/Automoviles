/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automoviles;

import ec.edu.espoch.practicacarros.enumeraciones.CarType;
import ec.edu.espoch.practicacarros.enumeraciones.FuelTypes;

/**
 *
 * @author USUARIO
 */
public class Automoviles {

    private String Brand;
    private int model;
    private double engine;
    private FuelTypes gasoline;
    private CarType car;
    private int doors;
    private int seats;
    private double maximumSpeed;
    private String color;
    private double currentSpeed;

    public Automoviles(String Brand, int model, double engine, FuelTypes gasoline, CarType car, int doors, int seats, double maximumSpeed, String color, double currentSpeed) {
        this.Brand = Brand;
        this.model = model;
        this.engine = engine;
        this.gasoline = gasoline;
        this.car = car;
        this.doors = doors;
        this.seats = seats;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public FuelTypes getGasoline() {
        return gasoline;
    }

    public void setGasoline(FuelTypes gasoline) {
        this.gasoline = gasoline;
    }

    public CarType getCar() {
        return car;
    }

    public void setCar(CarType car) {
        this.car = car;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

   

    
    public void showAttributes() {
        System.out.println("Brand           : Year " + Brand);
        System.out.println("Model           :" + model);
        System.out.println("Engine          :" + engine);
        System.out.println("Gasolina        :" + gasoline);
        System.out.println("Car             :" + car);
        System.out.println("Doors           :" + doors);
        System.out.println("Seats           :" + seats);
        System.out.println("Maximunm Speed  :" + maximumSpeed + " Km/h");
        System.out.println("Car Color       :" + color);
    }
    private double time1;

    public double getTime1() {
        return time1;
    }

    public void setTime1(double time1) {
        this.time1 = time1;
    }

    public void accelerate(double value1) {
        if (value1 > 0) {
            if ((currentSpeed + value1) <= maximumSpeed) {
                currentSpeed = currentSpeed + value1;

            } else {
                System.out.println("the speed reached must be less, reduces speed");
            }
        } else {
            System.out.println("Speed ​​cannot be negative, please enter a positive value");
        }

    }

    public void decelerate(double value2) {
        if (value2 > 0) {
            if ((currentSpeed - value2) > 0) {
                currentSpeed = currentSpeed - value2;

            } else {
                System.out.println("Speed ​​cannot be negative, please enter a positive value");
            }
        } else {
            System.out.println("Speed ​​cannot be negative, please enter a positive value");
        }

    }

    public void time(double distance) {

        if (currentSpeed > 0) {
            time1 = (distance / currentSpeed);

        } else {

            System.out.println("The current speed cannot be zero, therefore there is no estimated time");

        }

    }

    public void curb() {
        currentSpeed = 0;
        System.out.println("The braking speed is : " + currentSpeed + "km/h");

    }
}
