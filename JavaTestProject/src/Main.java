public class Main {
    public static void main(String[] args) {
        String str = "123";
        int value = ParseCommon.parseInt(str);
        System.out.println("int " + value);

        String str2 = "123";
        short value2 = ParseCommon.parseShort(str2);
        System.out.println("short " + value2);

        String str3 = "123";
        long value3 = ParseCommon.parseLong(str3);
        System.out.println("long " + value3);

        String str4 = "123.54648798721";
        float value4 = ParseCommon.parseFloat(str4);
        System.out.println("float " + value4);

        String str5 = "123.5439879879876";
        double value5 = ParseCommon.parseDouble(str5);
        System.out.println("double " + value5);
    }



}



