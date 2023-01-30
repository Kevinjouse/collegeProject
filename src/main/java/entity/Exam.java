package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Exam")
public class Exam {
    @Id
    @GeneratedValue
    @Column(name = "Exam_Code")
    private int examCode;
    @Column(name = "Name_of _the_Course")
    private String courseName;
    @Column(name = "Date_of_Exam")
    private Date date;
    @Column(name = "Session_of_Exam")
    private String session;
    @Column(name = "Room_number")
    private int roomNo;
}
