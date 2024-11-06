import Repository.ToDoListRepositoryImpl;
import Repository.TodoListRepository;
import Services.ToDoListServices;
import Services.ToDoListServicesImpl;
import Views.ToDoListTerminalViewsImpl;
import Views.ToDoListViews;

public class Main {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new ToDoListRepositoryImpl();
        ToDoListServices toDoListServices = new ToDoListServicesImpl(todoListRepository);
        ToDoListViews toDoListViews = new ToDoListTerminalViewsImpl(toDoListServices);
        toDoListViews.run();
    }
}
