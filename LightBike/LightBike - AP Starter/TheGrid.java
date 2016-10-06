import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheGrid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheGrid extends World
{

    public TheGrid()
    {    
        super(700, 600, 1);
        Greenfoot.setSpeed( 50 );
        setPaintOrder( Player.class, Line.class );
    }   
}
