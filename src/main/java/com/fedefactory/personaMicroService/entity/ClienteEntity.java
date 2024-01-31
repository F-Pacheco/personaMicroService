package com.fedefactory.personaMicroService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteEntity extends BaseEntity{

    private String nombre;
    private String apellido;
    private Integer dni;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private DomicilioEntity domicilio;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
            name = "cliente_libro",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<LibroEntity> libros = new ArrayList<>();

}
