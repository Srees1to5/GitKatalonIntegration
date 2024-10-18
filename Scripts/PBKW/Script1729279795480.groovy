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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm;jsessionid=433A0C0C0BB91807C12AA4A71899882A')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/a_Locations'))

CustomKeywords.'com.test.pack1.customfunction8.printName'('sreeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee')

WebUI.click(findTestObject('Object Repository/Page_Automated Software Testing Solutions F_4f6c59/span_Products'))

WebUI.click(findTestObject('Object Repository/Page_Automated Software Testing Solutions F_4f6c59/span_CCtest'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CCtest Check C and C Code Quality Tool_a48130/a_Try Parasoft'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_CCtest Check C and C Code Quality Tool_a48130/span_Solutions'))

WebUI.click(findTestObject('Object Repository/Page_CCtest Check C and C Code Quality Tool_a48130/a_AUTOSAR C14'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AUTOSAR C Rules and Coding Standards C_501c1a/a_Contact Us'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_AUTOSAR C Rules and Coding Standards C_501c1a/span_Industries'))

WebUI.click(findTestObject('Object Repository/Page_AUTOSAR C Rules and Coding Standards C_501c1a/a_Automotive'))

WebUI.click(findTestObject('Object Repository/Page_Automotive Embedded Software Testing S_981503/span_Customer Success'))

WebUI.click(findTestObject('Object Repository/Page_Automotive Embedded Software Testing S_981503/a_Customer Portal'))

WebUI.switchToWindowTitle('Customer Portal Home')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Portal Home/a_Announcements'), 0)

