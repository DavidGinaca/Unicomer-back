package com.unicomer.backTechfob.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unicomer.backTechfob.Model.Person;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer> {

}
