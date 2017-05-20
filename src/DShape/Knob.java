/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DShape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/**
 *
 * @author Adrian
 */
public class Knob extends JComponent
{
	Point firstPoint;
	Point secondPoint;
	Point thirdPoint;
	Point fourthPoint;
	Color color;
        private final int ks = 11; // knob size
        private final int dx = ks - 5;
	public Knob(Point first, Point second, Point third , Point fourth)
	{
		color= Color.BLACK;
		firstPoint=first;
		secondPoint=second;
		thirdPoint=third;
		fourthPoint=fourth;
		
	}
	public Knob(Point first)
	{
		color= Color.BLACK;
		firstPoint=first;
		secondPoint=null;
	}
	public Knob(Point first, Point second)
	{
		color= Color.BLACK;
		firstPoint=first;
		secondPoint=second;
		thirdPoint=new Point(0,0);
		fourthPoint=null;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		if(secondPoint==null)
		{
			g.fillRect(firstPoint.x-dx,firstPoint.y-dx, ks, ks);
			return;
		}
		
		
		if(thirdPoint.x!=0)
		{
		g.fillRect(firstPoint.x-dx,firstPoint.y-dx, ks, ks);
		g.fillRect(secondPoint.x-dx, secondPoint.y-dx, ks, ks);
		g.fillRect(thirdPoint.x-dx,thirdPoint.y-dx, ks, ks);
		g.fillRect(fourthPoint.x-dx,fourthPoint.y-dx, ks, ks);
		}
		else
		{
			g.fillRect(firstPoint.x-dx,firstPoint.y-dx, ks, ks);
			g.fillRect(secondPoint.x-dx, secondPoint.y-dx, ks, ks);
		}
		
		
	}
	public void clear()
	{
		color= new Color(0,0,0,0);revalidate();
		repaint();
		color= Color.black;
		
	}
	
	public int getKnobPoint(Point p)
	{
		if(thirdPoint.x!=0)
		{
		
		if(new Rectangle(firstPoint.x-dx,firstPoint.y-dx, ks, ks).contains(p))
		{
			return 1;
		}
		if(new Rectangle(secondPoint.x-dx, secondPoint.y-dx, ks, ks).contains(p))
		{
			return 2;
		}
		if(new Rectangle(thirdPoint.x-dx,thirdPoint.y-dx, ks, ks).contains(p))
		{
			return 3;
		}
		if(new Rectangle(fourthPoint.x-dx,fourthPoint.y-dx, ks, ks).contains(p))
		{
			return 4;
		}
		}
		else
		{
			if(new Rectangle(firstPoint.x-dx,firstPoint.y-dx, ks, ks).contains(p))
			{
				return 1;
			}
			if(new Rectangle(secondPoint.x-dx, secondPoint.y-dx, ks, ks).contains(p))
			{
				return 2;
			}
		}
		return 0;
	}
	
}