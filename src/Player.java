
//Programmer: Anita Mehrazarin

public class Player
{
    //private variables for security
    private Status status1;
    private Stats stats1;
    private int experience;
    private String name;
    private int id;
    private static int count=0;

    //constructor
    public Player(String n, int ex, Stats s, Status st)
    {
        name=n;
        experience=ex;
        stats1= new Stats(s);
        status1=new Status(st);
        id=count++;
    }

    //copy constructor
    public Player(Player obj)
    {
        name=obj.name;
        experience=obj.experience;
        stats1=obj.stats1;
        status1=obj.status1;
        id=obj.id;
    }

    // get methods
    public String getName()
    {
        return name;
    }

    public int getExperience()
    {
        return experience;
    }

    public Status getStatus()
    {
        return new Status(status1);
    }

    public Stats getStats()
    {
        return new Stats (stats1);
    }

    // set methods
    public void setName(String x)
    {
        name=x;
    }

    public void setExperience(int x)
    {
        experience=x;
    }

    public void setStatus(Status status1)
    {
        this.status1= status1;
    }

    public void setStats(Stats stats1)
    {
        this.stats1=stats1;
    }

    public void addExperience(int x)
    {
        experience=experience+x;
    }

    public static int getNumPlayers()
    {
        return count;
    }

    //toString method
    @Override
    public String toString() {
        return "Player: " +
                " Status=" + status1 +
                " Stats=" + stats1 +
                " Experience: " + experience +
                " Name: " + name +
                " ID: " + id ;
    }

    //equals method
    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        } else {
            Player otherPlayer = (Player) other;
            if (otherPlayer.getName() == getName()
                    && otherPlayer.getExperience() == getExperience() && otherPlayer.getStatus() == getStatus()
                    && otherPlayer.getStats() == getStats()) {
                return true;
            }
        }
        return false;
    }

}

