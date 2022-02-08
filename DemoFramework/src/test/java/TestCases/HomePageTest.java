package TestCases;

import Basepackage.BaseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{
//        HomePage oo;

        @Test(priority = 0)
        public void validateAdminModuletest()
        {
//                oo=new HomePage();
                obj.gethomepage().validateAdminModule();
        }
        @Test(priority = 1)
        public void validatePimtest(){obj.gethomepage().validatePim();}
        @Test(priority = 2)
        public void validateleavetest () {obj.gethomepage().validateleave();}
        @Test(priority = 3)
        public void validatetimetest (){obj.gethomepage().validatetime();}
        @Test(priority = 4)
        public void validaterecruitmenttest (){obj.gethomepage().validaterecruitment();}
        @Test(priority = 5)
        public void validatemyinfotest (){obj.gethomepage().validatemyinfo();}
        @Test(priority = 6)
        public void validateperformancetest (){obj.gethomepage().validateperformance();}
        @Test(priority = 7)
        public void validatedashboardtest (){obj.gethomepage().validatedashboard();}
        @Test(priority = 8)
        public void validatedirectory(){obj.gethomepage().validatedirectory();}
        @Test(priority = 9)
        public void validatemaintenance(){obj.gethomepage().validatemaintenance();}
        @Test(priority = 10)
        public void validatebuzz(){obj.gethomepage().validatebuzz();}
        @Test(priority = 11)
        public void validatelogout(){obj.gethomepage().logout();}

}
