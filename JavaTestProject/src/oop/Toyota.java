package oop;

//final禁止繼承
public final class Toyota extends Car {
    public Toyota(String name, String note) {
        super(name, note);
    }

    //Overload同名多Method
    public Toyota(String name) {
        this(name, "No!!");
    }
    /*
    * 如果把Car的getCanDrive改成private或final
    * 將無法Override
    * super指的是Car
    * */
    @Override
    public boolean getCanDrive() {
        return super.getCanDrive();
    }
}
