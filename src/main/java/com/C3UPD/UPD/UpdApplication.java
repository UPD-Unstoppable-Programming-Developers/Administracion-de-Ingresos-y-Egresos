package com.C3UPD.UPD;

import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.Models.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

public class UpdApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdApplication.class, args);

		/*
		 * Employee employee1 = new Employee();
		 * employee1.setName("Juan Hurtado");
		 * System.out.println("Nombre del empleado: " + employee1.getName());
		 * 
		 * Enterprise enterprise1 = new Enterprise();
		 * enterprise1.setName("Empresa UPD");
		 * System.out.println("Nombre de la empresa: " + enterprise1.getName());
		 * 
		 * Transaction transaction1 = new Transaction();
		 * transaction1.setAmount(1000.00F);
		 * System.out.println("Monto de la transacción: " + transaction1.getAmount());
		 */
	}


}
