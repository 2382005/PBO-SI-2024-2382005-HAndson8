package Views;

import Repository.ToDoListRepositoryImpl;
import Repository.TodoListRepository;
import Services.ToDoListServices;
import Services.ToDoListServicesImpl;

public class Main {
    public static void ,ain(String[] args) {
        TodoListRepository todoListRepository = new ToDoListRepositoryImpl();
        ToDoListServices toDoListServices = new ToDoListServicesImpl(todoListRepository);
        ToDoListViews toDoListViews = new Todoli
    }
}
