package paquete;

public class Professor {
    private String name;
    public Department department;
    
    public Professor(String name, String department){
        this.name = name;
        this.department = new Department(department);
    }
    
    public String getDepartment(){
        return department.getName();
    }
    
    public String getname(){
        return name;
    }
    
    public void printAllAttributes()
    {
    	System.out.println("Professor's name: " + this.name);
    	System.out.println("Professor's department: " + this.department.getName());
    }
    
}
