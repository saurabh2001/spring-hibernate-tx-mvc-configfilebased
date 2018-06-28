package com.howto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howto.config.AppConfig;
import com.howto.model.Employee;
import com.howto.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//http://websystique.com/springmvc/spring-4-mvc-and-hibernate4-integration-example-using-annotations/
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        EmployeeService service = (EmployeeService) context.getBean("employeeService");
        Employee employee1 = new Employee();
        employee1.setName("Rajunn funn");
        employee1.setJoiningDate(new Date(2010, 10, 10));
        employee1.setSalary(new BigDecimal(10000));
        employee1.setSsn("rsq100000001");
        
        service.saveEmployee(employee1);
        
        System.out.println( "Hello World!" );
    }
}
