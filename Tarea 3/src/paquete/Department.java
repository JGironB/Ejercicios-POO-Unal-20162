package paquete;

public class Department {
    private String name;
    
    public Department(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void printAllAttributes()
    {
    	System.out.println("Department's name: " + this.name);
    }
    
}
