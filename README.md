# ShamikNandi-OOPsAssignmentSolution
 Following project shows the java concepts of inheritance and method overriding.
 Here we need to display the different Departments information.
 
 **Super Department** class will be the superclass and all other departments must extend it.
 We have a super class Super Department with following methods in it-
 i)  departmentName 
     - departmentName will return “ Super Department “
     
 ii)  getTodaysWork  
     - getTodaysWork will return  “ No Work as of now”
     
 iii) getWorkDeadline
    - getWorkDeadline will return “ Nil “
    
 iv) isTodayAHoliday
    - isTodayAHoliday will return “ Today is not a holiday”
    

**Admin department** will contain 3 methods of return type String and will not accept any parameter
i)  departmentName 
   - departmentName will return “ Admin Department

ii)  getTodaysWork  
   - getTodaysWork will return “Complete your documents Submission”

iii) getWorkDeadline
    - getWorkDeadline will return “ Complete by EOD “

**Hr department** will contain 4 methods of return type String and will not accept any parameter
i)  departmentName 
  - departmentName will return “ Hr Department “
  
ii)  getTodaysWork  
  - getTodaysWork will return  “ Fill today’s timesheet and mark your attendance”
 
iii) getWorkDeadline
  - getWorkDeadline will return “ Complete by EOD “

iv) doActivity
   - doActivity “team Lunch”

**Tech department** will contain 4 methods of return type String and will not accept any parameter
 i)  departmentName 
    - departmentName will return “ Tech Department “
    
ii)  getTodaysWork  
    - getTodaysWork will return  “ Complete coding of module 1”
    
iii) getWorkDeadline
    - getWorkDeadline will return “ Complete by EOD “
    
iv) getTechStackInformation
   - getTechStackInformation will return “core Java”

Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
→ Each department will display all its functionalities.
→ Each department  will display whether today is a holiday or not with the help of the Super Department. (SuperDepartment will act as a super class for all the departments)


Expected Output:-

Welcome to Admin Department
Complete your documents submission
Complete by EOD 
Today is not a Holiday

Welcome to HR Department
team Lunch
Fill today’s timesheet and mark your attendance
Complete by EOD 
Today is not a Holiday


Welcome to Tech Department
Complete coding of Module 1
Complete by EOD 
Core Java 
Today is not a Holiday


