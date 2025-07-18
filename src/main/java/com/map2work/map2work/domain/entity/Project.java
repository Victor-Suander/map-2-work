package com.map2work.map2work.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.UUID;

@Entity
@Table(name = "project")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = UUID)
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "name", nullable = false, length = 80)
    private String name;

    @Column(name = "genero", nullable = false,length = 36)
    private String genero;

    @Column(name = "experiencia", nullable = false,length = 150)
    private String experiencia;

    @Column(name = "nivelIdioma", nullable = false)
    private String nivelIdioma;

    @Column(name = "geIdadenero", nullable = false)
    private Integer Idade;


}
