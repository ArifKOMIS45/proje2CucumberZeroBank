package StepDefinitions;

import Utilities.BaseDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before//her seneyodan once calisir
public void before(){}

    @After//her seneyodan sonra calisir
    public void after(){
       BaseDriver.DriverQuit();
            }
}
