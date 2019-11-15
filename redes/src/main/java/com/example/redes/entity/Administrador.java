package com.example.redes.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "administrador")
@Entity
public class Administrador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column()
    private String nombre;

    @NotEmpty
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @NotEmpty
    @Column(name = "apellido_materno")
    private String apellidoMaterno;


    @Column(name = "genero_id")
    Long generoId;

    @NotEmpty
    @Column()
    private String matricula;

    @NotEmpty
    @Length(min = 10, max = 24)
    private String contrasenia;

    @NotEmpty
    @Email()
    private String email;

    @NotNull
    @Column()
    private String telefono;

    @Column(name = "created_id", nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    private boolean delete;

    @Column
    private boolean status;

    public Administrador(){

    }

}