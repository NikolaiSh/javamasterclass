package com.example.javacomplete;

public class ExtendeedPassword extends Password {
    private int decryptedPassword;

    public ExtendeedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

  //  @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
