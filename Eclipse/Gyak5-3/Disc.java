public class Disc {
    
    private String performer;
    private String title;
    private int length;

    public Disc (String performer, String title, int length)
    {
        this.performer = performer;
        this.title = title;
        this.length = length;
    }

    public String getPerformer()
    {
        return performer;
    }
    public String getTitle()
    {
        return title;
    }
    public int getLength()
    {
        return length;
    }

    public String toString()
    {
        return "Performer: " + performer + "\nTitle: " + title + "\nLength: " + length;
    }

    public int sameLengthThanParameter(Disc parameter)
    {
        if (getLength() > parameter.getLength())
        {
            return 1;
        } else if (parameter.getLength() > getLength())
        {
            return -1;
        } else 
        {
            return 0;
        }
    }

    public boolean isTheSamePerformer(String parameterPerformer)
    {
        if (parameterPerformer.equalsIgnoreCase(getPerformer()))
        {
            return true;
        } else
        {
            return false;
        }
    }
}