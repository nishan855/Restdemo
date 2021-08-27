package com.cubic.Restdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class EmployeeService {

    //employeelist for storage
    private ArrayList<Employee> emplList= new ArrayList<Employee>();


    //adds employee to the list
    public void addEmployeeService(Employee empl){
        emplList.add(empl);

        //testing to see on console
        for(Employee e: emplList){
            System.out.print(e.toString());    //bad practice ---will use logger
        }
    }

    //filters employees by gender and return list
    public List<Employee> getEmployeeService(String gender){
         return emplList.stream().filter(s -> s.getGender().equalsIgnoreCase(gender)).collect(Collectors.toList());
    }


}
