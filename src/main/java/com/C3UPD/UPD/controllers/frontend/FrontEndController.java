package com.C3UPD.UPD.controllers.frontend;

import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.Models.Transaction;
import com.C3UPD.UPD.services.EmployeeService;
import com.C3UPD.UPD.services.EnterpriseService;
import com.C3UPD.UPD.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FrontEndController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EnterpriseService enterpriseService;

    @Autowired
    TransactionService transactionService;

    @GetMapping("/")
    public String getIndex(){
        return "redirect:/login";
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

    @GetMapping("/employee/add")
    public String getAddEmployee(Model model){
        model.addAttribute("newEmployee",new Employee());
        return "Employee";
    }
    @PostMapping("/employee/post")
    public String postAddEmployee(@ModelAttribute("newEmployee") Employee employee){
        employeeService.create(employee);
        return "redirect:/inicio";
    }

    @GetMapping("/enterprise/add")
    public String getAddEnterprise(Model model){
        model.addAttribute("newEnterprise",new Enterprise());
        return "Enterprise";
    }
    @PostMapping("/enterprise/post")
    public String postAddEnterprise(@ModelAttribute("newEnterprise") Enterprise enterprise) {
        enterpriseService.create(enterprise);
        return "redirect:/inicio";
    }

    @GetMapping("/TransactionSystem")
    public String getTransactionSystem(Model model){
        model.addAttribute("enterprises",enterpriseService.getAllEnterprise());
        return "TransactionSystem";
    }

    @GetMapping("/transaction/add")
    public String getAddTransaction(Model model){
        model.addAttribute("newTransaction",new Transaction());
        return "transaction";
    }
    @PostMapping("/transaction/post")
    public String postAddTransaction(@ModelAttribute("newTransaction") Transaction transaction) {
        transactionService.create(transaction);
        return "redirect:/TransactionSystem";
    }

    @GetMapping("/TransactionEnterprise/{id}")
    public String getTransactionEnterprise(Model model, @PathVariable Long id){
        model.addAttribute("transactionsEnterprise",transactionService.findTransactionByEnterpriseId(id));
        List<Transaction> transactions = transactionService.findTransactionByEnterpriseId(id);
        float amountTransaction = 0;
        for (Transaction transaction: transactions){
            amountTransaction += transaction.getAmount();
        }
        model.addAttribute("amountTransaction",amountTransaction);
        return "TransactionEnterprise";
    }
}
