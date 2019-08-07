package br.com.teste.dao;

import javax.persistence.EntityManager;  
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.teste.modelo.Tarefa;

@Repository
public class JpaTarefaDao implements TarefaDao{

	@PersistenceContext
	EntityManager entity;
	
	public void adiciona(Tarefa tarefa) {
		entity.persist(tarefa);
	}

}
