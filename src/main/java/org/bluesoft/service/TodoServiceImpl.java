package org.bluesoft.service;

import org.bluesoft.annotations.ServiceMan;
import org.bluesoft.entity.Todo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@ServiceMan(value = ServiceMan.ServiceType.SERVICE1)
@org.bluesoft.annotations.TodoServiceImpl
public class TodoServiceImpl implements TodoService {

    @PersistenceContext
    EntityManager entityManager;

    public Todo createTodo(Todo todo){
        entityManager.persist(todo);
        return todo;
    }

    @Override
    public List<Todo> getTodos() {
        return entityManager.createQuery("SELECT t from Todo t", Todo.class).getResultList();
    }

}
