package Spring_project_one.demo.Controller;


import Spring_project_one.demo.ENTITY.Student;
import Spring_project_one.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student)
    {
        String result=studentService.addStudent(student);
        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }


    @PutMapping("/connectingStudentTolibraryCard")
    public ResponseEntity connectingStudentTolibraryCard(@RequestParam("studentId") int studentId ,
                                                         @RequestParam("cardId")Integer cardId)
    {
        try {
            String result = studentService.connectingStudentTolibraryCard(studentId, cardId);
            return  new ResponseEntity(result,HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }


    @GetMapping("/getStudentInformation")
    public ResponseEntity getStudentInformation(@RequestParam("studentId")int studentId)
    {
        try{
        Student student=studentService.getStudentInformation(studentId);
        return new ResponseEntity(student,HttpStatus.ACCEPTED);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

}
