/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.Latihan2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Feroli Bahru
 */
@Controller
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World - from Spring Boot ;) -";
    }

}
