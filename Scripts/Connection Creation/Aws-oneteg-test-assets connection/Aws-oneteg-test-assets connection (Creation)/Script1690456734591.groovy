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

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-name'), 'Aws-oneteg-test-assets connection Katalon Test')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-connector-select'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-connector-select'), 
    'aws')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_AWS S3 Connector -v1.0'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__propertiesbucketName-input'), 
    'oneteg-test-assets')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/select__propertiesregion-select'), 
    'eu-central-1', true)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-authentication-type'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_BASIC'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-basic-username'), 
    'AKIARN4FTBWOSHD575X2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-basic-password'), 
    'HyluvJJhYuZD8ushPrPe2WybuMrXEUP/9JP5u9155a1vTBonHFiUbZfv7wPxMGn+')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-basic-endpoint'), 
    'https://oneteg-test-assets.s3.eu-central-1.amazonaws.com/')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), 
    GlobalVariable.Aws_oeneteg_connection_name)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/strong_Aws-oneteg-test-assets connection_te_37e8d6'))

