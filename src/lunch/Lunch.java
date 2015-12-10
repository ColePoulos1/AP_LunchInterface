/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lunch;

/**
 *
 * @author jeffreyyee
 */
public class Lunch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sandwich cheeseBurger = new Sandwich("Cheeseburger",2.75);
        Sandwich clubSandwich = new Sandwich("Club Sandwich",2.75);
        
        Salad spinach = new Salad("Spinach Salad",1.25);
        Salad coleslaw = new Salad("Coleslaw",1.25);
        
        Drink orange = new Drink("Orange Soda",1.25);
        Drink cappuccino = new Drink("Cappuccino",3.50);
        
        
        Trio trio = new Trio(clubSandwich,spinach,cappuccino);
        System.out.println("trio name = " + trio.getName() + " price = " + trio.getPrice());
    }
}
//add Trio class

class Sandwich implements MenuItem
{
    private String name;
    private double price;
    Sandwich(String _name,double _price)
    {
        name = _name;
        price = _price;
    }
    public String getName()
    {
        return(name);
    }
    public double getPrice()
    {
        return(price);
    }
}

class Salad implements MenuItem
{
    private String name;
    private double price;
    Salad(String _name,double _price)
    {
        name = _name;
        price = _price;
    }
    public String getName()
    {
        return(name);
    }
    public double getPrice()
    {
        return(price);
    }
}

class Drink implements MenuItem
{
    private String name;
    private double price;
    Drink(String _name,double _price)
    {
        name = _name;
        price = _price;
    }
    public String getName()
    {
        return(name);
    }
    public double getPrice()
    {
        return(price);
    }
}
class Trio implements MenuItem
{
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    Trio(Sandwich _san, Salad _sal, Drink _dri)
    {
        sandwich = _san;
        salad = _sal;
        drink = _dri;
    }
    public String getName()
    {
        return(sandwich.getName() + "/" + salad.getName() + "/" + drink.getName());
    }
    public double getPrice()
    {
        if(sandwich.getPrice()<salad.getPrice()&&sandwich.getPrice()<drink.getPrice())
             return (salad.getPrice()+drink.getPrice());
        else if(salad.getPrice()<sandwich.getPrice()&&salad.getPrice()<drink.getPrice())
             return (sandwich.getPrice()+drink.getPrice());
        else
             return (salad.getPrice()+sandwich.getPrice());
    }
}
interface MenuItem
{
    String getName();
    double getPrice();
}
