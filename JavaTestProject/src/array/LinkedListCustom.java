package array;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCustom<T> {
    private final LinkedList<T> linkedList = new LinkedList<>();

    /**
     * String型態相同資料不新增
     * 比較後較小的放前面
     * 其他型態走預設
     */
    public boolean addItem(T item) {
        ListIterator<T> listIterator = linkedList.listIterator();
        if (item instanceof String) {
            while (listIterator.hasNext()) {
                int compare = ((String) listIterator.next()).compareTo((String) item);
                if (compare == 0) {
                    return false;
                } else if (compare > 0) {
                    listIterator.previous();
                    listIterator.add(item);
                    return true;
                }
            }
        }
        listIterator.add(item);
        return true;
    }

    public void printList() {
        for (T s : linkedList) {
            System.out.println(s);
        }
    }
}
