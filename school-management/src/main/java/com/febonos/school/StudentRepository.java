package com.febonos.school;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "students", path = "people")
@RepositoryRestResource(collectionResourceRel = "students")
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByLastName(@Param("name") String name);
}