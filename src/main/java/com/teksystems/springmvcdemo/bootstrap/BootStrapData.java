package com.teksystems.springmvcdemo.bootstrap;

import com.teksystems.springmvcdemo.domain.Customer;
import com.teksystems.springmvcdemo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading customer Data....");

        Customer c1 = new Customer();
        c1.setFirstName("Bob");
        c1.setLastName("Small");
        c1.setAddress("123  N. Main");
        c1.setPhone("602-123-1234");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Scott");
        c2.setLastName("Youngman");
        c2.setAddress("1234  N. Main");
        c2.setPhone("602-123-1235");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Dan");
        c3.setLastName("Abbondi");
        c3.setAddress("12345  N. Main");
        c3.setPhone("602-123-1236");
        customerRepository.save(c3);

        System.out.println("Customers saved " + customerRepository.count());

    }
}
