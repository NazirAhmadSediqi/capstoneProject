package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	public void clickOnDesktoTab() {
		desktopsTab.click();
	}

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartHPOption;
	
	public void clickOnAddToCartHPOption() {
		addToCartHPOption.click();
	}

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityHP;
	
	public void selectQuantityHP() {
		quantityHP.clear();
		quantityHP.sendKeys("1");
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartHPButton;
	
	public void clickOnAddToCartHPButton() {
		addToCartHPButton.click();
	}

	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartCanonOption;
	
	public void clickOnAddToCartCanonOption() {
		addToCartCanonOption.click();
	}

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement selectRedFromDropDown;
	
	public void selectRedFromDropDown() {
		selectRedFromDropDown.click();
		WebDriverUtility.selectByVisibleText(selectRedFromDropDown, "Red");
	}

	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantityCanon;
	
	public void selectQuantityCanon() {
		quantityCanon.clear();
		quantityCanon.sendKeys("1");
	}

	@FindBy(css = "button#button-cart")
	private WebElement addToCartCanonButton;
	
	public void clickOnAddToCartCanonButton() {
		addToCartCanonButton.click();
	}

	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement clickOnCanonEOS5D;
	
	public void clickOnCanonEOS5D() {
		clickOnCanonEOS5D.click();
	}

	@FindBy(xpath = "//a[contains(text(), 'Write a review')]")
	private WebElement writeAReview;
	
	public void writeAReview() {
		writeAReview.click();
	}

	@FindBy(css = "input#input-name")
	private WebElement yourName;
	
	public void yourName(String yName) {
		WebDriverUtility.enterValue(yourName, yName);
	}

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourReview;
	
	public void yourReview(String yReview) {
		WebDriverUtility.enterValue(yourReview, yReview);
	}

	@FindBy(xpath = "//input[@value='5']")
	private WebElement rating;
	
	public void rating() {
		rating.click();
	}

	@FindBy(css = "button#button-review")
	private WebElement continueButton;
	
	public void ClickOnContinueButton() {
		continueButton.click();
	}
	
	

}
