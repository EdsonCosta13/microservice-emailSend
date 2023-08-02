package com.edsoncosta.msemail.repositories;

import com.edsoncosta.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel,Long> {



}
