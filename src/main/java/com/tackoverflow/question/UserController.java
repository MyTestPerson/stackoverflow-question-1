package com.tackoverflow.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @ResponseBody
    @GetMapping("/")
    public String login(){
        return "This Home Page" ;
    }

    @GetMapping("/getUsers")
    public String getUsers(){

        return "This User Jack";

    }



}
