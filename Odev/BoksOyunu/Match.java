package Odev.BoksOyunu;

public class Match {
    Fighter f1, f2;
    int minWeight, maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this. minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (checkWeight())
        {
            while(this.f1.health > 0 && this.f2.health > 0)
            {
                System.out.println("=========NEW ROUND=========");
                int chance = (int)Math.round(Math.random());
                if (chance == 0)
                {
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " health: " + this.f1.health);
                    if (isWin())
                    {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " health: " + this.f2.health);
                    if (isWin())
                    {
                        break;
                    }
                }
                else if (chance == 1)
                {
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " health: " + this.f2.health);
                    if (isWin())
                    {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " health: " + this.f1.health);
                    if (isWin())
                    {
                        break;
                    }
                }
            }
        }
        else {
            System.out.println("Athletes' weights do not match!");
        }
    }

    boolean checkWeight(){
        return ((f1.weight <= this.maxWeight) && (f1.weight >= this.minWeight)) && ((f2.weight <= this.maxWeight) && (f2.weight >= this.minWeight));
    }

    boolean isWin(){
        if (this.f1.health == 0)
        {
            System.out.println("Winner is " + this.f2.name);
            return true;
        }
        else if (this.f2.health == 0)
        {
            System.out.println("Winner is " + this.f1.name);
        }
        return false;
    }

    void printScore(){
        System.out.println("---------------");
        System.out.println(this.f1.name + " health\t: " + this.f1.health);
        System.out.println(this.f2.name + " health\t: " + this.f2.health);
    }
}
