package org.lexicon;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private Person assignee;
    private TodoItem todoItem;

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public Person getAssignee() {
        return assignee;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }
}
