/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praveen
 */
public abstract class Shape
{
   int x;
   int y;
   final int z = 10;
   Shape(int x ,int y)
   {
   this.x=x;
   this.y=y;
   }
   void display()
   {
   System.out.println("displaying shape");
   }
   abstract void draw();// abstract method cnnot hvae a body 
  // {
   //System.out.println("drawing shape");
   //}
}
