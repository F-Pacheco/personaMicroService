package com.fedefactory.personaMicroService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "localidad")
public class LocalidadEntity extends BaseEntity{
    private String denominacion;
}
