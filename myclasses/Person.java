public class Person
{
    private String firstname;
    private String lastname;
    private int theage;
    private int ssid;

    //Accessors
    public String getFirstName()
    {
        return firstname;
    }
    public String getLastName()
    {
        return lastname;
    }
    public int getAge()
    {
        return theage;
    }
    public int getSSID()
    {
        return ssid;
    }

    //Mutators
    public void setFName (String FName)
    {
        firstname = FName;
    }
    public void setLName (String LName)
    {
        lastname = LName;
    }
    public void setAge (int yourAge)
    {
        theage = yourAge;
    }
    public void setSSID (int yourSSID)
    {
        ssid = yourSSID;
    }

    //To String and Equals To
    public boolean equals (Person other)
    {
        return (ssid == other.ssid) && (ssid == other.ssid);
    }
    public String toString ()
    {
        return (firstname + ", " + lastname);
    }
}
