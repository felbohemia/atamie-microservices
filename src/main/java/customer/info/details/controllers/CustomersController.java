package customer.info.details.controllers;

import customer.info.details.domain.Customer;
import customer.info.details.domain.CustomerDTO;
import customer.info.details.services.CustomerServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor

public class CustomersController {

    private final CustomerServiceImp serviceImp;

    @GetMapping("/email")
    ResponseEntity<Customer> getCustomerByEmail(@RequestParam("email") String email){
        return ResponseEntity.ok(serviceImp.getCustomerByEmail(email));
    }

    @GetMapping("/phone")
    ResponseEntity<Customer> getCustomerByPhone(@RequestParam("phone") Long phone){
        return ResponseEntity.ok(serviceImp.getCustomerByPhone(phone));
    }

    @GetMapping("/all")
    ResponseEntity<Iterable<Customer>> getAllCustomers(){
        return ResponseEntity.ok(serviceImp.getAllCustomers());
    }
    @PostMapping
    ResponseEntity<?> postCustomerDetails( @RequestBody CustomerDTO dto){
        serviceImp.addCustomer(dto);
        return ResponseEntity.created(URI.create(dto.getEmail())).build();
    }

}
