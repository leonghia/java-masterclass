package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; // or we can also write ITelephone timsPhone
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(234565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
