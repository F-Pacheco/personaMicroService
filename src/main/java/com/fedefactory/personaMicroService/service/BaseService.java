package com.fedefactory.personaMicroService.service;

import com.fedefactory.personaMicroService.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

public interface BaseService<E extends BaseEntity,ID extends Serializable> {
    public Page<E> findAll(Pageable page) throws Exception;
    public E findById(ID id) throws Exception;
    public E save (E entity) throws Exception;
    public E update(E entity, ID id) throws Exception;
    public Boolean delete(ID id) throws Exception;
}
