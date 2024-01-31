package com.fedefactory.personaMicroService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LibroEntity extends BaseEntity{
    private String titulo;
    private Integer date;
    private String genero;
    private Integer paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<AutorEntity> autores;

}
