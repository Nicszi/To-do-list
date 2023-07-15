import java.util.ArrayList;
import java.util.List;

class Todo {
    private String actionName;
    private boolean isDone;

    public Todo(String actionName, boolean isDone) {
        this.actionName = actionName;
        this.isDone = isDone;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}

class TodoList {
    private List<Todo> todoList;
    private List<Todo> doneList;

    public TodoList() {
        todoList = new ArrayList<>();
        doneList = new ArrayList<>();
    }

    public void addTodo(String[] actions) {
        for (String action : actions) {
            Todo todo = new Todo(action, false);
            todoList.add(todo);
        }
    }

    public void markAsDone(int index) {
        if (index >= 0 && index < todoList.size()) {
            Todo todo = todoList.remove(index);
            todo.setDone(true);
            doneList.add(todo);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTodoList() {
        System.out.println("Todo List:");
        for (int i = 0; i < todoList.size(); i++) {
            Todo todo = todoList.get(i);
            System.out.println((i + 1) + ". " + todo.getActionName() + " (Done: " + todo.isDone() + ")");
        }
    }

    public void displayDoneList() {
        System.out.println("Done List:");
        for (int i = 0; i < doneList.size(); i++) {
            Todo todo = doneList.get(i);
            System.out.println((i + 1) + ". " + todo.getActionName() + " (Done: " + todo.isDone() + ")");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        String[] actions = {"Task 1", "Task 2", "Task 3"};
        todoList.addTodo(actions);

        todoList.displayTodoList();

        todoList.markAsDone(1);

        todoList.displayTodoList();
        todoList.displayDoneList();
    }
}