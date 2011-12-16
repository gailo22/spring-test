/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author User
 */
public class SpringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/test/beans.xml");
        MyService myService = context.getBean("myService", MyService.class);
        myService.doWork();
        
        B b = context.getBean("b", B.class);
        B b3 = context.getBean("b", B.class);
                
    }
}
