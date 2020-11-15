package com.company;

public class fruit<T extends Number> {
       public Double ves;
    public Integer quantity;

    public fruit(Double weight,Integer quantity ) {
        this.quantity = quantity;
             this.ves= weight;

    }

    public static Double getWeight(Integer quantity,Double ves) {

        Double sum = ves.doubleValue()*quantity.doubleValue();
        return sum;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public Double getVes() {
        return ves;
    }

}
