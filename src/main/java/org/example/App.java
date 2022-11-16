package org.example;

import org.example.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        PaymentService paymentObject=context.getBean("payment", PaymentService.class);


        paymentObject.makePayment(123);
    }
}
