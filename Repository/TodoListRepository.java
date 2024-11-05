package Repository;

import Entities.ToDoList;

public interface TodoListRepository {
    ToDoList[] getAll();
    void add(ToDoList toDoList);
    Boolean remove(Integer id);
    Boolean edit(ToDoList toDoList);
}
