package com.fedefactory.personaMicroService.service;

import com.fedefactory.personaMicroService.entity.AutorEntity;
import com.fedefactory.personaMicroService.repository.AutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AutorServiceImpl extends BaseServiceImpl<AutorEntity,Long> implements AutorService{
    private AutorRepository autorRepository;
}
