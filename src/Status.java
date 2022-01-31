
//Programmer: Anita Mehrazarin

public class Status
{
    private int hitPoints, hunger, sleepiness;

    public Status (int hP, int h, int s)
    {
        //ensures that the variables are between the right numbers
        if (hP<25 && hP>0)
        {
            hitPoints=hP;
        }

        //secretly fixes the issue if it is too large or too small
        else if (hP>25)
        {
            set_hitPoints(25);
        }
        else if (hP<0)
        {
            set_hitPoints(0);
        }

        if (h<15 && h>0)
        {
            hunger=h;
        }
        else if (hunger>15)
        {
            setHunger(15);
        }
        else if (hunger<0)
        {
            setHunger(0);
        }

        if (s<15 && s>0)
        {
            sleepiness = s;
        }
        else if (s>15)
        {
            setSleepiness(15);
        }
        else if (s<0)
        {
            setSleepiness(0);
        }
    }

    //copy constructor
    public Status (Status obj1)
    {
        hitPoints=obj1.hitPoints;
        hunger=obj1.hunger;
        sleepiness=obj1.sleepiness;
    }

    //setting up the three "set" methods
    public void set_hitPoints(int x)
    { hitPoints=x; }

    public void setHunger(int x)
    { hunger=x; }

    public void setSleepiness(int x)
    { sleepiness=x; }

    //setting up the three "get" methods
    public int get_hitPoints()
    { return hitPoints; }

    public int getHunger()
    { return hunger; }

    public int getSleepiness()
    { return sleepiness; }

    //delta method to add
    public void add_hitPoints(int delta)
    {
        if (delta>0 && get_hitPoints()<25) {
            set_hitPoints(get_hitPoints() - delta);
        }
        if (delta<0 && get_hitPoints()>0) {
            set_hitPoints(get_hitPoints() + delta);
        }
    }
    public void addHunger(int delta)
    {
        if (delta>0 && getHunger()<25) {
            setHunger(getHunger() - delta);
        }
        if (delta<0 && getHunger()>0) {
            setHunger(getHunger() + delta);
        }
    }
    public void addSleepiness(int delta)
    {
        if (delta>0 && getSleepiness()<25) {
            setSleepiness(getSleepiness() - delta);
        }
        if (delta<0 && getSleepiness()>0) {
            setSleepiness(getSleepiness() + delta);
        }
    }

    //toString method
    @Override
    public String toString () {
        return ("Hit points: "+hitPoints+ " Hunger: " +hunger + " Sleepiness: " +sleepiness);
    }

    //equals method
    @Override
    public boolean equals(Object other)
    {
        if (other == null || getClass() != other.getClass())
        {
            return false;
        }
        else
        {
            Status otherStatus = (Status) other;
            if (otherStatus.get_hitPoints() == get_hitPoints()
                    && otherStatus.getHunger()==getHunger() && otherStatus.getSleepiness() == getSleepiness())
            {
                return true;
            }
        }
        return false;
    }

}
