package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement registerForAffiliateAccount;

	public void registerForAffiliateAccount() {
		registerForAffiliateAccount.click();
	}

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;

	public void company(String companyi) {
		WebDriverUtility.enterValue(company, companyi);
	}

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;

	public void website(String websitee) {
		WebDriverUtility.enterValue(website, websitee);
	}

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;

	public void taxID(String taxid) {
		WebDriverUtility.enterValue(taxID, taxid);
	}

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[1]/label[1]/input[1]")
	private WebElement chequeBTN;

	public void chequeBTn(String cheque) {
		WebDriverUtility.enterValue(chequeBTN, cheque);
	}

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;

	public void chequePayeeName(String cheque) {
		WebDriverUtility.enterValue(chequePayeeName, cheque);
	}

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement aboutUSBtn;

	public void aboutUSbtn() {
		aboutUSBtn.click();
	}

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continueBTNAffiliate;

	public void continuebtnAffiliate1() {
		continueBTNAffiliate.click();
	}

	// ============================

	@FindBy(xpath = "//a[text()= 'Edit your affiliate information']")
	private WebElement editAffiliateInformation;

	public void editAffiliateInformation() {
		editAffiliateInformation.click();
	}

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfareRadioButton;

	public void banktranfareRadioButton() {
		bankTransfareRadioButton.click();
	}

	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement bankName;

	public void bankName(String bName) {
		WebDriverUtility.enterValue(bankName, bName);
	}

	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement abaNumber;

	public void abaNumber(String aNumber) {
		WebDriverUtility.enterValue(abaNumber, aNumber);
	}

	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement swiftCode;

	public void swiftCode(String sCode) {
		WebDriverUtility.enterValue(swiftCode, sCode);
	}

	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement accountName;

	public void accountName(String acctName) {
		WebDriverUtility.enterValue(accountName, acctName);
	}

	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement accountNumber;

	public void bankAccountNumberAffiliate(String acctNumber) {
		WebDriverUtility.enterValue(accountNumber, acctNumber);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonAffiliate;

	public void continueButtonAffiliate() {
		continueButtonAffiliate.click();
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;

	public void editYourAccountInformation() {
		editYourAccountInformation.click();
	}

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	public void firstName(String ffName) {
		firstName.clear();
		WebDriverUtility.enterValue(firstName, ffName);
	}

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	public void lastName(String lName) {
		lastName.clear();
		WebDriverUtility.enterValue(lastName, lName);
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	public void email(String aemail) {
		email.clear();
		WebDriverUtility.enterValue(email, aemail);
	}

	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement telephone;

	public void telephone(String ttelephone) {
		telephone.clear();
		WebDriverUtility.enterValue(telephone, ttelephone);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonEditAccount;

	public void continueButtonEditAccount() {
		continueButtonEditAccount.click();
	}

}
