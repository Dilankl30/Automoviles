/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.practicacarros;

import Automoviles.Automoviles;
import ec.edu.espoch.practicacarros.enumeraciones.CarType;
import ec.edu.espoch.practicacarros.enumeraciones.FuelTypes;

/**
 *
 * @author USUARIO
 */
public class PracticaCarros {

    public static void main(String[] args) {

        Automoviles carros = new Automoviles("Mazda", 2024, 25.5, FuelTypes.Biodiesel, CarType.Family, 6, 5, 200, "white", 0);

        carros.showAttributes();

        carros.accelerate(100);
        System.out.println(" ");
        System.out.println("Accelerating");
        System.out.println("Current Speed: " + carros.getCurrentSpeed() + " Km/h");

        carros.accelerate(20);
        System.out.println(" ");
        System.out.println("Accelerating + ");
        System.out.println("Current Speed: " + carros.getCurrentSpeed() + " Km/h");

        carros.decelerate(50);
        System.out.println(" ");
        System.out.println("Decelerating");
        System.out.println("Current Speed: " + carros.getCurrentSpeed() + " Km/h");

        carros.time(150);
        System.out.println(" ");
        System.out.println("The estimated arrival time is:" + carros.getTime1());

        System.out.println(" ");
        System.out.println("Braking");
        carros.curb();
    }
}
