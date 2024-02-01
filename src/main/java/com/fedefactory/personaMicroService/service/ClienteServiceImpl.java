package com.fedefactory.personaMicroService.service;

import com.fedefactory.personaMicroService.entity.ClienteEntity;
import com.fedefactory.personaMicroService.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl extends BaseServiceImpl<ClienteEntity, Long> implements ClienteService{
    private ClienteRepository clienteRepository;
}
