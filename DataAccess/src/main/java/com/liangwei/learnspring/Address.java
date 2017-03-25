package com.liangwei.learnspring;

/**
 * Created by liangwei on 2017/3/16.
 */
public class Address {

    private String street;
    private String city;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString(){

        return "Street: "+ street+" City: "+city;
    }
}
