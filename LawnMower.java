import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class LawnMower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LawnMower extends Actor
{
    private boolean move = false;
    public void act() 
    {
        if (FrontYard.getPlaying())
        {
            if(move)
            {
                setLocation(getX() + 10, getY());
                if(getIntersectingObjects( Zombie.class ) != null)
                {
                    List list = getObjectsAtOffset(0, 0, Zombie.class);
                    for(Object obj:list)
                    {
                        if(!((Zombie)(obj)).isDead())
                        ((Zombie)(obj)).mow();
                    }
                }
            }
            else
            {
                if(Greenfoot.mouseClicked((Object)(this)) || 
                (getOneIntersectingObject( Zombie.class) != null))
                {
                    List list = getIntersectingObjects( Zombie.class );
                    for(Object obj:list)
                    {
                        if(((Zombie)(obj)).getY() < getY() + 20 && ((Zombie)(obj)).getY() > getY() - 20
                        && ((Zombie)(obj)).getX() < 70)
                        {
                            move = true;
                        }
                    }
                }
            }
            if(getX()> 790)
            {
                getWorld().removeObject(this);
            }
            }
    }    
}
