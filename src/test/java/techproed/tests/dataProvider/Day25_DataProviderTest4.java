package techproed.tests.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_DataProviderTest4 {

    //musteriVerileri

    @Test (dataProvider = "musteriVerileri",dataProviderClass = DataProviderUtils.class)
        public void musteriVerileriTesti(String username, String password,String sube){
        System.out.println("username :"+ username + " password : "+password + " sube : " + sube);
    }

    //musteriHizmetleri

    @Test (dataProvider = "musteriHizmetleriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriHizmetleriVerileriTest(String username, String password){
        System.out.println("username :"+ username + " password : "+password);
    }

    //personelVerileri
    @Test (dataProvider = "personelVerileri",dataProviderClass = DataProviderUtils.class)
    public void personelVerileriTest(String username, String password){
        System.out.println("username :"+ username + " password : "+password);
    }
    //    customerData
    @Test(dataProvider = "customerData",dataProviderClass = DataProviderUtils.class)
    public void customerDataTest(String username,String password){
        System.out.println("EXCEL DATALARIM");
        System.out.println(username + " ||| "+password);
    }



}
