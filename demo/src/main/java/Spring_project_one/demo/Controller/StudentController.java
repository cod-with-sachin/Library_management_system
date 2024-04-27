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

    @DeleteMapping("/deleteStudent")
    public ResponseEntity deleteStudent(@RequestParam("studentId") int studentId)
    {
        try{
            String result=studentService.deleteStudent(studentId);
            return new ResponseEntity(result,HttpStatus.ACCEPTED);
        }
        catch(Exception e)
        {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/updateStudentAge")
    public ResponseEntity updateStudentAge(@RequestParam("studentId")int studentId,@RequestParam("age") int age)throws Exception
    {
        try{
            String result=studentService.updateStudentAge(studentId,age);
            return new  ResponseEntity(result,HttpStatus.ACCEPTED);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

}
