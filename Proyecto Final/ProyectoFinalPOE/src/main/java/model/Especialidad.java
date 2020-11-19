/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * 
 * @author Diego Palacios <diego.palacios2@catolica.edu.sv>
 */
public class Especialidad {
    private SimpleIntegerProperty id_especialidad;
    private SimpleStringProperty especialidad;
    
    public IntegerProperty id_especialidadProperty(){return id_especialidad;}
    public StringProperty especialidadProperty(){return especialidad;}
    
    public Especialidad(){
        this(0, "");
    }
    
    public Especialidad(int id_esp, String esp){
        this.id_especialidad = new SimpleIntegerProperty(id_esp);
        this.especialidad = new SimpleStringProperty(esp);
        
    }
    
    @Override
    public String toString(){
        return especialidad.get();
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
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad.get();
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad.set(especialidad);
    }
}
