package techproed.tests;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {
    @Test (groups = "regression-tests")
    public void softAssertionTest() {

        // 1. Soft Assertion objesi oluştur

        SoftAssert softAssert = new SoftAssert();
        System.out.println("satır 14");
        softAssert.assertEquals(2,5);  //FAIL
        System.out.println("satır 16");
        softAssert.assertTrue("java".contains("u"));  //FAIL
        System.out.println("satır 18");
        softAssert.assertTrue(true);  //PASS
        System.out.println("satır 20");
       // softAssert.assertAll();  //assertAll kullanmasaydık hepsi pass olacaktı
    }
}