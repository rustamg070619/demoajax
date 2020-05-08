package com.example.demoajax.controller;


import com.example.demoajax.model.Login;
import com.example.demoajax.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class FirstController {

    @Autowired
    private LoginService loginService;


    @PostMapping("/save")
    public String save(@RequestBody Login email) {
        loginService.save(email);
        return "redirect:/";
    }

    @GetMapping("/get/{id}")
    public Login find(@PathVariable("id") Long id) {
        Login login = loginService.get(id);
        return loginService.get(id);
    }


}
