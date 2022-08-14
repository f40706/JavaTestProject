package array;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMain {
    /**
     * arrayReference: 實現Array記憶體參考以及new的影響
     * useArrayList: 透過ArrayCustom封裝，
     * 實現ArrayList的add、modify、search、remove、printAll
     * boxingAndUnboxing: 實現boxing與unboxing的介紹
     * */
    public static void main(String[] args) {
//        arrayReference();
//        useArrayList();
        boxingAndUnboxing();
    }

    /**
    * 主要的目的是
    * 包裝的資料不需要在外部做任何處理
    * 就能夠將處理完的資料讀取
    * */
    private static void boxingAndUnboxing() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<10;i++) {
            //Integer.valueOf(i)會autoboxing，所以使用i即可
            arrayList.add(i);
        }
        for (Integer integer : arrayList) {
            //arrayList.get(i).intValue()會unboxing
            //所以使用arrayList.get(i)即可
            System.out.print(integer + "\t");
        }
    }

    private static void useArrayList() {
        ArrayCustom<String> arrayCustom = new ArrayCustom<>();
        //add
        arrayCustom.addItem("123");
        arrayCustom.addItem("321");
        arrayCustom.addItem("231");
        arrayCustom.printAll();
        System.out.println("----------");
        //modify
        System.out.println("modify: " + arrayCustom.modifyItem(2, "3333"));
        arrayCustom.printAll();
        System.out.println("----------");
        //searItem
        System.out.println(arrayCustom.searchItem("123"));
        System.out.println("----------");
        //searchIndex
        System.out.println(arrayCustom.searchIndex("321"));
        System.out.println("----------");
        //removeItem
        arrayCustom.removeItem("321");
        arrayCustom.printAll();
    }

    private static void arrayReference() {
        int[] array = {1, 3, 5, 7};
        int[] arrayTemp = array;
        //打印結果是一樣的，共享記憶體
        System.out.println("array: " + Arrays.toString(array) + "\n" +
                "arrayTemp: " + Arrays.toString(arrayTemp));
        System.out.println("------------");

        //修改內容，會發現內部new並不會影響外部!
        modifyArray(arrayTemp);
        System.out.println("array: " + Arrays.toString(array) + "\n" +
                "arrayTemp: " + Arrays.toString(arrayTemp));
        System.out.println("------------");

        //修改內容，由此處new，arrayTemp將指向新的記憶體，不在跟array共享記憶體
        arrayTemp = new int[]{23, 25, 26, 27};
        modifyArray(arrayTemp);
        System.out.println("array: " + Arrays.toString(array) + "\n" +
                "arrayTemp: " + Arrays.toString(arrayTemp));
    }

    private static void modifyArray(@NotNull int[] array) {
        array[0] = 10;
        //此時會生成新的記憶體位置，與外部斷開共享記憶體
        array = new int[]{13, 15, 16, 17};
        System.out.println("inside array: " + Arrays.toString(array));
    }
}
