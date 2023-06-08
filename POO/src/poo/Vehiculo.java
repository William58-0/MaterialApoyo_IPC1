/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author William
 */
public class Vehiculo {

    String atributoDefault;
    public String atributoPublico;
    private String atributoPrivate;
    protected String atributoProtected;

    // Contructor
    public Vehiculo(String atributoDefault, String atributoPublico, 
            String atributoPrivate, String atributoProtected) {
        this.atributoDefault = atributoDefault;
        this.atributoPublico = atributoPublico;
        this.atributoPrivate = atributoPrivate;
        this.atributoProtected = atributoProtected;
    }

    public String getDefault() {
        return this.atributoDefault;
    }

    public String atributoPublico() {
        return this.atributoDefault;
    }

    public String atributoPrivate() {
        return this.atributoPrivate;
    }

    public String atributoProtected() {
        return this.atributoProtected;
    }

}
