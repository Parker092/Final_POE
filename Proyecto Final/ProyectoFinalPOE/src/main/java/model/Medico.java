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
public class Medico {
    private SimpleIntegerProperty id_medico;
    private SimpleStringProperty nombre;
    private SimpleStringProperty apellido;
    private SimpleIntegerProperty id_especialidad;
    private SimpleDoubleProperty sueldo;
    private SimpleStringProperty telefono;
    private SimpleStringProperty sexo;
    
    
    public IntegerProperty id_medicoProperty(){return id_medico;}
    public StringProperty nombreProperty(){return nombre;}
    public StringProperty apellidoProperty(){return apellido;}
    public IntegerProperty id_especialidadProperty(){return id_especialidad;}
    public DoubleProperty sueldoProperty(){return sueldo;}
    public StringProperty telefonoProperty(){return telefono;}
    public StringProperty sexoProperty(){return sexo;}
    
    public Medico(){
        this(0, "", "", 0, 0.0, "", "");
    }
    
    public Medico(int id_med, String nombre, String apellido, int id_esp, double sueldo, String telefono, String sx){
        this.id_medico = new SimpleIntegerProperty(id_med);
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.id_especialidad = new SimpleIntegerProperty(id_esp);
        this.sueldo = new SimpleDoubleProperty(sueldo);
        this.telefono = new SimpleStringProperty(telefono);
        this.sexo = new SimpleStringProperty(sx);
    }
    
    
    
    @Override
    public String toString(){
        return nombre.get();
    }

    /**
     * @return the id_medico
     */
    public int getId_medico() {
        return id_medico.get();
    }

    /**
     * @param id_medico the id_medico to set
     */
    public void setId_medico(int id_medico) {
        this.id_medico.set(id_medico);
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
     * @return the id_especialidad
     */
    public int getId_especialidad() {
        return id_especialidad.get();
    }

    /**
     * @param id_especialidad the id_especialidad to set
     */
    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad.set(id_especialidad);
    }

    /**
     * @return the sueldo
     */
    public Double getSueldo() {
        return sueldo.get();
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(Double sueldo) {
        this.sueldo.set(sueldo);
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
    }

