package Spring_project_one.demo.ENTITY;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AuthorId;
    private String authorName;
    private String gmailId;

}
