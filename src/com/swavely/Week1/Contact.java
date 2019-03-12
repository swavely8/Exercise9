package com.swavely.Week1;

/**
 * Created by 014516 on 3/12/2019.
 */
abstract public class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }
    abstract public void contact();
}
