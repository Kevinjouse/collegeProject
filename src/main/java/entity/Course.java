package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "CourseID", unique = true)
    private int courseID;
    @Column(name = "Course_Name")
    private String courseName;
    @Column(name = "Duration_of_Course")
    private int duration;
    @Column(name = "Subjects")
    private String subjects;
}
