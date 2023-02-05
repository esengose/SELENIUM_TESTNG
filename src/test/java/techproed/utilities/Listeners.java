package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {


    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart- Tüm testlerden önce bir kere çağrılır: "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish-Tum testlerden sonra tek bir kere cagrilir : "+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("onTestStart- Her bir @Test ten önce bir kez çalışır : " +result.getName());
    }

    @Override
    public void onTestSuccess (ITestResult result){
        System.out.println("onTestSuccess- Sadece pass olan testlerden sonra tek bir kez çağrılır : "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("onTestFailure-Sadece fail olan testlerden sonra tek bir kez çağrılır" + result.getName());
        try {
            ReusableMethods.getScreenshot("Test-Case-FAIL-" + result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("onTestSkipped-Sadece skip edilen testlerden sonra tek bir kez cagrilir : " + result.getName());
    }
}
