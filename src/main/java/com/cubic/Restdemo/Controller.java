package com.cubic.Restdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class Controller {

    @Autowired              //autowiring to service instance
    EmployeeService empService;

    /////////////////////////////   adding Employee  /////////////////////////////////////////
    @PostMapping(value = "/addEmployee")   //path maping for post
    public String addEmployee(@RequestBody Employee emp){

        //calling service
        empService.addEmployeeService(emp);

        return("Success!! Employee successfully added!!");
    }

    //////////////////////////   Filtering Employe  /////////////////////////////////////////////////

    @GetMapping("/filterEmployee")   //path maping for get
    public List getEmployee(@RequestParam("gender") String gender){

        //calling service
        return empService.getEmployeeService(gender);
    }
}
