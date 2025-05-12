package array;

import java.util.Iterator;

public class Array<T>{

    private T[] array;

    @SafeVarargs
    public Array(T... items) {
        array = items;
    }

    public void add(T item) {
        T[] copyArray = (T[]) new Object[array.length + 1];
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length) {
                copyArray[i] = item;
            } else {
                copyArray[i] = array[i];
            }
        }
        array = copyArray;
    }

    public void add(int index, T item) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        T[] copyArray = (T[]) new Object[array.length + 1];
        for (int i = 0, j = 0; i <= array.length; i++) {
            if (i == index) {
                copyArray[i] = item;
            } else {
                copyArray[i] = array[j++];
            }
        }
        array = copyArray;
    }

    public void addAll(T[] collection) {
        T[] copyArray = (T[]) new Object[array.length + collection.length];
        int num = 0;
        for (int i = 0; i < copyArray.length; i++) {
            if (i < array.length) {
                copyArray[i] = array[i];
            } else {
                copyArray[i] = collection[num++];
            }
        }
        array = copyArray;
    }

    public void addAll(int index, T[] collection) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        T[] copyArray = (T[]) new Object[array.length + collection.length];
        int num = 0;
        for (int i = 0; i < copyArray.length; i++) {
            if (i == index) {
                for (int x = 0; x < collection.length; x++, i++){
                    copyArray[i] = collection[x];
                }
                i--;
            } else {
                copyArray[i] = array[num++];
            }
        }
        array = copyArray;
    }


    public boolean contains(T item){
        for (T read : array) {
            if (read.equals(item)) {
                return true;
            }
        }

        return false;
    }

    private boolean contains1(T item) {
        if (item instanceof Integer) {
            if ((Integer) item >= 0 & (Integer) item < array.length) {
                return true;
            } else {
                throw new IndexOutOfBoundsException("Index " + item + " out of bounds for length " + array.length);
            }
        }

        for (T read : array) {
            if (read.equals(item)) {
                return true;
            }
        }

        return false;
    }

    public T get(int index){
        if (index < 0 | index >= array.length){
            throw new IndexOutOfBoundsException("Index " + index + "out of bounds for length " + array.length);
        }
        return array[index];
    }

    public T indexOf(T item){
        for (T read : array){
            if (read.equals(item)){
                return read;
            }
        }
        return (T) "-1";
    }

    public int size(){
        return array.length;
    }

    public void remove(T item) {
        if (contains1(item)) {
            boolean noRepeat = true;
            int num = 0;
            T[] copyArray = (T[]) new Object[array.length - 1];
            if (item instanceof Integer) {
                for (int i = 0; i < array.length; i++) {
                    if (noRepeat & (Integer) item == i) {
                        noRepeat = false;
                    } else {
                        copyArray[num++] = array[i];
                    }
                }
            } else {
                int numStr = 0;
                for (T read : array){
                    if (noRepeat & read.equals(item)){
                        noRepeat = false;
                    } else {
                        copyArray[numStr++] = read;
                    }
                }
            }
            if (!noRepeat) {
                array = copyArray;
            }
        }
    }

    public void clean() {
        T[] cleanArray = (T[]) new Object[0];
        array = cleanArray;
    }

    public void foreach() {
        for (T read : array) {
            System.out.println(read);
        }
    }

//    @Override
//    public Iterator<T> iterator() {
//        return new Iterator<T>() {
//
//            private int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return index < array.length;
//            }
//
//            @Override
//            public T next() {
//                return array[index++];
//            }
//        };
//    }
}
