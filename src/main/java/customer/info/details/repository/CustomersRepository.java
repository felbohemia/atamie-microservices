package customer.info.details.repository;

import customer.info.details.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
    Customer findByPhone(Long phone);
    Customer findByEmail(String email);

}
