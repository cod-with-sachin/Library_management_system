package Spring_project_one.demo.ENTITY;


import Spring_project_one.demo.enumss.cardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
public class libraryCard {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer cardId;


    @Enumerated(value=EnumType.STRING)
    private cardStatus card_Status;


   private int totalNumberOfBookIssued;


    @JoinColumn
    @OneToOne
    private Student student;

}
