package com.ucreativa;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.entities.Vacunas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //create data base
        List<Vacunas> db = new ArrayList<>();

        while (true) {
            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, print;
            Persona persona;
            System.out.println("Nombre: ");
            nombre = in.nextLine();
            System.out.println("Cedula: ");
            cedula = in.nextLine();
            System.out.println("Edad: ");
            edad = in.nextLine();
            System.out.println("Riesgo (S/N): ");
            riesgo = in.nextLine();
            System.out.println("Amigo(A)/Familiar(F):");
            isAmigo = in.nextLine();
            if (isAmigo.equals("A")) {
                System.out.println("Relacion: ");
                relacion = in.nextLine();
                System.out.println("Facebook: ");
                facebook = in.nextLine();
                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);
            } else {
                System.out.println("Parentesco: ");
                parentesco = in.nextLine();
                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentesco);
            }
            System.out.println("Vacuna -- Marca: ");
            marca = in.nextLine();
            db.add(new Vacunas(persona, marca, new Date()));

            System.out.println("Quiere imprimir Lista (S)?");
            print = in.nextLine();
            if (print.equals("S")) {
                for (Vacunas item : db) {
                    System.out.println(item.getPersona().getNombre() + " vacunado el " + item.getFecha());
                }
            }
        }
    }
}
