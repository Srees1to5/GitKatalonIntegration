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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/women/tops-women.html')

WebUI.click(findTestObject('Object Repository/Page_Tops - Women/div_Material'))

WebUI.click(findTestObject('Object Repository/Page_Tops - Women/a_Lycra 6item'))

WebUI.rightClick(findTestObject('Object Repository/Page_Tops - Women/strong_Nora Practice Tank'))

WebUI.click(findTestObject('Object Repository/Page_Tops - Women/a_Nora Practice Tank'))

WebUI.click(findTestObject('Object Repository/Page_Nora Practice Tank/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Nora Practice Tank/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Nora Practice Tank/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Nora Practice Tank/span_Add to Wish List'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Login/div_You must login or register to add items_14b330'), 
    0)

