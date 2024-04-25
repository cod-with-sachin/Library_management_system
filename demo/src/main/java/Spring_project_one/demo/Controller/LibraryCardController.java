package Spring_project_one.demo.Controller;

import Spring_project_one.demo.Service.LibraryCardService;
import Spring_project_one.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/LibraryCard")
public class LibraryCardController {

    @Autowired
    private LibraryCardService libraryCardService;

    @PostMapping("/LibraryCardGenerated")
    public ResponseEntity LibraryCardGenerated()
    {
        String result=libraryCardService.LibraryCardGenerated();
        return new ResponseEntity(result, HttpStatus.ACCEPTED);
    }


}
