package org.bluesoft.rest;

import org.bluesoft.annotations.ServiceMan;
import org.bluesoft.annotations.TodoServiceImpl;
import org.bluesoft.entity.Todo;
import org.bluesoft.service.TodoService;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {

    private static final Logger LOGGER = Logger.getLogger(TodoRest.class);

    @Inject
    @ServiceMan(value = ServiceMan.ServiceType.SERVICE1)
    private TodoService todoService;



    @Path("new")
    @POST
    public Response createTodo(Todo todo){

        LOGGER.info("Create new Todo");

        todoService.createTodo(todo);

        return Response.ok(todo).build();
    }

    @Path("list")
    @GET
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }

}
