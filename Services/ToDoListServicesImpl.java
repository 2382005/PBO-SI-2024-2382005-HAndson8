package Services;

import Entities.ToDoList;
import Repository.TodoListRepository;

public class ToDoListServicesImpl implements ToDoListServices {
    private final TodoListRepository todoListRepository;

    public ToDoListServicesImpl(final TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public ToDoList[] getTodoList() {
        return todoListRepository.getAll();
    }

    @Override
    public void addTodoList(String todo) {
        if (todo.isEmpty() || todo.isBlank())
            System.out.printf("Masukkan todo dengan benar");
        return;
    }
ToDoList todoList = new ToDoList();
    todoList.setTodo(todo);
    todoListRepository.add(todoList);

    @Override
    public Boolean removeTodoList(final Integer number, final String todo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoList.setId(number);
        return todoListRepository.edit(todoList);
    }

    @Override
    public Boolean editTodolist(Integer number, String todo) {
        return null;
    }
}
