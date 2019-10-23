public class Num
{//represents a single integer as an object
    private int value;

    public Num (int update)
    {
        value = update; //sets up new num object and stores initial value
    }

    public int getValue()
    {
        return value; //returns stored integer
    }

    public void setValue(int update)
    {
        value = update;//sets stored value to new specified value
    }

    public String toString()
    {
        return value + ""; //return stored integer
    }
}//noah triche per 5
