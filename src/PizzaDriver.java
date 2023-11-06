
public class PizzaDriver {

    public static void main(String[] args) {

        Pizza pepper = new Pizza(Pizza.PIZZASIZES.MEDIUM);
        pepper.addTopping("Pepperoni");
        pepper.slice(8);
        pepper.setName("Pepperoni");
        System.out.printf("[*]A Medium \"%s\" pizza with %s as toppings will cost %.2f. Comes with %d slices\n", pepper.getName(), pepper.getToppings(),pepper.getPrice(), pepper.getSlices());


        Pizza huttin = new Pizza(Pizza.PIZZASIZES.HUT,12);
        huttin.addTopping("Pepperoni");
        huttin.addTopping("Green Pepper");
        huttin.addTopping("Mushroom");
        huttin.addTopping("Salami");
        huttin.setName("The Out Hutter");
        if(huttin.addTopping("Papa's Secret Sauce")) {
            System.out.println("[!]Uh oh papa added his secret sauce! (He shouldn't)");
        }

        if(huttin.slice(6)) {
            System.out.println("[!]Uh oh you can unslice a pizza!");
        }

        System.out.printf("[*]A Hut-sized \"%s\" pizza with %s as toppings will cost %.2f. Comes with %d slices\n", huttin.getName(), huttin.getToppings(), huttin.getPrice(), huttin.getSlices());

        Pizza Objectively_Bad = new Pizza(Pizza.PIZZASIZES.SMALL,24);
        Objectively_Bad.setName("Totally Real Pizza Ordered by Normal Humans");
        Objectively_Bad.addTopping("Black Olives");
        Objectively_Bad.addTopping("Pineapple");
        Objectively_Bad.addTopping("Anchovies");

        System.out.printf("[*]A Small-sized \"%s\" pizza with %s as toppings will cost %.2f. Comes with %d slices\n", Objectively_Bad.getName(), Objectively_Bad.getToppings(), Objectively_Bad.getPrice(), Objectively_Bad.getSlices());

        Pizza Bland = new Pizza(Pizza.PIZZASIZES.LARGE);
        Bland.setName("Who Needs a Raise?");
        System.out.printf("[*]A Large \"%s\" pizza with %s as toppings will cost %.2f. Comes with %d slices\n", Bland.getName(), Bland.getToppings(),Bland.getPrice(), Bland.getSlices());

    }

}
