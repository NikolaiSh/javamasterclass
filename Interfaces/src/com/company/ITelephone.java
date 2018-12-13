package com.company;

public interface ITelephone {
    void powerOn();
    void dial(int phoneMumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
