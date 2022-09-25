package com.C3UPD.UPD.controllers.frontend;

import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FrontEndController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/")
    public String getIndex(){
        return "inicio";
    }


    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("formUsers",new Employee());
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@ModelAttribute("formUsers") Employee employee){
        System.out.println(employee);
        return "redirect:/inicio";
    }

    @GetMapping("/inicio")
    public String getWelcome(Model model){
        model.addAttribute("usuarios",employeeService.getAllEmployee());
        return "inicio";
    }


}
