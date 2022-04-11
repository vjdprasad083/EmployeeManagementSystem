package com.cg.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.User;
import com.cg.repository.UserRepository;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserRepository repo;

	@Override
	@Transactional
	public User validateUser(User user) {
			User use=null;
			User temp=repo.getById(user.getUserId());
			String pass=temp.getPassword();
			String tempPass=user.getPassword();

			if((tempPass).equals(pass)) {
				use=repo.getById(user.getUserId());

			}
			return use;
}

}
