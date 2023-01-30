package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_DependsOnMethods {
    @Test
    public void homeTest(){
        System.out.println("home test");
        Assert.assertTrue(false);  //FALSE
    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest(){
        System.out.println("search test");
    }
    @Test (dependsOnMethods = "homeTest")
    public void paymentTest(){
        System.out.println("payment test");
    }
    /*
TestNG de tum  @Test metotlar bitbirlerinden bagimsiz olarak calisirlat
Eger methodlari bagimli hale getirmek istersem, dependsOnMethods parametresi kullanilir
Burdaki ornekde, searchTest methodu homeTest methoduna bagimlidir
searchTest den once homeTest calisir
Eger homeTest basarili ise searchTest calisir.
Eget homeTest basarisiz ise, searchTest IGNORE edilir
 */





















}
