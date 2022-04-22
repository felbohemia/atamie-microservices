package customer.info.details.services;

import customer.info.details.domain.Customer;
import customer.info.details.domain.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void addCustomer(CustomerDTO customerDTO);
    Customer getCustomerByPhone(Long phone);
    Customer getCustomerByEmail(String email);
    Iterable<Customer> getAllCustomers();
}
