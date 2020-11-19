/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * 
 * @author Diego Palacios <diego.palacios2@catolica.edu.sv>
 */
public class Paciente {
    private SimpleIntegerProperty id_paciente;
    private SimpleStringProperty nombre;
    private SimpleStringProperty apellido;
    private SimpleStringProperty telefono;
    private SimpleStringProperty tipo_sangre;
    private SimpleIntegerProperty edad;
    private SimpleDoubleProperty peso;
    private SimpleStringProperty sexo;
    private SimpleDoubleProperty estatura;
    private SimpleStringProperty fecha_nacimiento;
    private SimpleStringProperty dui;
    
    
    
    public IntegerProperty id_medicoProperty(){return id_paciente;}
    public StringProperty nombreProperty(){return nombre;}
    public StringProperty apellidoProperty(){return apellido;}
    public StringProperty telefonoProperty(){return telefono;}
    public StringProperty tipo_sangreProperty(){return tipo_sangre;}
    public IntegerProperty edadProperty(){return edad;}
    public DoubleProperty pesoProperty(){return peso;}    
    public StringProperty sexoProperty(){return sexo;}
    public DoubleProperty estaturaProperty(){return estatura;}
    public StringProperty fecha_nacimientoProperty(){return fecha_nacimiento;}
    public StringProperty duiProperty(){return dui;}
    
    
    
    public Paciente(){
        this(0, "", "", "", "", 0, 0.0, "", 0.0, "", "");
    }
    
    public Paciente(int id_pas, String nombre, String apellido, String telefono, String t_sangre, int edad, double peso,  String sx, double estatura, String f_nac, String dui ){
        this.id_paciente = new SimpleIntegerProperty(id_pas);
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.telefono = new SimpleStringProperty(telefono);
        this.tipo_sangre = new SimpleStringProperty(t_sangre);
        this.edad = new SimpleIntegerProperty(edad);
        this.peso = new SimpleDoubleProperty(peso);
        this.sexo = new SimpleStringProperty(sx);
        this.estatura = new SimpleDoubleProperty(estatura);
        this.fecha_nacimiento = new SimpleStringProperty(f_nac);
        this.dui = new SimpleStringProperty(dui);
        
        
        
        
    }
    
    @Override
    public String toString(){
        return nombre.get();
    }

    /**
     * @return the id_paciente
     */
    public int getId_paciente() {
        return id_paciente.get();
    }

    /**
     * @param id_paciente the id_paciente to set
     */
    public void setId_paciente(int id_paciente) {
        this.id_paciente.set(id_paciente);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre.get();
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido.get();
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido.set(apellido);
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono.get();
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }

    /**
     * @return the tipo_sangre
     */
    public String getTipo_sangre() {
        return tipo_sangre.get();
    }

    /**
     * @param tipo_sangre the tipo_sangre to set
     */
    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre.set(tipo_sangre);
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad.get();
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad.set(edad);
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso.get();
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso.set(peso);
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo.get();
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo.set(sexo);
    }

    /**
     * @return the estatura
     */
    public Double getEstatura() {
        return estatura.get();
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(Double estatura) {
        this.estatura.set(estatura);
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento.get();
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento.set(fecha_nacimiento);
    }

    /**
     * @return the dui
     */
    public String getDui() {
        return dui.get();
    }

    /**
     * @param dui the dui to set
     */
    public void setDui(String dui) {
        this.dui.set(dui);
    }
    
}
