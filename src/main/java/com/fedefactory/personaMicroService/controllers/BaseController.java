package com.fedefactory.personaMicroService.controllers;

import com.fedefactory.personaMicroService.entity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.data.domain.Pageable;
import java.io.Serializable;

public interface BaseController<E extends BaseEntity, ID extends Serializable> {
    public ResponseEntity<?> getAll(Pageable pageable);
    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@RequestBody E entity, @PathVariable ID id);
    public ResponseEntity<?> delete(@PathVariable ID id);

}
