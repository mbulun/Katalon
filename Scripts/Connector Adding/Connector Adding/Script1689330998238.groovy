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

WebUI.navigateToUrl('https://app.stg.oneteg.com/admin/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Email_login-username'), 'zcakar@cyangate.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Password_login-password'), 
    '27bl8L23rM67bb93yMOd+A==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Connectors'))

WebUI.click(findTestObject('Page_OneTeg  Simplified Integration/button_Organization_el-button el-button--de_e5629d'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-select-spec'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_4allportalConnector-v1.0'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-name'), '4allportal Connector -v1.0')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-name'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-description'), '4allportal Connector -v1.0')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-type'), '')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-type'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_CORE'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__connector-pricing-type'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_PAID'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Tenants'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/strong_app'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Connectors_transfer-check-left-0'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Clear_transfer-add-left-button'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/strong_app'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_cyangateone_nav-link dropdown-toggle labe_63359a'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_LogOut'))

WebUI.navigateToUrl('https://app.stg.oneteg.com/en/login')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Email_login-username'), 'zcakar@cyangate.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Password_login-password'), 
    '27bl8L23rM67bb93yMOd+A==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Organizations'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/strong_CYANGATE'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Connectors_transfer-check-left-0'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/svg_Search Files On Dropbox_svg-inline--fa _62ed91'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/strong_CYANGATE'))

WebUI.rightClick(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/label_4allportal Connector -v1.0'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/label_4allportal Connector -v1.0'), 
    '4allportal Connector -v1.0')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/svg_CYANGATE_svg-inline--fa fa-user fa-w-14'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_LogOut'))

