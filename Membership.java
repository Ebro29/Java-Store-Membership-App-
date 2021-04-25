package Electronic_Store;

public class Membership {
    
    private String fName;       // First name
    private String mInitial;    // Middle initial
    private String lName;       // Last name
    private String email;       // Email
    private String password;    // Password
    private String ccInfo;      // Credit Card
    
    public Membership() // Default Constructor
    {
        fName = null;
        mInitial = null;
        lName = null;
        email = null;
        password = null;
        ccInfo = null;
    }
    
    public String getFName() // Used to display first name
    {
        return fName;
    }
    
    public void setFName(String first) // Sets first name
    {
        fName = first;
    }
    
    public String getMInitial() // Displays middle initial
    {
        return mInitial;
    }
    
    public void setMInitial(String mInit) // Sets middle initial
    {
        mInitial = mInit;
    }
    
    public String getLName() // Displays last name
    {
        return lName;
    }
    
    public void setLName(String last) // Sets last name
    {
        lName = last;
    }
    
    public String getEmail() // Displays email
    {
        return email;
    }
    
    public void setEmail(String em) // Sets email
    {
        email = em;
    }
    
    public String getPassword() // Displays password
    {
        return password;
    }
    
    public void setPassword(String pass) // Sets password
    {
        password = pass;
    }
    
    public String getCCInfo() // Displays Credit Card
    {
        return ccInfo;
    }
    
    public void setCCInfo(String cc) // Puts together CC
    {
        ccInfo = cc;
    }
}
