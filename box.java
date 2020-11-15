package com.company;

public class box<T > {

    private T obj;

    public box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("obj " + obj);
        System.out.println("type " + obj.getClass());
    }
  
}
