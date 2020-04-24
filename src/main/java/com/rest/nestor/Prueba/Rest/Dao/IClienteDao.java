package com.rest.nestor.Prueba.Rest.Dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.nestor.Prueba.Rest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long>{

}
