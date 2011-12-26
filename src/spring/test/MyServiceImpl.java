/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.test;

import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service("myService")
public class MyServiceImpl implements MyService {

    @Override
    public void doWork() {
        System.out.println("DO Service");
    }
    
}
