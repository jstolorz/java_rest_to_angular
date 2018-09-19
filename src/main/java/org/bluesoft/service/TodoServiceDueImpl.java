package org.bluesoft.service;

import org.bluesoft.annotations.ServiceMan;
import org.bluesoft.entity.Todo;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@ServiceMan(value = ServiceMan.ServiceType.SERVICE2)
public class TodoServiceDueImpl implements TodoService {
    @Override
    public Todo createTodo(Todo todo) {
        return null;
    }

    @Override
    public List<Todo> getTodos() {
        return null;
    }
}
