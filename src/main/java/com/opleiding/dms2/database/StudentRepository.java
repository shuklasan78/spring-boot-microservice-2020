package com.opleiding.dms2.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //This interface defines all the methods used for CRUD operations on the entity.
//Spring JPA also has one default implementation of the JpaRepository interface which is SimpleJpaRepository.
//JpaRepository has several methods like save, delete, count , findOne etc. These methods are implemented 
//by the SimpleJpaRepository class so we do not need to implement these methods.
public interface StudentRepository
        extends JpaRepository<StudentEntity, Long> {

}