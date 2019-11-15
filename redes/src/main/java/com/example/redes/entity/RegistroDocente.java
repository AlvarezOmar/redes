package com.example.redes.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

@Table(name = "registro_docente")
@Entity
public class RegistroDocente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "materia_id")
    Long materiaId;

    @NotNull()
    private String grupo;

    @Column(name = "material_id")
    Long materialId;

    @Column(name = "created_id", nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    private boolean delete;

    public RegistroDocente(Long materiaId, String grupo, Long materialId, LocalDateTime createdAt, boolean delete) {
        this.materiaId = materiaId;
        this.grupo = grupo;
        this.materialId = materialId;
        this.createdAt = createdAt;
        this.delete = delete;
    }

    public RegistroDocente(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Long materiaId) {
        this.materiaId = materiaId;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}