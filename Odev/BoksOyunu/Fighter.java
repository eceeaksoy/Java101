package Odev.BoksOyunu;

public class Fighter {
    String name;
    int damage, health, weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if ((dodge >= 0) &&(dodge <= 100))
        {
            this.dodge = dodge;
        }
        else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe) {
        System.out.println("---------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " damaged");
        if (foe.isDodge())
        {
            System.out.println(foe.name + " blocked the incoming occupant.");
            return foe.health;
        }
        if (foe.health - this.damage < 0)
        {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
