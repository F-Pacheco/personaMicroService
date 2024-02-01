package com.fedefactory.personaMicroService.controllers;

import com.fedefactory.personaMicroService.entity.LocalidadEntity;
import com.fedefactory.personaMicroService.service.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImpl<LocalidadEntity, LocalidadServiceImpl>{
}

