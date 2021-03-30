package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.pojos.*;

public interface UserRegister extends JpaRepository<Register, Integer> {

	Register findByEmail(String email);

}
