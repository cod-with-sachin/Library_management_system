package Spring_project_one.demo.Service;

import Spring_project_one.demo.ENTITY.Student;
import Spring_project_one.demo.ENTITY.libraryCard;
import Spring_project_one.demo.Repository.CardRepository;
import Spring_project_one.demo.Repository.StudentRepository;
import Spring_project_one.demo.enumss.cardStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CardRepository cardRepository;
    public String addStudent(Student student)
    {
        studentRepository.save(student);
        return "Student add successfully in the database";
    }



    public String connectingStudentTolibraryCard(int studentId,Integer cardId)throws Exception
    {
        Optional<Student> optionalStudent=studentRepository.findById(studentId);
        if(optionalStudent.isEmpty())
        {
            throw new Exception("StudentId incorrect");
        }

        Optional<libraryCard> optionalLibraryCard=cardRepository.findById(cardId);

        if(optionalLibraryCard.isEmpty())
        {
            throw new Exception("cardId incorrect");
        }

        libraryCard newlibraryCard=cardRepository.findById(cardId).get();
        newlibraryCard.setCard_Status(cardStatus.ACTIVE);
        Student student=optionalStudent.get();
        newlibraryCard.setStudent(student);

        return "Student connecting with LibraryCard";

    }


    public Student getStudentInformation(int studentId)throws Exception
    {
        Optional<Student> optionalStudent=studentRepository.findById(studentId);
        if(optionalStudent.isEmpty()){
            throw new Exception("StudentId is incorrected");
        }
        Student student=optionalStudent.get();
        student.setAge(17);
        studentRepository.save(student);
        return student;
    }


    public String deleteStudent(int studentId)throws Exception
    {
        Optional<Student> optionalStudent=studentRepository.findById(studentId);
        if(optionalStudent.isEmpty()){
            throw new Exception("Invalid studentId ");
        }
        studentRepository.deleteById(studentId);
        return "student detail delete successfully in the database";
    }

    public String updateStudentAge(int studentId,int age)throws Exception
    {
        Optional<Student> optionalStudent=studentRepository.findById(studentId);
        if(optionalStudent.isEmpty()){
            throw new Exception("Student Id is Invalid ");
        }

        Student student=optionalStudent.get();
        student.setAge(age);
        studentRepository.save(student);
        return "Student age update successfully";
    }
}
