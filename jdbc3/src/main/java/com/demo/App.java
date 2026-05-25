package com.demo;

import java.util.List;
import java.util.Random;

import com.dao.EmployeeDao;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
     EmployeeDao ed=new EmployeeDao();
//     Random r=new Random();
//     String[] designations = {
//    		    "Associate Software Engineer",
//    		    "Graduate Trainee Engineer",
//    		    "Trainee Software Engineer",
//    		    "Junior Java Developer",
//    		    "Senior Java Developer",
//    		    "J2EE Developer",
//    		    "Spring Boot Developer",
//    		    "Microservices Developer",
//    		    "API Developer",
//    		    "Software Consultant",
//    		    "Technical Consultant",
//    		    "IT Support Engineer",
//    		    "Desktop Support Engineer",
//    		    "Cloud Architect",
//    		    "Solution Architect",
//    		    "Site Reliability Engineer",
//    		    "Data Engineer",
//    		    "Big Data Engineer",
//    		    "ETL Developer",
//    		    "BI Developer",
//    		    "Power BI Developer",
//    		    "Tableau Developer",
//    		    "AI/ML Developer",
//    		    "Blockchain Developer",
//    		    "Game Developer",
//    		    "Embedded Systems Engineer",
//    		    "Firmware Engineer",
//    		    "Security Engineer",
//    		    "Penetration Tester",
//    		    "Ethical Hacker",
//    		    "Linux Administrator",
//    		    "Windows Administrator",
//    		    "Salesforce Developer",
//    		    "SAP Consultant",
//    		    "CRM Developer",
//    		    "ERP Consultant",
//    		    "Mobile App Developer",
//    		    "Flutter Developer",
//    		    "React Native Developer",
//    		    "Kotlin Developer",
//    		    "PHP Developer",
//    		    "Node.js Developer",
//    		    "C++ Developer",
//    		    ".NET Developer",
//    		    "Unity Developer",
//    		    "AR/VR Developer",
//    		    "Technical Writer",
//    		    "Release Manager",
//    		    "Build Engineer",
//    		    "Performance Tester"
//    		};
//     String[] companies = {
//    		    "Google",
//    		    "Microsoft",
//    		    "Amazon",
//    		    "Apple",
//    		    "Meta",
//    		    "Netflix",
//    		    "Tesla",
//    		    "NVIDIA",
//    		    "Samsung",
//    		    "Intel",
//    		    "AMD",
//    		    "Cisco",
//    		    "Oracle",
//    		    "Adobe",
//    		    "Salesforce",
//    		    "SAP",
//    		    "Uber",
//    		    "Airbnb",
//    		    "Spotify",
//    		    "LinkedIn",
//    		    "PayPal",
//    		    "Visa",
//    		    "Mastercard",
//    		    "Goldman Sachs",
//    		    "JPMorgan Chase",
//    		    "Barclays",
//    		    "Morgan Stanley",
//    		    "Infosys",
//    		    "TCS",
//    		    "Wipro",
//    		    "HCL",
//    		    "Tech Mahindra",
//    		    "Cognizant",
//    		    "Capgemini",
//    		    "Accenture",
//    		    "Persistent",
//    		    "Mphasis",
//    		    "LTIMindtree",
//    		    "Virtusa",
//    		    "EPAM Systems",
//    		    "Cybage",
//    		    "PubMatic",
//    		    "eClerx",
//    		    "Globant",
//    		    "Amdocs",
//    		    "Synechron",
//    		    "Yash Technologies",
//    		    "Birlasoft",
//    		    "KPIT",
//    		    "Zensar Technologies"
//    		};
//     for(int i=1;i<5000;i++) {
//    	 Employee e=new Employee();
//        e.setCompany(companies[r.nextInt(companies.length)]);
//        e.setDesignation(designations[r.nextInt(designations.length)]);
//        e.setSalary(r.nextInt(201)*10000);
//    	 StringBuilder sb=new StringBuilder();
//        for(int j=1;j<15;j++)
//             sb.append((char)(r.nextInt(26)+65));
//             e.setName(sb.toString());
//        
//       
//        System.out.println(ed.insertEmployee(e));
//     }
//    
 //+++++++++++++++++++++ Delete Employee By Id ++++++++++++++++++++++++
//         int check = ed.deleteEmpolyeeById(22);
//         System.out.println(check);
     
     
     //+++++++++++++++++++++ Find Employee By Id ++++++++++++++++++++++++    
     
//     Employee e=ed.findEmployeeById(2);
//     System.out.println(e);
     
     //+++++++++++++++++++++ Find All Employee By Id ++++++++++++++++++++++++    
     
      List<Employee> list=ed.findAllEmployee();
            for(Employee e:list)   
            	System.out.println(e);
    }
}
