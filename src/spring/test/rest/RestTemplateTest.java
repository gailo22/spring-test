/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.test.rest;

import java.net.URI;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author User
 */
public class RestTemplateTest {
    
    private static final String BASE_URL = "http://localhost:9999/ws-test/rest";
    
    public static void main(String[] args) {
        
        // GET
        String url = BASE_URL + "/hello";
        RestTemplate restTemplate = new RestTemplate();
        String str = restTemplate.getForObject(url, String.class);
        System.out.println(str);
        
        // GET customer
        url = BASE_URL + "/customer/{id}";
        str = restTemplate.getForObject(url, String.class, "1");
        System.out.println(str);
        
        // POST
        url = BASE_URL + "/customer";
        Customer customer = new Customer();
        customer.setId("22");
        customer.setName("Montree " + customer.getId());
        URI newCustomertLocation = restTemplate.postForLocation(url, customer);
        System.out.println(newCustomertLocation);
        
        Customer newCustomer = restTemplate.getForObject(newCustomertLocation, Customer.class);
        System.out.println(newCustomer.getId());
        System.out.println(newCustomer.getName());
    }
    
}
