package br.com.caelum.vraptor.controller;

import javax.annotation.Resource;

import br.com.caelum.vraptor.entity.*;


@Resource
public class ClientsController {
	
	private ClientDao dao;
	
	public ClientsController(ClientDao dao) {
        this.dao = dao;
    }
	
	
	

}
