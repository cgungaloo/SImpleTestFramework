package config;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetConfig {
    private static String configFilePath = "src/test/java/config/config.json";
    public static HashMap<String,String> configItems;

    public static void GetConfig(){
        getConfigItems();
    }

    private static void getConfigItems(){
        configItems = new HashMap<String,String>();
        try{
            FileReader configReader = new FileReader(configFilePath);
            BufferedReader bufferedReader = new BufferedReader(configReader);
            StringBuilder jsonStringBuilder = new StringBuilder();
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                jsonStringBuilder.append(line);
            }
            String jsonString = jsonStringBuilder.toString();
            JSONObject configJSONReader = new JSONObject(jsonString.trim());
            Iterator<String> keys = configJSONReader.keys();

            while(keys.hasNext()){
                String key = (String)keys.next();
                configItems.put(key, (String) configJSONReader.get(key));
            }
        }catch (FileNotFoundException fn){
            fn.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
