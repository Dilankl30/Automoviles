/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automoviles;

/**
 *
 * @author USUARIO
 */
public class Automoviles {
    
    private String Brand;
    private int model;
    private double engine;
    private String gasoline;
    private String car;
    private int doors;
    private int seats;
    private double maximumSpeed;
    private String color;
    private double currentSpeed;

    public Automoviles(String Brand, int model, double engine, String gasoline, String car, int doors, int seats, double maximumSpeed, String color, double currentSpeed) {
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

    public String getGasoline() {
        return gasoline;
    }

    public void setGasoline(String gasoline) {
        this.gasoline = gasoline;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
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
}
