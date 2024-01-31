package com.fedefactory.personaMicroService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AutorEntity extends BaseEntity{
    private String nombre;
    private String apellido;
    private String biografia;

}
