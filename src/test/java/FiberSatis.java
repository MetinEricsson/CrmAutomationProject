import BaseFiles.TestBase;
import Pages.MainPage;
import Pages.SalePage;
import org.testng.annotations.Test;

public class FiberSatis extends TestBase {


    @Test
    public void FiberSatis(){
        MainPage mainPage= new MainPage();
        SalePage salePage= new SalePage();
        int numberOfPacket=1;
        String identityNo="12332112345";

        mainPage.openMainPage()
                 .satisMenuSec();
        salePage.tcknGir(identityNo)
                .tcknAra()
                .sonrakiAdimButonTikla_MusteriSecimi()
                .fiberPaketSec(numberOfPacket)
                .sonrakiAdimButonTikla_UrunSecimi()
                .urunKontrol_GozdenGecir(numberOfPacket)
                .siparisiBaslatButonTikla()
                .siparisMesajKontrol();


    }


}
