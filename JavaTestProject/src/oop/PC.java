package oop;

public class PC {
    String name;
    Monitor monitor;

    public PC(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
