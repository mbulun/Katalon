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

WebUI.navigateToUrl('https://app.qa.oneteg.com/admin/')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Email_login-username'), 'bgovercin@cyangate.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Password_login-password'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Connectors'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Organization_el-button el-button--de_e5629d'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-select-spec'), 'ag')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_agilityConnector-v1.0'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-name'), 'Agility Connector-v1.0')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-description'), 'Agility Connector-v1.0')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-type'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_CORE'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-pricing-type'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_PAID'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Save'))

