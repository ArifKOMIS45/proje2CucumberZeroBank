package StepDefinitions;


import Pages.ZeroBankElements;
import Utilities.BaseDriver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;

public class PayBillSteps {


    ZeroBankElements zb = new ZeroBankElements();


    @Given("navigate to Pay Bills")
    public void navigateToPayBills() {
        zb.findAndClick(ZeroBankElements.PageElements.PAYBILLSTAB);
    }


    @Then("Pay succesfully")
    public void paySuccesfully() {
        zb.findAndClick(ZeroBankElements.PageElements.SUBMIT2);
        zb.verifyContainsText(zb.alert, "successfully");
    }


    @And("Click required boxes")
    public void clickRequiredBoxes(DataTable elemenets) {
        List<ZeroBankElements.PageElements> listElements = elemenets.asList(ZeroBankElements.PageElements.class);
        for (int i = 0; i < listElements.size(); i++) {
            zb.findAndClick(listElements.get(i));
        }

    }




    @And("^Fill  all needed Boxes with suitable infos$")
    public void fillAllNeededBoxesWithSuitableInfos(DataTable elemenets) {

        List<List<String>> listElements=elemenets.asLists(String.class);
        for (int i = 0; i <listElements.size() ; i++) {
            zb.findAndSend(ZeroBankElements.PageElements.values(listElements.get(i).get(0)), listElements.get(i).get(1));
        }
    }


    @Then("^Calculate succesfully$")
    public void calculateSuccesfully() {
        zb.verifyContainsText(zb.conversionAmount, "=");
    }

    @Given("^Navigate to Purchase Foreign CUrrency$")
    public void navigateToPurchaseForeignCUrrency() {
        zb.findAndClick(ZeroBankElements.PageElements.PAYBILLSTAB);
        zb.findAndClick(ZeroBankElements.PageElements.FOREIGNCURRENCYTAB);
    }
}

