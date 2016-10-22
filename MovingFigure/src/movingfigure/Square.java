package movingfigure;

import java.awt.Graphics;

public class Square extends Figure
{
	private  int sideLenght;
	
	public Square(int x, int y, int side) 
	{
		super(x, y);
		
		this.sideLenght = side;
	}

	@Override
	public void draw(Graphics graphics) 
	{
		graphics.fillRect(x, y, this.sideLenght, this.sideLenght);
	}

}
