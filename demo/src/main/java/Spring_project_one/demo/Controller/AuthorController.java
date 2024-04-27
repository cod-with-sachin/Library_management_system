package Spring_project_one.demo.Controller;

import Spring_project_one.demo.ENTITY.Author;
import Spring_project_one.demo.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public ResponseEntity addAuthor(@RequestBody Author author)
    {
        String result=authorService.addAuthor(author);
        return new ResponseEntity(result, HttpStatus.CREATED);
    }

}
