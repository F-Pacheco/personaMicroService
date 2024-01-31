package com.fedefactory.personaMicroService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DomicilioEntity extends BaseEntity{
    private String calle;
    private Integer numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private LocalidadEntity localidad;
}
