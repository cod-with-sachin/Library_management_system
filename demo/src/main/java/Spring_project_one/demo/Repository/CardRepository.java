package Spring_project_one.demo.Repository;

import Spring_project_one.demo.ENTITY.libraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<libraryCard,Integer> {

}
