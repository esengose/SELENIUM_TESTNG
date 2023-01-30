package techproed.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //This class reads the configuration.properties file
    //Create Properties instance
    private static Properties properties;         //Bu sınıftan gelen herşey Javadan gelir
    static {   //static block
        //path of the configuration file           çalıştırmak istediğim dosyanın pathi
        String path="configuration.properties";
        try {
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();         //properties objesini instanties ediyoruz
            properties.load(fileInputStream);     //conf. properties dosyasındaki dataları yükler
            //close the file
            fileInputStream.close();            //file input stream kapatır
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method will get the key from properties file,   (hep key veririz, value burdan talep ederiz)
    //And return the value as String
    //We create this method to read the file

    //    ConfigReader.getProperty("browser"); -> chrome
//    ConfigReader.getProperty("amazon_url"); -> https://www.amazon.com
//    ConfigReader.getProperty("username"); -> ali
   public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
}
