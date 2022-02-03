package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestng
{
    @Test
    @Parameters({"username","password"})
    public void Login(String uname,String pass)
    {
        System.out.println(uname);
        System.out.println(pass);

    }

}
