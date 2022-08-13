package oop;

public class StaticAndInstanceMain {
    /*
     * 以下為static與instance class/variable的應用
     * Print: 實現static class
     * Car: 實現instance class
     * Car內部的name與note: 實現instance variable
     * Data: 實現static variable
     * */
    public static void main(String[] args) {
        Print.content("123");
        Car car = new Car("str", "note");
        car.setNote("123");
        Print.content("name :" + car.getName() + "\n" +
                "note: " + car.getNote());

        Data data = new Data();
        Print.content("data: " + data.getType());
        data.setType(99);
        Print.content("data: " + data.getType());
        //data2打印出來是99，並不是預設的20
        Data data2 = new Data();
        Print.content("data2: " + data2.getType());
    }
}