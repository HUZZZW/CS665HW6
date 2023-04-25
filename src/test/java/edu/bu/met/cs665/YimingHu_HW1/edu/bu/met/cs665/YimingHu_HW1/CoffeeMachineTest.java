package edu.bu.met.cs665.YimingHu_HW1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeMachineTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void CreateDrink(){
        Drink myDrink = new DrinkMachine().CreateCoffe("Americano");
        Assert.assertNotNull(myDrink);
        //Assert.assertFalse(myDrink.CreateDrink("Americano"),true);
    }
    @Test
    public void CreateDrink1(){
        Drink myDrink = new DrinkMachine().CreateTea("BlackTea");

        //Assert.assertNotNull(myDrink);
        Assert.assertEquals(myDrink.BeverageName,"Black Tea");
    }
    @Test
    public void addSupgerTest(){
        Coffee myDrink = DrinkMachine.CreateCoffe("Espresso");
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        //Here we add 4 times sugar, the answer will always be 3.
        Assert.assertEquals(myDrink.getSugar(),3);
    }

    @Test
    public void addMilkTest(){
        Coffee myDrink = DrinkMachine.CreateCoffe("Espresso");
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        //Here we add 4 times milk, the answer will always be 3.
        Assert.assertEquals(myDrink.getMilk(),3);
    }
    @Test
    public void addCondiment(){
        Coffee myDrink = DrinkMachine.CreateCoffe("Espresso");
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        //Here we add 4 times milk and 4 times sugar, the answer will always be 6.
        Assert.assertEquals((myDrink.getMilk()+ myDrink.getMilk()),6);
    }
}