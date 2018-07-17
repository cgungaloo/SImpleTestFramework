package steps;
import config.GetConfig;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.SetProperty;
import java.lang.management.ManagementFactory;

import java.net.MalformedURLException;
import java.util.HashMap;

public class hooks {
//    @Before
//    public void BeforeScenario(Scenario scenario) throws MalformedURLException {
//
//        long threadId = Thread.currentThread().getId();
//        String processName = ManagementFactory.getRuntimeMXBean().getName();
//        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
//
//        GetConfig.GetConfig();
//        SetProperty.setBrowserProperty();
//
//        System.out.println("Running Scenario : "+ scenario.getName() + " on " + GetConfig.configItems.get("browser"));
//    }
//
//    @After
//    public void AfterScenario() {
//        SetProperty.driver.quit();
//    }
}
