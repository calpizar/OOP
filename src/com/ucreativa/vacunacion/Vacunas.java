package com.ucreativa.vacunacion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vacunas {

    private Persona persona;
    private String marca;
    private Date fecha;

    public Vacunas(Persona persona, String marca, Date fecha) {
        this.persona = persona;
        this.marca = marca;
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getMarca() {
        return marca;
    }

    public Date getFecha() {
        return fecha;
    }

}
