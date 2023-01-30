package controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import entity.Student;
import repository.studentRepository;
import service.studentService;
import java.util.*;
@RestController
public class studentController {
    @Autowired
    private studentService studentService;
    @Autowired
    private studentRepository studentRepo;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.addAllStudents(students);
    }
    @GetMapping("/getAllStudents")
    public List<Student>getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/getStudent/{regNumber}")
    public Student getStudentByID(@PathVariable int regNumber) {
        return studentService.getStudentByID(regNumber);
    }
    @DeleteMapping("/deleteStudent/{regNumber}")
    public String deleteByID(@PathVariable int regNumber) {
        return studentService.deleteByID(regNumber);
    }
}
