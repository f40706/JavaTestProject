package array;

public class LinkedListMain {

    /**
     * orderLinkList: 實現String自動排序的功能
     */
    public static void main(String[] args) {
        orderLinkList();
    }

    private static void orderLinkList() {
        LinkedListCustom<String> linkedList = new LinkedListCustom<>();
        linkedList.addItem("AFF");
        linkedList.addItem("KFF");
        linkedList.addItem("RFF");
        linkedList.addItem("BFF");
        linkedList.addItem("GFF");
        linkedList.addItem("CFF");
        //相同資料不新增，這裡返回false
        System.out.println("Add result: " + linkedList.addItem("BFF"));
        linkedList.addItem("Apple");
        linkedList.printList();
    }

}
