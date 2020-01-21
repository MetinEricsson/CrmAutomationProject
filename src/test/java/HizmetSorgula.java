import BaseFiles.TestBase;
import Pages.MainPage;
import Pages.SalePage;
import Pages.ServiceQueryPage;
import org.testng.annotations.Test;

public class HizmetSorgula extends TestBase {


    @Test
    public void HizmetSorgula(){
        MainPage mainPage= new MainPage();
        ServiceQueryPage serviceQueryPage= new ServiceQueryPage();
       String identityNo="12332112345";

        mainPage.openMainPage()
                .hizmetSorgulamaMenuSec();
        serviceQueryPage.tcknGir(identityNo)
                .tcknAra()
                .urunKontrol();
    }
}
