package com.example.demoajax.services;

import com.example.demoajax.model.Login;
import com.example.demoajax.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public List<Login> loginList() {
        return loginRepository.findAll();
    }

    public void save(Login login) {
        loginRepository.save(login);
    }

    public void delete(Long id) {
        loginRepository.deleteById(id);
    }

    public Login get(Long id) {
        return loginRepository.findById(id).get();
    }


}
