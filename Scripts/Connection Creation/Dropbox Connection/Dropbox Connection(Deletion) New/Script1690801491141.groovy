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

WebUI.navigateToUrl('https://outlook.office365.com/mail/inbox/id/AAQkADliMDcyZDkzLTQxNTMtNGRhMy1hMDM5LTg3OWJkNTgzZDIwMQAQAGuor+16HklKr+bXrbIkozI%3D')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Connections'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), 
    'Dropbox Connection Katalon Test')

WebUI.verifyElementPresent(findTestObject('Page_OneTeg  Simplified Integration/td_Dropbox Connection Katalon Test'), 0)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Dropbox Connection Katalon Test_cog-_5dcd2f'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Delete'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_OK'))

WebUI.verifyElementPresent(findTestObject('Page_OneTeg  Simplified Integration/span_No Data'), 0)

