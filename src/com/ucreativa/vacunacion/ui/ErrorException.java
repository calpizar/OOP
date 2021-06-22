package com.ucreativa.vacunacion.ui;

public class ErrorException extends Exception {

    private String edad;

    public ErrorException(String edad) {
         super("La edad esta incorrecta: " + edad);
    }
}

