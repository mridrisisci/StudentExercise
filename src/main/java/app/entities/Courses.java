package app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Courses
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String teacher;
    private String semester;
    private String classroom;
    private long courseStart;

    public Courses(String name, String teacher, String semester, String classroom, long courseStart)
    {
        this.name = name;
        this.teacher = teacher;
        this.semester = semester;
        this.classroom = classroom;
        this.courseStart = courseStart;
    }

}
