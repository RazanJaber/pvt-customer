//This is a simple CrudRepository, which is an interface that allows us to do CRUD (create, read, update, delete) operations.

package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.accessingdatajpa.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}
