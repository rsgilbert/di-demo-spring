package net.passioncloud.didemo.controllers;
import org.springframework.stereotype.Controller;



@Controller
public class MyController {
    public String hello() {
        String msg = "hey there beautiful dear";
        System.out.println(msg);
        return msg;
    }
}