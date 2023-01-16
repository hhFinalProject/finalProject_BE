package com.hanghae.finalProject.rest.user.repository;

import com.hanghae.finalProject.rest.user.model.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmailRepository extends CrudRepository<Email, String> {
}
