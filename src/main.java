
//Programmer: Anita Mehrazarin

public class main
{
    public static void main (String []args) {
        try
        {
            Player p1 = new Player("Ani", 1, new Stats(13, 5, 2), new Status(20, 12, 8));
            System.out.println(p1);
        }

        catch (Exception IllegalArgumentException)
        {
            System.out.println("Error ");
        }

        try
        {
            Player p2 = new Player("Samu", 6, new Stats(9, 8, 2), new Status(4, 5, 8));
        }

        catch (Exception IllegalArgumentException)
        {
            System.out.println("Error ");
        }

        try
        {
            Player p3 = new Player("Kitty", 8, new Stats(5, 12, 3), new Status(26, 10, 9));
            System.out.println(p3.toString());
        }

        catch (Exception IllegalArgumentException)
        {
            System.out.println("Error ");
        }

        try
        {
            Player p4 = new Player("Elmo", 8, new Stats(5, 12, 3), new Status(23, 10, 9));
            System.out.println(p4.toString());
        }

        catch (Exception IllegalArgumentException)
        {
            System.out.println("Error ");
        }

    }
}
//this is an extra comment that was made on 01/30/2022