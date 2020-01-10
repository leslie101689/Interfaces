package com.company;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNUmber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
