
//Programmer: Anita Mehrazarin

public class Stats {
    //private variables for security
    private int strength;
    private int intelligence;
    private int stamina;

    //main constructor
    public Stats(int stamina, int intelligence, int strength) {
        if ((stamina >= 1) && (stamina <= 12) && ((stamina + intelligence + strength) == 20)) {
            this.stamina = stamina;
        } else {
            throw new IllegalArgumentException("Invalid input for strength");
        }
        if ((intelligence >= 1) && (intelligence <= 12) && ((stamina + intelligence + strength) == 20)) {
            this.intelligence = intelligence;
        } else {
            throw new IllegalArgumentException("Invalid input for intelligence");
        }
        if ((strength >= 1) && (strength <= 12) && ((stamina + intelligence + strength) == 20)) {
            this.strength = strength;
        } else {
            throw new IllegalArgumentException("Invalid input for stamina");
        }
    }

    //copy constructor
    public Stats(Stats obj1) {
        strength = obj1.strength;
        intelligence = obj1.intelligence;
        stamina = obj1.stamina;
    }

    //get methods
    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStamina() {
        return stamina;
    }

    public void moveStrengthToIntelligence(int amount) {
        if (amount < 0 && amount > 12) {
            strength = strength - amount;
            intelligence = intelligence + amount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    //toString method
    @Override
    public String toString() {
        return ("Strength: " + strength + " Intelligence: " + intelligence + " Stamina: " + stamina);
    }

    //equals method
    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        } else {
            Stats otherStats = (Stats) other;
            if (otherStats.getStrength() == getStrength() && otherStats.getIntelligence() == getIntelligence() && otherStats.getStamina() == getStamina()) {
                return true;
            }
        }
        return false;
    }
}
