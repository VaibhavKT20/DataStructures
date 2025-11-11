package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private T[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public CustomGenericArrayList() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] temp = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        T removed = data[--size];
        data[size] = null;
        return removed;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list=new CustomGenericArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);


    }
}
