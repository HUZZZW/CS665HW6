package edu.bu.met.cs665.YimingHu_HW1;
import java.util.Objects;

public class DrinkMachine {

    static Coffee CreateCoffe(String BN)
    {
        if(Objects.equals(BN, "Espresso"))
        {
            return new Espresso();
        }
        else if (Objects.equals(BN,"Americano"))
        {
            return new Americano();
        }
        else if (Objects.equals(BN,"Latte Macchiato"))
        {
            return new LatteMacchiato();
        }
    return null;
    }
    static Drink CreateTea(String BN)
    {

        if(Objects.equals(BN,"BlackTea"))
        {
            return new BlackTea();
        }
        else if(Objects.equals(BN,"GreenTea"))
        {
            return new GreenTea();
        }
        else if (Objects.equals(BN,"YellowTea"))
        {
            return new YellowTea();
        }
        return null;
    }




}
