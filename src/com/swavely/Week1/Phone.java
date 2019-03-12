package com.swavely.Week1;

/**
 * Created by 014516 on 3/12/2019.
 */
public class Phone extends Contact{
    private String phoneNumber;

    public Phone(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Calling: " + phoneNumber);
    }
}
