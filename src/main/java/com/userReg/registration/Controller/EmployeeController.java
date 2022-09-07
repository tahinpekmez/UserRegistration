package com.userReg.registration.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin()
public class EmployeeController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees(){
        return "Welcome";
    }
}
