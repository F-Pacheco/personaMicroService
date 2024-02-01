package com.fedefactory.personaMicroService.controllers;

import com.fedefactory.personaMicroService.entity.ClienteEntity;
import com.fedefactory.personaMicroService.service.ClienteServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseControllerImpl<ClienteEntity, ClienteServiceImpl>{
}
