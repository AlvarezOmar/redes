package com.example.redes.entity;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;

@Table(name = "materia")
@Entity
public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column()
    private String nombre;

    public Materia (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}