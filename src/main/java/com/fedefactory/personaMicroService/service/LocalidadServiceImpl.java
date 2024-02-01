package com.fedefactory.personaMicroService.service;

import com.fedefactory.personaMicroService.entity.LocalidadEntity;
import com.fedefactory.personaMicroService.repository.LocalidadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocalidadServiceImpl extends BaseServiceImpl<LocalidadEntity,Long> implements LocalidadService{
    private LocalidadRepository localidadRepository;
}
