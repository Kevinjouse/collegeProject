package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Register_Number")
    private int regNumber;
    @Column(name = "Name")
    private String studentName;
    @Column(name = "Date_Of_Birth")
    private LocalDate dob;
    @Column(name = "Phone_Number")
    private int phone;
    @Column(name = "Gender")
    private String gender;
}
