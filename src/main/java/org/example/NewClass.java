package org.example;

public class NewClass {
    private int id;

    public NewClass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NewClass{" +
                "id=" + id +
                '}';
    }
}
