package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.entities.Vacunas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository {

    private final List<Vacunas> db;

    public InMemoryRepository(){
        this.db = new ArrayList<>();
    }

    public void save (Persona persona, String marca, Date fecha){
        this.db.add(new Vacunas(persona,marca,fecha));
    }

    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");
        for(Vacunas item : db){
            lines.add(item.getPersona().getNombre() + " - " + item.getMarca() + " - " + format.format(item.getFecha()));
        }
        return lines;
    }

}
