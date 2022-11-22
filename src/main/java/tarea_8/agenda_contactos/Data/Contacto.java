/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_8.agenda_contactos.Data;

/**
 *
 * @author usuario
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String numero_telefonico;
    private String direccion_domicilio;
    private String correo;


    public Contacto(String nombre, String apellido,
                     String numero_telefonico, String correo, String direccion_domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_telefonico = numero_telefonico;
        this.direccion_domicilio = direccion_domicilio;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(String numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }

    public String getDireccion_domicilio() {
        return direccion_domicilio;
    }

    public void setDireccion_domicilio(String direccion_domicilio) {
        this.direccion_domicilio = direccion_domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}