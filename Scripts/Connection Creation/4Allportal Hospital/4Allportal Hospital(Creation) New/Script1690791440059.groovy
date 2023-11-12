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

WebUI.navigateToUrl('https://app.qa.oneteg.com/en/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Email_login-username'), 'bgovercin@cyangate.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Password_login-password'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Connections'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Role_create-button'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-name'), '4Allportal Hospital Katalon Test')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connection-name'))

WebUI.click(findTestObject('Page_OneTeg  Simplified Integration/input__connection-connector-select'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_4AllPortal Connector -v1.0'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__propertieshostName-input'), 'http://dev11centos.cyangate.com:8019/api')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__authentication-list'))

'ss'
WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Bearer'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/i_Oauth_el-select__caret el-input__icon el-_068b2b'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__propertiestoken-input'), 
    'xsUaIg63593YyHSg2xc9ZVoirg1lxcE3IAz2JgjzoW93vd5NJUIyFg==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_OneTeg  Simplified Integration/div_4Allportal Hospital Katalon Test'), 0)

