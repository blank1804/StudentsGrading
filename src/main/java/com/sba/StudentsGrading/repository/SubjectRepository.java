package com.sba.StudentsGrading.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sba.StudentsGrading.model.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>  {



}