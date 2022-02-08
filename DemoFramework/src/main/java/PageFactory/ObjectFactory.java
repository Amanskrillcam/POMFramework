package PageFactory;

import Pages.HomePage;
import Pages.LoginPage;

public class ObjectFactory {
    private LoginPage logobj;
    private HomePage homeobj;

    public LoginPage getlogin()
    {
        if (logobj == null)
        {
            logobj = new LoginPage();
        }
        return logobj;
    }
    public HomePage gethomepage()
    {
        if (homeobj == null)
        {
            homeobj = new HomePage();
        }
        return homeobj;
    }
}
