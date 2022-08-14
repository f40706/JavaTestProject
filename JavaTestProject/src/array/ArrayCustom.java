package array;

import java.util.ArrayList;

public class ArrayCustom<T> {
    private final ArrayList<T> arrayList = new ArrayList<>();

    public void addItem(T item) {
        arrayList.add(item);
    }

    public boolean modifyItem(int position, T item) {
        if(position < arrayList.size()) {
            arrayList.set(position, item);
            return true;
        } else {
            return false;
        }
    }

    public void removeItem(T item) {
        arrayList.remove(item);
    }

    public int searchIndex(T item) {
        int position = arrayList.indexOf(item);
        if(position >= 0) {
            return position;
        } else {
            return -1;
        }
    }

    public boolean searchItem(T item) {
        return arrayList.contains(item);
    }

    public int getSize() {
        return arrayList.size();
    }

    //如果有特殊需求打印，可以繼承此class重寫printAll
    public void printAll() {
        for (T item: arrayList) {
            System.out.println(item);
        }
    }
}
