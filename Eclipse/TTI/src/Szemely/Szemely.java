package Szemely;

public class Szemely {
    private String name;
    private int weight;
    private double height;
    public Szemely(String name, int weight, double height)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String inputName)
    {
        name = inputName;
    }

    public void setWeight(int inputWeight)
    {
        weight = inputWeight;
    }

    public void setHeight(double inputHeight)
    {
        height = inputHeight;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public double TTI()
    {
        return weight / (height * height);
    }

    public String ttiString()
    {
        if (TTI() < 18.5)
        {
            return "Sovany";
        } else if (TTI() > 25)
        {
            return "Kover";
        }
        return "Normalis";
    }

    @Override
    public String toString()
    {
        return "Nev: " + name + "\nSuly: " + weight + "\nMagassag: " + height + "\nTTI alak: " + ttiString();
    }
}
