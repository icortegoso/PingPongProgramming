package com.solera.bankbackend.service;

import com.solera.bankbackend.domain.model.User;
import com.solera.bankbackend.repository.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeService extends CommonService<User, IUserRepository>{
}
