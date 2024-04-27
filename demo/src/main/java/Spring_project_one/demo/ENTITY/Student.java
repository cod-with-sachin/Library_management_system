package Spring_project_one.demo.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    private String name;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;

    private String branch;

    private String phoneNo;


    @OneToOne(mappedBy = "student",cascade =CascadeType.ALL)
    private libraryCard librarycard;


}
