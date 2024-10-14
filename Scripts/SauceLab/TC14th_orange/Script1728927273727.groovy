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



WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/img_Elements_banner-image'))

WebUI.switchToWindowTitle('Tools QA - Selenium Training')

WebUI.click(findTestObject('Object Repository/Page_Tools QA - Selenium Training/a_Go To Registration'))

WebUI.setText(findTestObject('Object Repository/Page_Tools QA - Selenium Training/textarea_City(required)_message'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tools QA - Selenium Training/select_Please select a CountryAfghanistanAl_1a5016'), 
    '177', true)

WebUI.setText(findTestObject('Object Repository/Page_Tools QA - Selenium Training/input_Country (required)_city'), 'jnnbjhbhb')

WebUI.setText(findTestObject('Object Repository/Page_Tools QA - Selenium Training/input_YourMessage (required)_code'), 'sx03')

WebUI.setText(findTestObject('Object Repository/Page_Tools QA - Selenium Training/input_Paid Training_firstName'), 'tester')

WebUI.setText(findTestObject('Object Repository/Page_Tools QA - Selenium Training/input_First Name (required)_lastName'), 
    's')

WebUI.setText(findTestObject('Object Repository/Page_Tools QA - Selenium Training/input_Email(required)_mobile'), '987878778')

WebUI.setText(findTestObject('Object Repository/Page_Tools QA - Selenium Training/input_Last Name_email'), 'dxvc@nhbnm.vb')

WebUI.click(findTestObject('Object Repository/Page_Tools QA - Selenium Training/button_Send'))

