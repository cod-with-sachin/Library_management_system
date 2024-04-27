package Spring_project_one.demo.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AuthorId;
    private String authorName;
    private String gmailId;


//    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
//    private List<Integer> book=new ArrayList<>();

}
