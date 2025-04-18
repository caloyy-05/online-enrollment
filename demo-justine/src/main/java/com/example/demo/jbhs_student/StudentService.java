package com.example.demo.jbhs_student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Add a new student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update student details
    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setStudentNumber(updatedStudent.getStudentNumber());
                    student.setFirstName(updatedStudent.getFirstName());
                    student.setLastName(updatedStudent.getLastName());
                    student.setMiddleInitial(updatedStudent.getMiddleInitial());
                    student.setGender(updatedStudent.getGender());
                    student.setNationality(updatedStudent.getNationality());
                    student.setDateOfBirth(updatedStudent.getDateOfBirth());
                    student.setPlaceOfBirth(updatedStudent.getPlaceOfBirth());
                    student.setEmail(updatedStudent.getEmail());
                    student.setMobileNumber(updatedStudent.getMobileNumber());
                    student.setCivilStatus(updatedStudent.getCivilStatus());
                    student.setYearLVL(updatedStudent.getYearLVL());
                    student.setCourseProg(updatedStudent.getCourseProg());
                    student.setAge(updatedStudent.getAge());

                    // Address Information
                    student.setHomeAddress(updatedStudent.getHomeAddress());
                    student.setCity(updatedStudent.getCity());
                    student.setProvince(updatedStudent.getProvince());
                    student.setCountry(updatedStudent.getCountry());
                    student.setZipCode(updatedStudent.getZipCode());
                    student.setTelephoneNumber(updatedStudent.getTelephoneNumber());

                    // Parent Information
                    student.setFatherName(updatedStudent.getFatherName());
                    student.setFatherTelephone(updatedStudent.getFatherTelephone());
                    student.setMotherName(updatedStudent.getMotherName());
                    student.setMotherTelephone(updatedStudent.getMotherTelephone());

                    // Emergency Contact Information
                    student.setEmergencyContactName(updatedStudent.getEmergencyContactName());
                    student.setEmergencyContactRelation(updatedStudent.getEmergencyContactRelation());
                    student.setEmergencyContactAddress(updatedStudent.getEmergencyContactAddress());
                    student.setEmergencyContactCity(updatedStudent.getEmergencyContactCity());
                    student.setEmergencyContactProvince(updatedStudent.getEmergencyContactProvince());
                    student.setEmergencyContactCountry(updatedStudent.getEmergencyContactCountry());
                    student.setEmergencyContactZipCode(updatedStudent.getEmergencyContactZipCode());
                    student.setEmergencyContactTelephone(updatedStudent.getEmergencyContactTelephone());
                    student.setEmergencyContactEmail(updatedStudent.getEmergencyContactEmail());

                    return studentRepository.save(student);
                })
                .orElseThrow(() -> new IllegalStateException("Student with ID " + id + " not found"));
    }


    // Delete a student by ID
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new IllegalStateException("Student with ID " + id + " does not exist");
        }
        studentRepository.deleteById(id);
    }
}
