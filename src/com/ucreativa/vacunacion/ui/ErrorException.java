package com.ucreativa.vacunacion.ui;

public class ErrorException extends Exception{

    private String edad;
    private String tipo;

    public MiErrorException (String edad, String tipo){
        super();
        this.edad;
        this.tipo;
    }
     public String getMessage(){
        if (this.tipo.equals("Edad")){
            super("La edad esta incorrecta: " + edad);

        }
     }
}

