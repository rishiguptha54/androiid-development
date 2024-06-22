package com.example.myapplication.javaexmp;

import android.os.Message;

public class DemoLamdas {
     public static void main(String[] args) {
         MessageImpl message=new MessageImpl();
         message.sendmessage();
         iMessage imessage=()->{System.out.println("something from lambdas");};
         imessage.sendmessage();

    }
}
