package com.belcorp.auto.paises;



import java.io.IOException;
import java.io.Writer;

public class Peru  {

    private String dni;
    private String nombres;
    private String paterno;
    private String materno;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }


    public Peru() {}

    public Peru(String dni, String nombres, String paterno, String materno) {

        this.dni = dni;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;

    }


}
