package com.atamie.todo.domain;

public class ToDoBuilder {

    private static ToDoBuilder instance = new ToDoBuilder();
    private  String id = null;
    private String description = "";

    public static ToDoBuilder create(){
        return instance;
    }

    public ToDoBuilder withDescription(String description){
        this.description = description;
        return instance;
    }
    public ToDoBuilder withId(String id){
        this.id = id;
        return instance;
    }
    public ToDo build(){
        ToDo toDo = new ToDo(this.description);
        if(id != null)
            toDo.setId(this.id);
        return  toDo;
    }
}
