package service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import repository.studentRepository;
import entity.Student;
import java.util.*;
@Service
public class studentService {
    @Autowired
    private studentRepository studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> addAllStudents(List<Student> students) {
        return studentRepo.saveAll(students);
    }


    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentByID(int regNumber) {
        return studentRepo.findById(regNumber).orElse(null);
    }

    public String deleteByID(int regNumber) {
        studentRepo.deleteById(regNumber);
        return "Student deleted";
    }
}
