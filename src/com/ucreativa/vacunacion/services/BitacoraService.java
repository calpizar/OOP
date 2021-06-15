package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
    }

    public void save(String nombre, String cedula, String txtEdad, boolean txtRiesgo, boolean txtIsAmigo, String relacion, String facebook, String parentesco, String marca){

        int edad = Integer.parseInt(txtEdad);
        Persona persona;
        if (txtIsAmigo){
            persona = new Amigo (nombre,cedula,edad,txtRiesgo,relacion,facebook);
        }else{
            persona = new Familiar(nombre,cedula,edad,txtRiesgo,parentesco);
        }
        this.repository.save(persona,marca, new Date());
    }
    public List<String> get(){
        return null;
    }

}
