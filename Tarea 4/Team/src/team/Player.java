/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

/**
 *
 * @author Estudiante
 */

public class Player
{
	String name;
        int n_goals=0;
	
	public Player(String name)
	{
		this.name = name;
	}
	
	public Player(String name, int n_goals)
	{
		this.name = name;
		this.n_goals = n_goals;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int goals()
	{
		return n_goals;
	}
	
	public String toString()
	{
		return this.name + ", goals " + this.n_goals;
	}
	
}
