package com.MVC.Spring_MVC.Controller;

import com.MVC.Spring_MVC.dto.Employeedto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/Employess")
public class Employeecontroller {

    @GetMapping(path = "/getSecretMessages")
    public String getMyMessage(){
        return "SecretMessage : Hi,Hello";
    }
    @GetMapping(path = "{empid}")
    public Employeedto getEmployeeById(@PathVariable (name = "empid") long id){
        return new Employeedto(id,"Aneesh","aneesh@gmail.com",22, LocalDate.of(2024,1,15),true);
    }
    @GetMapping
    public String getAllEmployee(@RequestParam(required = false, name = "InputAge") Integer age,
                                 @RequestParam(required = false) String sortby){
        return "Hi Hello " + age + " " + sortby + " ";
    }
    @PostMapping
    public Employeedto CreateNewemployee(@RequestBody Employeedto inputEmpl){
        inputEmpl.setEmpid(100l);
        return inputEmpl;
    }
    @PutMapping
    public String Updateemp(){
        return "Hi Hello Updateing";
    }
}
