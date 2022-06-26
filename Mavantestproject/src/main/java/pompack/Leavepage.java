package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leavepage {
	@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	private WebElement Leave;
	
	@FindBy(xpath="//a[@ id='menu_leave_applyLeave']")
	private WebElement Apply;
	
	@FindBy(xpath="//a[@ id='menu_leave_viewMyLeaveList']")
	private WebElement MyLeave;
	
	@FindBy(xpath="//a[@ id='menu_leave_Entitlements']")
	private WebElement Entitlements;
	
	@FindBy(xpath="//a[@ id='menu_leave_Reports']")
	private WebElement Reports;
	
	@FindBy(xpath="//a[@ id='menu_leave_Configure']")
	private WebElement Configure;
	
    @FindBy(xpath="//a[@ id='menu_leave_viewLeaveList']")
    private WebElement LeaveList;
    
    @FindBy(xpath="//a[@ id='menu_leave_assignLeave']")
    private WebElement AssignLeave;
    
    WebDriver driver;
    WebDriverWait wait;
    
    public Leavepage(WebDriver driver12) {
    	PageFactory.initElements(driver12, this);
    	this.driver =driver12;
    }
    public void clickonleave() {
    
    	Leave.click();
    }
    public void clickApply() {
    	Apply.click();
    }
    public void clickonMyLeave() {
    	MyLeave.click();
    }
    public void clickonEntitlements() {
    	Entitlements.click();
    }
    public void clickonReports() {
    	Reports.click();
    }
    public void clickonConfigure() {
    	Configure.click();
    }
    public void clickonLeaveList() {
    	LeaveList.click();
    }
    public void clickonAssignLeave() {
    	AssignLeave.click();
    }
}
