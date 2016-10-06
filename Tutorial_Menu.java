import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial_Menu extends Actor
{
    public void act() 
    {
        MouseInfo ms = Greenfoot.getMouseInfo();
        if(ms != null && ms.getX() < getX() + 145 && ms.getX() > getX() - 145 && ms.getY() < getY() + 30 && 
        ms.getY() > getY() - 30 )
        {
            setImage(new GreenfootImage("Tutorial2.png"));
            if(Greenfoot.mouseClicked(this))
            {
                Tutorial tut = new Tutorial();
                getWorld().addObject(tut, 450,300);
            }
        }
        else
        {
            setImage(new GreenfootImage("Tutorial1.png"));
        }
    }      
}
