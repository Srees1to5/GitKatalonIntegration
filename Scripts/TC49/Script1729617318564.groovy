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

WebUI.navigateToUrl('https://webdriveruniversity.com/index.html')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/a_API Testing in detail using Postman - Tes_e954f1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_API Testing in detail using Postman - _9221e6/h1_API Testing in detail using Postman - Te_3ef861'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_API Testing in detail using Postman - _9221e6/a_Postman'))

WebUI.rightClick(findTestObject('Object Repository/Page_Just a moment/h1_www.udemy.com'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Just a moment/h1_www.udemy.com_1'), 0)
