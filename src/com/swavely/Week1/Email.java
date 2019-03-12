package com.swavely.Week1;

/**
 * Created by 014516 on 3/12/2019.
 */
public class Email extends Contact {
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing: " + email);
    }
}
