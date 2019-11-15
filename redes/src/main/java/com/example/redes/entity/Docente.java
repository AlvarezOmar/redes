package com.example.redes.entity;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import com.sun.istack.NotNull;
import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;

@Table(name = "docente")
@Entity
public class Docente implements Serializable {

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
    @Length(min=10, max=24)
    private String contrasenia;

    @NotEmpty
    @Email()
    private String email;

    @NotNull()
    private String telefono;


}

