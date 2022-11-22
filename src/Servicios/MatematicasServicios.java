package Servicios;

import Entidades.Matematica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MatematicasServicios {

    Scanner sc = new Scanner(System.in);

    DecimalFormat decimales = new DecimalFormat("#,###,###.##");

    public Matematica crearNumeros() {

        Matematica m1 = new Matematica();

        m1.setNumUno(Math.random() * 10);
        m1.setNumDos(Math.random() * 10);

        System.out.println("El número uno es: " + decimales.format(m1.getNumUno()));
        System.out.println("El número dos es: " + decimales.format(m1.getNumDos()));

        return m1;

    }

    public void numMayorNumMenor(Matematica m1){

        m1.setNumMayor(Math.max(m1.getNumUno(), m1.getNumDos()));
        m1.setNumMenor(Math.min(m1.getNumUno(), m1.getNumDos()));

    }

    public double devolverMayor(Matematica m1) {

        numMayorNumMenor(m1);

        System.out.println("El número mayor es " + decimales.format(m1.getNumMayor()));

        return m1.getNumMayor();
    }

    public int calcularPotencia(Matematica m1) {

        numMayorNumMenor(m1);

        int potencia = (int) Math.pow(Math.round(m1.getNumMayor()), Math.round(m1.getNumMenor()));

        System.out.println("La potencia de " + Math.round(m1.getNumMayor()) + " a la " + Math.round(m1.getNumMenor()) + " es: " + potencia);

        return potencia;
    }

    public double calcularRaiz(Matematica m1) {

        numMayorNumMenor(m1);
        double absolutoUno =  Math.abs(m1.getNumMenor());

        double raizCuadrada = Math.sqrt(absolutoUno);
        System.out.println("La raíz cuadrada de " + decimales.format(absolutoUno) + " es " + decimales.format(raizCuadrada));

        return raizCuadrada;

    }

    public void menu(Matematica m1) {


        boolean salir = false;

        do {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Ver número mayor");
            System.out.println("2. Calcular potencia del mayor");
            System.out.println("3. Calcular raíz cuadrada del menor");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> devolverMayor(m1);
                case 2 -> calcularPotencia(m1);
                case 3 -> calcularRaiz(m1);
                case 4 -> salir = true;
            }
        } while (!salir);

        System.out.println("Gracias por venir. Nos vemos pronto!");

    }

}
