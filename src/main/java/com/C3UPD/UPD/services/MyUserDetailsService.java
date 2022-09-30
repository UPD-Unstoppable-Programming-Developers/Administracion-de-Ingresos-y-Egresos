package com.C3UPD.UPD.services;

import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.Models.MyUserDetails;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

@Service

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    EmployeeService employeeService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


        System.out.println(email);
        Employee employee = null;


        try {System.out.println(email);
            employee = employeeService.findbyEmail(email);
            //System.out.println(employee);
        } catch (Exception e){
            e.printStackTrace();
            throw new UsernameNotFoundException(e.getMessage());
        }
        return new MyUserDetails(employee);
    }
}
