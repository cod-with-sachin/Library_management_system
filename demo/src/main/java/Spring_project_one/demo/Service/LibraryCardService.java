package Spring_project_one.demo.Service;

import Spring_project_one.demo.ENTITY.libraryCard;
import Spring_project_one.demo.Repository.CardRepository;
import Spring_project_one.demo.enumss.cardStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryCardService {

    @Autowired
    private CardRepository cardRepository;


    public String LibraryCardGenerated()
    {
        libraryCard newLibraryCard=new libraryCard();
        newLibraryCard.setCard_Status(cardStatus.NEW);
        libraryCard getLibraryCardNumber=cardRepository.save(newLibraryCard);
        return "new LibraryCard has been generated with the generated id is  " + getLibraryCardNumber.getCardId();
    }

}
