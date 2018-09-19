package org.bluesoft.service;

import org.bluesoft.entity.Todo;

import java.util.List;

public interface TodoService {

    public Todo createTodo(Todo todo);
    public List<Todo> getTodos();


}
