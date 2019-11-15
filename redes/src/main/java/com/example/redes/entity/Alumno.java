package com.example.redes.entity;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import com.sun.istack.NotNull;
import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;


@Table(name = "alumno")
@Entity
public class Alumno  implements Serializable {

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

    @NotNull()
    @Column(name = "carrera_id")
    Long carreraId;

    @NotEmpty
    @Column()
    private String semestre;

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

    public Alumno (){

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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Long getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(Long carreraId) {
        this.carreraId = carreraId;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Long getGeneroId() {
        return generoId;
    }

    public void setGeneroId(Long generoId) {
        this.generoId = generoId;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

