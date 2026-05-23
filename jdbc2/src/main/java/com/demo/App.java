package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
        
        StudentDao sd=new StudentDao();
        //============Insert Student =====================
//        Student s1=new Student();
//        s1.setName("Mohit");
//        s1.setCity("Amt");
//        s1.setPercentage(81.90);
//      int result =sd.inserStudent(s1);
//      System.out.println(result);
        
        
// ++++++++++++++++++++ Deleted Student ++++++++++++++++++++++++++++++       
//       int result = sd.deleteStudent(5);
//       System.out.println(result);
     
  ///     +++++++++++++++ Find Student by ID ++++++++++++++++++++++++++++++++++
                    
//          Student student= sd.findStudentById(1);
//          System.out.println(student);
        
        
 //++++++++++ Find All Student ++++++++++++++++++++++++++    
        List<Student> l=sd.findAllStudent();
          for(Student s:l)
        	  System.out.println(s);
          
  //++++++++++ Update Student ++++++++++++++++++++++++++   
//        Student s1=sd.findStudentById(4);
//        s1.setCity("Amt");
//        System.out.println(sd.updateStudent(s1));
        	  
    }
    
}
