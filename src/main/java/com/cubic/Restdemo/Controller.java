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
    public List<Employee> getEmployee(@RequestParam("gender") String gender){

        //calling service
        List<Employee> filtered=empService.getEmployeeService(gender);

        //displaying on console
        System.out.println("Fileterd by gender "+ gender);
        for(Employee e: filtered){
            System.out.println(e.toString());
        }

        //sending response
        return(filtered);
    }
}
