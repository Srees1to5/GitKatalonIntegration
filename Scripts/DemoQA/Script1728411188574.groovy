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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sampleapp.tricentis.com/101/')

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Tricentis Vehicle Insurance/div_AutomobileTruckMotorcycleCamperRequest _a5db7c'))

WebUI.doubleClick(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/body_Vehicle Insurance ApplicationThis is a_dbb725'))

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_First Name_First Name'), 
    'sssssssssssssssssss')

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_Last Name_Last Name'), 
    'assssssssss')

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/button_Date of Birth_Open Date of Birth Calender'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/span_Female_ideal-radio'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/button_Date of Birth_Open Date of Birth Calender'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/a_Prev'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/a_11'))

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_Date of Birth_Date of Birth'), 
    '09/11/2020')

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/section_First Name                         _4f86d4'))

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_Street Address_Street Address'), 
    'ssssssssssssssssssssssdds')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/select_please select                       _d6c855'), 
    'Australia', true)

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_Zip Code_Zip Code'), 'aa')

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_City_City'), '')

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_City_City'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/div_Zip Code                               _ce522f'))

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_Zip Code_Zip Code'), '99999')

WebUI.setText(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/input_City_City'), 'assssssssssssss')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/select_please select                       _4c6253'), 
    'Public Official', true)

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/span_Speeding_ideal-check'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Insurant Data/button_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ACME demo app/Page_Enter Product Data/select_please select                       _5bfca6'), 
    'No Coverage', true)

