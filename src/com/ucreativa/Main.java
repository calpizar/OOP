package com.ucreativa;

import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;
import com.ucreativa.vacunacion.Vacunas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Familiar mama = new Familiar ("Xinia", "324192",55,false,"Mama");

        Familiar hermano = new Familiar ("Javier","12332325",22, false,"Hermano");

        Amigo compa = new Amigo ("Juana", "12134325", 30, false,"Amigo","juana.perez");


        List <Vacunas> vacunas = new ArrayList<>();
        vacunas.add(new Vacunas(mama,"Pfizer", new Date()));
        vacunas.add(new Vacunas(hermano,"Pfizer", new Date()));
        vacunas.add(new Vacunas(compa,"Pfizer", new Date()));
    }
}
