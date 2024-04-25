package Spring_project_one.demo.ENTITY;


import Spring_project_one.demo.enumss.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer bookId;

    @Enumerated(value=EnumType.STRING)
    private Genre genre;

    private int totalNoPage;
    private Date published;

}
