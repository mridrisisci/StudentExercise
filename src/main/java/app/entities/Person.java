package app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private long phone;
    private int age;
    private String address;
    private LocalDate dateOfBirth;
    private LocalDate enrollmentData;



    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }



}
