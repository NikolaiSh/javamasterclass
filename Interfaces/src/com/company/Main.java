package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone mikPhone;
	    mikPhone = new DeskPhone(123456);
	    mikPhone.powerOn();
	    mikPhone.callPhone(123456);

	    mikPhone = new MobilePhone(654321);
	    mikPhone.powerOn();
	    mikPhone.callPhone(654321);
	    mikPhone.answer();
    }
}
