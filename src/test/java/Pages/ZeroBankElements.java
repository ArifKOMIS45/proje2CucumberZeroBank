package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ZeroBankElements extends Parent {

    @FindBy(xpath = "//h2[.='Cash Accounts']")
    public WebElement cashAccounts;

    @FindBy(id = "alert_content")
    public WebElement alert;

    @FindBy(id = "np_new_payee_address")
    public WebElement adressPayee;

    @FindBy(id = "np_new_payee_account")
    public WebElement accountName;

    @FindBy(id = "np_new_payee_details")
    public WebElement accountDetails;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement foreignCurrencyTab;

    @FindBy(css = "select[id='pc_currency']>option")
    public List<WebElement> allCurrencies;
    @FindBy(id = "pc_conversion_amount")
    public WebElement conversionAmount;
    WebElement myElement;
    @FindBy(id = "user_login")
    private WebElement userLogin;
    @FindBy(id = "user_password")
    private WebElement userpassword;
    @FindBy(name = "submit")
    private WebElement submit;
    @FindBy(id = "add_new_payee")
    private WebElement submit2;
    @FindBy(id = "details-button")
    private WebElement security1;
    @FindBy(id = "proceed-link")
    private WebElement security2;
    @FindBy(css = "li[id='pay_bills_tab']>a")
    private WebElement payBillsTab;
    @FindBy(xpath = "//a[.='Add New Payee']")
    private WebElement payeeNew;
    @FindBy(id = "np_new_payee_name")
    private WebElement payeeName;
    @FindBy(id = "pc_inDollars_true")
    private WebElement radioButtonUSD;
    @FindBy(id = "pc_inDollars_false")
    private WebElement radioButtonUSD2;
    @FindBy(id = "pc_calculate_costs")
    private WebElement calculate;
    @FindBy(id = "pc_amount")
    private WebElement amount;


    public ZeroBankElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    public void findAndSend(PageElements pageElements, String value) {
        switch (pageElements) {
            case USERLOGIN:
                myElement = userLogin;
                break;
            case USERPASSWORD:
                myElement = userpassword;
                break;
            case PAYEENAME:
                myElement = payeeName;
                break;

            case ADRESSPAYEE:
                myElement = adressPayee;
                break;
            case ACCOUNTNAME:
                myElement = accountName;
                break;
            case ACCOUNTDETAILS:
                myElement = accountDetails;
                break;
            case AMOUNT:
                myElement = amount;
                break;


        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(PageElements pageElements) {
        switch (pageElements) {
            case SUBMIT:
                myElement = submit;
                break;
            case SUBMIT2:
                myElement = submit2;
                break;
            case SECURITY1:
                myElement = security1;
                break;
            case SECURITY2:
                myElement = security2;
                break;

            case PAYBILLSTAB:
                myElement = payBillsTab;
                break;
            case PAYEE:
                myElement = payeeNew;
                break;
            case FOREIGNCURRENCYTAB:
                myElement = foreignCurrencyTab;
                break;
            case CURRENCY:
                myElement = allCurrencies.get((int) (Math.random() * 15) + 1);
                break;
            case RADIOBUTTONUSD:
                myElement = radioButtonUSD;
                break;
            case RADIOBUTTONUSD2:
                myElement = radioButtonUSD2;
                break;
            case CALCULATE:
                myElement = calculate;
                break;
        }
        clickFunction(myElement);
    }


    public enum PageElements {
        USERLOGIN, USERPASSWORD, SUBMIT, SUBMIT2, SECURITY1, SECURITY2,
        PAYBILLSTAB, PAYEE, PAYEENAME, ADRESSPAYEE, ACCOUNTNAME,
        ACCOUNTDETAILS, FOREIGNCURRENCYTAB, CURRENCY, RADIOBUTTONUSD,
        RADIOBUTTONUSD2, CALCULATE, AMOUNT;


        public static PageElements values(String s) {
            ZeroBankElements.PageElements element = null;

            element = PageElements.valueOf(s);
            return element;
        }
    }

}
