package oop;

public class OverloadAndOverrideMain {
    /*
    * OOP的一些應用
    * 封裝不允許外曝
    * 限制name為唯讀
    * note可讀可寫
    * Toyota實現overload可選擇是否要設定note
    * Toyota實現繼承Car
    * Toyota實現override getCanDrive
    * Toyota禁止Child在繼承，class設定final
    * */
    public static void main(String[] args) {
        //不初始化Note
        Toyota toyota = new Toyota("yoyo");
        System.out.println("name: " + toyota.getName() + "\n" +
                "note: " + toyota.getNote());
        System.out.println("------------");
        //僅允許修改Note
        toyota.setNote("Pen!");
        System.out.println("name: " + toyota.getName() + "\n" +
                "note: " + toyota.getNote());
        System.out.println("------------");
        //初始化Note
        Toyota toyota2 = new Toyota("momo", "note!");
        System.out.println("name: " + toyota2.getName() + "\n" +
                "note: " + toyota2.getNote());
    }
}
