package oop;

public class CompositionAndEncapsulationMain {

    /*
    * PC: 實現Composition，將Monitor小組件，再重新組合
    * MyPC: 實現Encapsulation，在getMoney得到不同答案
    * */
    public static void main(String[] args) {
        MyPC myPC = new MyPC("OaO", new Monitor(4192, 3160));
        Print.content("myPC " + myPC.getMoney());
        MyPC myPC2 = new MyPC("OaO", new Monitor(1920, 1080));
        Print.content("myPC " + myPC2.getMoney());
    }
}
