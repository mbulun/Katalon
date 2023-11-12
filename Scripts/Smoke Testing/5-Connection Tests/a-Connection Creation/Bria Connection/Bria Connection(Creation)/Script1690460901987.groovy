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

WebUI.callTestCase(findTestCase('Connection Creation/1Connection addition (open until connection page)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Role_create-button'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-name'), GlobalVariable.Bria_Connection_Name)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-connector-select'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-connector-select'), 
    'bria')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Bria Connector -v1.0'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__propertieshostName-input'), 'https://engine.prod.bria-api.com/v1')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/Bria Authentication Element Name'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Apikey'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/i_Oauth_el-select__caret el-input__icon el-_068b2b'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__propertieskey-input'), 
    'gi3Phjxm3TQLLkB7H+GGQtQb4WRo2HlkJkQdNsTjexsS1UOvMgSvPg==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), GlobalVariable.Bria_Connection_Name)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/strong_Bria Connection_test_intern'), 
    0)

