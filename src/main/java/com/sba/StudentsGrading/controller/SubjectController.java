package com.sba.StudentsGrading.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba.StudentsGrading.model.Subject;
import com.sba.StudentsGrading.exception.ResourceNotFoundException;
import com.sba.StudentsGrading.repository.SubjectRepository;


import org.springframework.validation.annotation.Validated;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectRepository subjectRepository;

	@GetMapping("/search")
	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

	@GetMapping("/subjects/{id}")
	public ResponseEntity<Subject> getSubjectById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Subject subject = subjectRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + id));
		return ResponseEntity.ok().body(subject);
	}

	@PostMapping("/save")
	public Subject createSubject(@RequestBody Subject subject) {
		return subjectRepository.save(subject);
	}
	

	@PutMapping("/subjects/{id}")
	public ResponseEntity<Subject> updateSubject(@PathVariable(value = "id") Long id,
			@Validated @RequestBody Subject subjectDetails) throws ResourceNotFoundException {
		Subject subject = subjectRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + id));

		subject.setSubjectId(subjectDetails.getSubjectId());
		subject.setSubjectName(subjectDetails.getSubjectName());
		subject.setSubjectCredit(subjectDetails.getSubjectCredit());
		final Subject updatedSubject = subjectRepository.save(subject);
		return ResponseEntity.ok(updatedSubject);
	}

	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteSubject(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Subject subject = subjectRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + id));

		subjectRepository.delete(subject);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}