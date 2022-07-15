package com.ll.exam;

public class ArrayList {
    int[] arr = new int[2];
    int size = 0;

    public int size() {
        return size;
    }

    public void add(int data) {
        if (size >= arr.length) {
            int[] arrNew = new int[size * 2];
            for (int i = 0; i < size; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        arr[size] = data;
        size++;
    }

    public int get(int index) {
        return arr[index];
    }

    public void removeAt(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}
