package TestCases;

import Basepackage.BaseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{
        HomePage oo;

        @Test(priority = 0)
        public void validateAdminModuletest()
        {
                oo=new HomePage();
                oo.validateAdminModule();
        }
        @Test(priority = 1)
        public void validatePimtest(){oo.validatePim();}
        @Test(priority = 2)
        public void validateleavetest () {oo.validateleave();}
        @Test(priority = 3)
        public void validatetimetest (){oo.validatetime();}
        @Test(priority = 4)
        public void validaterecruitmenttest (){oo.validaterecruitment();}
        @Test(priority = 5)
        public void validatemyinfotest (){oo.validatemyinfo();}
        @Test(priority = 6)
        public void validateperformancetest (){oo.validateperformance();}
        @Test(priority = 7)
        public void validatedashboardtest (){oo.validatedashboard();}
        @Test(priority = 8)
        public void validatedirectorytest (){oo.validatedirectory();}
        @Test(priority = 9)
        public void validatemaintenancetest (){oo.validatemaintenance();}
        @Test(priority = 10)
        public void validatebuzztest (){oo.validatebuzz();}

}
