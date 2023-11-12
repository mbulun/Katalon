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

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-name'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-name'), GlobalVariable.FourAllportal_Hospital_Connection_Name)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-connector-select'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_4AllPortal Connector -v1.0'))

WebUI.setText(findTestObject('Page_OneTeg  Simplified Integration/input__propertieshostName-input'), 'http://dev11centos.cyangate.com:8019/api')

'this should be ss'
WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Action Settings_el-select__input is-small'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Bearer'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/i_Oauth_el-select__caret el-input__icon el-_068b2b'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__propertiestoken-input'), 
    'xsUaIg63593YyHSg2xc9ZVoirg1lxcE3IAz2JgjzoW93vd5NJUIyFg==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), GlobalVariable.FourAllportal_Hospital_Connection_Name)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/strong_4Allportal Hospital_test_intern'), 
    '4Allportal Hospital_test_intern')

