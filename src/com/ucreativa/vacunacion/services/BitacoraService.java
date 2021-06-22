package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.ui.ErrorException;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;
    private ContadorRiesgo contador;

    public BitacoraService(Repository repository){
        this.repository = repository;
        this.contador = ContadorRiesgo.getInstance();
    }

    public void save(String nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca) throws ErrorException {

        int edad = 0;

        if (riesgo) {
            this.contador.getInstance().SumarRiesgo();
        }

        Persona persona;
        if (isAmigo) {
            if (isAmigo) {
                try {
                    edad = Integer.parseInt(txtEdad);
                } catch (NumberFormatException x) {
                    throw new ErrorException(txtEdad);
                }
            }
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
                if (relacion.equals("Hermano")) {
                    persona = new Familiar(nombre, nombre, edad, riesgo, parentesco);
                } else {
                    persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
                }

            }
            this.repository.save(persona, marca, new Date());
        }


        public List<String> get(){
            System.out.println("La cantidad de personas con riesgo es: " + this.contador.getCantidadRiesgo());
            return this.repository.get();
        }
    }

