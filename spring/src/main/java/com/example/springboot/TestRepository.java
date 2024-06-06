package com.example.springboot;

import org.springframework.data.repository.*;

public interface TestRepository extends CrudRepository<Test, Long> {
	
	Test findById(long id);

}


