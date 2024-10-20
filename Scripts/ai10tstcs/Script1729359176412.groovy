import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ARpgrqcKnzqZtk5pIjpOXG7fp32Wd5xnAUSNzNZ0dkvjFwct7zVLfrlgoE8h5v44aSM0atZphTPe&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1409785973%3A1729359233004977&ddm=0')

WebUI.click(findTestObject('Object Repository/Page_Gmail/button_Forgot email'))

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_Enter your phone number or recovery e_b488e7'), 'test@test.com')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_Enter the name on your Google Account_585949'), 'tests')

WebUI.click(findTestObject('Object Repository/Page_Gmail/input_Enter the name on your Google Account_585949'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Gmail/input_Enter the name on your Google Account_585949'))

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_Enter the name on your Google Account_a2d055'), 's')


/*
 * close browser
 */
// Close the current browser
WebUI.closeBrowser()