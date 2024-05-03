package com.jpa.test.demodb;

import com.jpa.test.demodb.student.Student;
import com.jpa.test.demodb.student.UserRepository;
import org.hibernate.id.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.*;

@SpringBootApplication
public class DemodbApplication {

    public static void main(String[] args) {

    ConfigurableApplicationContext context=SpringApplication.run(DemodbApplication.class, args);
        UserRepository userRepository=context.getBean(UserRepository.class);

      //  Student s1= new Student();
       // s1.setFirstName("kshitiz");
        //s1.setLastName("upadhayaya");
       // s1.setAge(15);
        //s1.setFaculty("Bese");


        //Student result=userRepository.save(s1);




//       Student user1=new Student();
//        user1.setFirstName("ll");
//        user1.setLastName("lalitpusdd");
//        user1.setAge(12);
//        user1.setFaculty("It");
//
//
//        Student user2=new Student();
//        user2.setFirstName("ll");
//        user2.setLastName("lalitpusdd");
//        user2.setAge(12);
//        user2.setFaculty("It");
//
//
//        Student user3=new Student();
//        user3.setFirstName("ll");
//        user3.setLastName("lalitpusdd");
//        user3.setAge(12);
//        user3.setFaculty("It");
//
//
//
//
//        List<Student> users= List.of(user1,user2,user3);
//        Iterable<Student> result=userRepository.saveAll(users);
//
//        result.forEach(Student-> {
//            System.out.println(users);
//        });
 //       System.out.println("done");





        //   TO UPDATE using id
//          find by id   return optiona; containing your data



//       Optional<Student> optional= userRepository.findById(104);
//         Student student      =  optional.get();
//        System.out.println(student);
//        student.setFirstName("raju raja ram");
//        student.setLastName("raju ");
//
//        Student result=userRepository.save(student);



 //            to get whole data


//        Iterable<Student> students=userRepository.findAll();
//
//        students.forEach(student ->
//        {
//            System.out.println(students);
//        });


        // deleting the user element

       userRepository.deleteById(103);
        System.out.println("deleted");

      // to delete all

//        Iterable<Student> students=userRepository.findAll();
//        students.forEach(   Student -> {
//            System.out.println(students);
//        });
//      userRepository.deleteAll(students);



    }
    }


