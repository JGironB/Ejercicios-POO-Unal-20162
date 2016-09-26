package paquete;

public class Student 
{
    private String name;
    public double gpa;
    private Professor advisor;
    
    public Student(String name)
    {
        this.name = name;
        advisor = new Professor("Jorge Camargo","Computer Science");
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAdvisorsDepartment()
    {
               return advisor.getDepartment();  
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public void printAllAttributes()
    {
    	System.out.println("Student's name: " + this.name);
    	System.out.println("Advisor's department: " + this.advisor.getDepartment());
    	System.out.println("Student's gpa: " + this.gpa);
    }
    

    public static void main(String[] args) 
    {
        Student s = new Student("Juan Girón");
        Department d = new Department("Computer Science");
        Professor p = new Professor("Jorge Camargo", "Computer Science");
        
        d.printAllAttributes();
        System.out.println();
        p.printAllAttributes();
        System.out.println();
        s.printAllAttributes();
        
        
        
    }
    
}
