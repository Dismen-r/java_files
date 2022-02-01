package com.cpmg.day4;
class Shape
{
	public void drawShape()
	{
		System.out.println("Draw Shapes");
	}
}
class Line extends Shape
{
	public void Draw()
	{
		System.out.println("Line");
	}
	public void Draw(int a)
	{
		System.out.println("circle");
	}
	public void Draw(int a,int b)
	{
		System.out.println("Triangle");
	}
	public void Draw(int a,int b,int c)
	{
		System.out.println("Square");
	}
}
public class MyOverloading 
{
	public static void main(String args[])
	{
		Line r=new Line();
		r.Draw();
		r.Draw(1);
		r.Draw(1, 2);
		r.Draw(1, 2, 3);
		r.drawShape();
	}

}
