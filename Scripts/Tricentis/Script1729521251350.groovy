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

WebUI.navigateToUrl('https://sampleapp.tricentis.com/101/')

WebUI.click(findTestObject('Object Repository/Page_Tricentis Vehicle Insurance/a_Motorcycle'))

WebUI.click(findTestObject('Object Repository/Page_Enter Vehicle Data/a_Enter Insurant Data7'))

WebUI.setText(findTestObject('Object Repository/Page_Enter Insurant Data/input_First Name_First Name'), 'as')

WebUI.setText(findTestObject('Object Repository/Page_Enter Insurant Data/input_Last Name_Last Name'), 'as')

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/i_Date of Birth_fa fa-calendar-plus-o'))

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/span_October'))

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/span_Female_ideal-radio'))

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/i_Date of Birth_fa fa-calendar-plus-o'))

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/a_Prev'))

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/a_11'))

WebUI.setText(findTestObject('Object Repository/Page_Enter Insurant Data/input_Date of Birth_Date of Birth'), '09/11/2020')

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/section_First Name                         _4f86d4'))

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/section_First Name                         _4f86d4'))

WebUI.setText(findTestObject('Object Repository/Page_Enter Insurant Data/input_Street Address_Street Address'), 'sssssd')

WebUI.click(findTestObject('Object Repository/Page_Enter Insurant Data/button_Next'))

