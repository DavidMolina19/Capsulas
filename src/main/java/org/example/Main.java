package org.example;

import clases.Estudiante;

public class Main {
    public static void main(String[] args) {


        Estudiante estudiante= new Estudiante();

        // accedo a los metodos de encapsulamientos

        estudiante.setNombre("David");



         estudiante.setNotaPromedio(15);


        String nombre= estudiante.getNombre();
        System.out.println(nombre);

        double nota= estudiante.getNotaPromedio();
        System.out.println(nota);
    }
}