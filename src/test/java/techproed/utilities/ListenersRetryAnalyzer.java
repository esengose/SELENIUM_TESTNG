package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersRetryAnalyzer implements IAnnotationTransformer {

    //    Bu sinifin amaci, TUM FAILE TEST CASELERI BIR KEZ DAHA AUTOMATIK OLARAK XML FILE ILE RUN ETMEK
    //    Bu sınıf ListenersRetry sınıfını xml de kullanabilmek için oluşturuldu.

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

        annotation.setRetryAnalyzer(ListenersRetry.class); //Bu sinif ListenersRetry util classina baglidir
    }
}
