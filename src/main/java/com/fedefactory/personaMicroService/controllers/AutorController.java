package com.fedefactory.personaMicroService.controllers;

import com.fedefactory.personaMicroService.entity.AutorEntity;
import com.fedefactory.personaMicroService.service.AutorServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutorController extends BaseControllerImpl<AutorEntity, AutorServiceImpl>{
}
