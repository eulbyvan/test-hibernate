package com.enigmacamp.service;

import com.enigmacamp.model.Test;
import com.enigmacamp.repo.ITestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

@Service
public class TestService implements ITestService {
	@Autowired
	ITestRepo testRepo;

	@Override
	public void create(Test test) {
		testRepo.save(test);
	}
}
