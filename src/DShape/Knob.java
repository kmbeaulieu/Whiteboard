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
			g.fillRect(firstPoint.x-5,firstPoint.y-5, 10, 10);
			return;
		}
		
		
		if(thirdPoint.x!=0)
		{
		g.fillRect(firstPoint.x-5,firstPoint.y-5, 10, 10);
		g.fillRect(secondPoint.x-5, secondPoint.y-5, 10, 10);
		g.fillRect(thirdPoint.x-5,thirdPoint.y-5, 10, 10);
		g.fillRect(fourthPoint.x-5,fourthPoint.y-5, 10, 10);
		}
		else
		{
			g.fillRect(firstPoint.x-5,firstPoint.y-5, 10, 10);
			g.fillRect(secondPoint.x-5, secondPoint.y-5, 10, 10);
		}
		
		
	}
	public void clear()
	{
		color= new Color(0,0,0,0);revalidate();
		repaint();
		color= Color.black;
		
	}
	
	public boolean contains(Point p)
	{
		if(thirdPoint.x!=0)
		{
		
		if(new Rectangle(firstPoint.x-5,firstPoint.y-5, 10, 10).contains(p))
		{
			return true;
		}
		if(new Rectangle(secondPoint.x-5, secondPoint.y-5, 10, 10).contains(p))
		{
			return true;
		}
		if(new Rectangle(thirdPoint.x-5,thirdPoint.y-5, 10, 10).contains(p))
		{
			return true;
		}
		if(new Rectangle(fourthPoint.x-5,fourthPoint.y-5, 10, 10).contains(p))
		{
			return true;
		}
		}
		else
		{
			if(new Rectangle(firstPoint.x-5,firstPoint.y-5, 10, 10).contains(p))
			{
				return true;
			}
			if(new Rectangle(secondPoint.x-5, secondPoint.y-5, 10, 10).contains(p))
			{
				return true;
			}
		}
		return false;
	}
        public boolean containsFirstKnob(Point p){
            return new Rectangle(firstPoint.x-5,firstPoint.y-5, 10, 10).contains(p);
        }
        public boolean containsSecondKnob(Point p){
            return new Rectangle(secondPoint.x-5, secondPoint.y-5, 10, 10).contains(p);
        }
        public boolean containsThirdKnob(Point p){
            return new Rectangle(thirdPoint.x-5,thirdPoint.y-5, 10, 10).contains(p);
        }
        public boolean containsFourthKnob(Point p){
            return new Rectangle(fourthPoint.x-5,fourthPoint.y-5, 10, 10).contains(p);
        }
	
	public Point getFirstKnob(Point p)
	{
		if(firstPoint.x-5<p.x && p.x<firstPoint.x+5 && firstPoint.y-5<p.y && p.y<firstPoint.y+5)
		{
		return firstPoint;
		}
		if(secondPoint.x-5<p.x && p.x<secondPoint.x+5 && secondPoint.y-5<p.y && p.y<secondPoint.y+5)
		{
		return secondPoint;
		}
		if(thirdPoint.x-5<p.x && p.x<thirdPoint.x+5 && thirdPoint.y-5<p.y && p.y<thirdPoint.y+5)
		{
			return thirdPoint;
		}
		if(fourthPoint.x-5<p.x && p.x<fourthPoint.x+5 && fourthPoint.y-5<p.y && p.y<fourthPoint.y+5)
		{
			return fourthPoint;
		}
		return null;
	}

	
}