package oop;

public class Car {
    private final String name;
    private String note;

    public Car(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean getCanDrive() {
        return true;
    }
}
