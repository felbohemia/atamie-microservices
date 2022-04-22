package customer.info.details.services;

import customer.info.details.domain.Customer;
import customer.info.details.domain.CustomerDTO;
import customer.info.details.repository.CustomersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class CustomerServiceImp implements CustomerService{

    private final CustomersRepository customersRepository;

    @Override
    public void addCustomer(CustomerDTO DTO) {
        Customer customer = new Customer(DTO.getFname(), DTO.getLname(),DTO.getPhone(),DTO.getEmail());
        log.info("Saving Customer {} ", customer);
        customersRepository.save(customer);
    }

    @Override
    public Customer getCustomerByPhone(Long phone) {
        return  customersRepository.findByPhone(phone);
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        return customersRepository.findByEmail(email);
    }

    @Override
    public Iterable<Customer> getAllCustomers() {
        return customersRepository.findAll();
    }
}
