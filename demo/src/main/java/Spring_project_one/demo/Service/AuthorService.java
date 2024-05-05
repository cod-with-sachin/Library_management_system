package Spring_project_one.demo.Service;

import Spring_project_one.demo.DataTransferObjects.DTOauthorUpdateRequest;
import Spring_project_one.demo.ENTITY.Author;
import Spring_project_one.demo.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public String addAuthor(Author author)
    {
        authorRepository.save(author);
        return "author details add successfully";
    }

    public String updateAuthorName(DTOauthorUpdateRequest dtOauthorUpdateRequest)
    {
        Integer AuthorId= dtOauthorUpdateRequest.getAuthorId();
        String  authorName= dtOauthorUpdateRequest.getAuthorName();
        Author author=authorRepository.findById(AuthorId).get();
        author.setAuthorName(authorName);
        authorRepository.save(author);
        return "Author name has been updated successfully";
    }
}
