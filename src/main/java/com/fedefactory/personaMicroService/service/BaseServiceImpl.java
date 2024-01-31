package com.fedefactory.personaMicroService.service;

import com.fedefactory.personaMicroService.entity.BaseEntity;
import com.fedefactory.personaMicroService.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serial;
import java.io.Serializable;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
public class BaseServiceImpl<E extends BaseEntity, ID extends Serializable> implements BaseService<E,ID>{
    protected BaseRepository<E,ID> baseRepository;
    @Override
    public Page<E> findAll(Pageable page) throws Exception {
        try {
            return baseRepository.findAll(page);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E save(E entity) throws Exception {
        try{
            return baseRepository.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E update(E entity, ID id) throws Exception {
        try {
            if (baseRepository.findById(id).isPresent()){
                return baseRepository.save(entity);
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
