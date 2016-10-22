package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundFigure extends Figure
{
	
	ArrayList <Figure> figures = new ArrayList<>();
	
	public CompoundFigure()
	{
		super(0, 0);
	}

	@Override
	public void draw(Graphics graphics)
	{
		for(Figure i: figures)
		{
			i.draw(graphics);
		}
	}
	
	public void add(Figure f)
	{
		figures.add(f);
	}
	
	@Override
	public void move(int dx, int dy)
	{
		for(Figure i: figures)
		{
			i.move(dx, dy);
		}
	}

}
