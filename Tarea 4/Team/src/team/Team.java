/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */

public class Team 
{
	private final String  name;
        private final ArrayList<Player> members;
	private int maxSize;
	private int totalGoals=0;
	
	public Team(String name)
        {
            this.name = name;
            this.members = new ArrayList<>();
        }
        
        public void setMaxSize(int maxSize)
        {
            this.maxSize = maxSize;
	}
	
	public String getName()
	{
            return this.name;
	}
	
	public void addPlayer(Player play)
	{
            if(members.size()<this.maxSize)
            {
                this.members.add(play);
            }
	}
	
	public void printPlayers()
	{
            for(Player member : this.members) 
            {
                System.out.println(member);
            }
	}
	
	public int size()
	{
            return this.members.size();
	}
	
	public int goals()
	{
		
            for(Player member : this.members) 
            {
                this.totalGoals += member.goals();
            }
		
            return this.totalGoals;
	}
		
	public static void main(String[] args) 
	{

	    Team barcelona = new Team("FC Barcelona");
            barcelona.setMaxSize(11);

            Player brian = new Player("Brian");
            Player pekka = new Player("Pekka", 39);
            barcelona.addPlayer(brian);
            barcelona.addPlayer(pekka);
            barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

            System.out.println("Team: " + barcelona.getName());
            System.out.println("Number of players: " + barcelona.size());
            System.out.println("\nPlayer: " + pekka);
            System.out.println("Player: " + brian);
            System.out.println("Player: " + new Player("Mikael", 1));
            System.out.println("\nTotal goals: " + barcelona.goals());
        

	}
	
}


