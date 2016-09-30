package mypackage;

import java.util.ArrayList;
public class Jumpers {
    private ArrayList<Jumper> jumpers;
    
    public Jumpers () {
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public ArrayList<Jumper> getJumpers() {
        return this.jumpers;
    }
    
    public void add (String name) {
        Jumper jumper = new Jumper(name);
        jumpers.add(jumper);
    }
    
    public void showJumpers() {
        int count = 1;
       
        System.out.println("Position    Name");
        for (Jumper jumper : jumpers) {
            System.out.println(count + "          " + jumper.getName() + " (" + 
                    jumper.getScore() + " points)");
            count++;
        }
    }
    
    
}
