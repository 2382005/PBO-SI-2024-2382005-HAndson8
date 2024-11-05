package Services;

import Entities.ToDoList;

public interface ToDoListServices {
    ToDoList[] getTodoList();
    void addTodoList(String todo);
    Boolean removeTodoList(Integer number);
    Boolean editTodolist(Integer number, String todo);
}
