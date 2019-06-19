package pl.sda.gdajava25;

import java.util.Arrays;

public class MyStack<E> {
    private int pointer = 0;
    private Object[] array = new Object[10];

    private void biggerArray() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        this.array = newArray;
    }

    public void push(E e) {
        if (pointer < array.length) {
            array[pointer++] = e;
        } else {
            biggerArray();
            array[pointer++] = e;
        }
    }

    public E pop(){
        if(pointer>0) {
            return (E) array[--pointer];
        }
        else return null;
    }

    public Object peek(){
        return array[pointer-1];
    }

    public boolean isEmpty(){
        return pointer <= 0;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "pointer=" + pointer +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
