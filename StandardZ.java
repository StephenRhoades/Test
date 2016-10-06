import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StandardZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandardZ extends Zombie
{

    public StandardZ()
    {
        super(new GifImage("Zombie.gif"), new GifImage("ZombieLostHead.gif"), new GifImage("ZombieLostHeadAttack.gif"),
        new GifImage("ZombieAttack.gif"), new GifImage("ZombieDie.gif"), 10, 0, 5);
    }
    public void act() 
    {
        super.act();
    }    
    public void die()
    {
        super.die();
        FrontYard.incScore(1);
    }
}
