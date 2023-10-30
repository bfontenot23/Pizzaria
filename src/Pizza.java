import java.util.ArrayList;

public class Pizza {
    enum PIZZASIZES
    {
        SMALL,
        MEDIUM,
        LARGE,
        HUT
    }
    private PIZZASIZES size;
    private int numSlices;
    private ArrayList<String> toppings;
    private String name;

    public Pizza(PIZZASIZES size)
    {
        this.size = size;
        this.numSlices = 0;
        this.toppings = new ArrayList<>();
        this.name = "";
    }

    public Pizza(PIZZASIZES size, int numSlices)
    {
        this.size = size;
        this.numSlices = numSlices;
        this.toppings = new ArrayList<>();
        this.name = "";
    }

    public boolean slice(int num_Slices)
    {
        if(this.numSlices >=num_Slices)
        {
            return false;
        }
        else
        {
            this.numSlices = num_Slices;
            return true;
        }
    }

    public boolean addTopping(String topping)
    {
        if(toppings.size()<4)
        {
            toppings.add(topping);
            return true;
        }
        else
        {
            return false;
        }
    }

    public PIZZASIZES getSize()
    {
        return size;
    }

    public int getSlices() {
        return numSlices;
    }

    public ArrayList<String> getToppings()
    {
        return toppings;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        double price = 0.0;
        switch(size)
        {
            case SMALL -> {
                price+=8.50;
            }
            case MEDIUM -> {
                price+=10.25;
            }
            case LARGE -> {
                price+=12.75;
            }
            case HUT -> {
                price+=21.75;
            }
        }
        price+= 1.25*toppings.size();

        return price;
    }
}
