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

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Users'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Role_create-button'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__user-name'), 'Katalon Test Intern')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__user-lastname'), 'Baris')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__user-email'), 'baristestingkatalon@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Tenant Admin_el-checkbox__inner'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Organization_el-button el-button--de_e5629d'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Organization_user-organization'))

'ss'
WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_cyangateone'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Organization_user-role'))

'ss'
WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_ROLE_ADMIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_cyangateone_nav-link dropdown-toggle labe_63359a'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_LogOut'))

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AeDOFXhB_GCIVdS4Db8NH5aeIVJTsayAiDVurAmbJqquWxYs7YXT9lPSYx5JrzB77Y1EgqQMmBEH&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-636873424%3A1690806988179943')

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_concat(Gmail, , e devam et)_identifier'), 'baristestingkatalon@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Sonraki'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_ok fazla baarsz giriimde bulunuldu_Passwd'), 'R8t6bDwx6O+4iOE9ITweInLD3kbYLo6U')

WebUI.click(findTestObject('Page_Gmail/span_Sonraki_password'))

WebUI.click(findTestObject('Object Repository/Page_Inbox (1) - baristestingkatalongmail.c_8ce4f2/td_unread, admin, Verify your account, 335P_58d55a'))

'ss'
WebUI.click(findTestObject('Page_Verify your account - baristestingkatalongmail.com - Gmail/a_Verify Account'))

WebUI.switchToWindowTitle('OneTeg | Simplified Integration')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Back to Login_newPassword'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Valid Password_confirm_password'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Email_login-username'), 'baristestingkatalon@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Password_login-password'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Users'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/td_Katalon Test Intern'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_cyangateone_nav-link dropdown-toggle labe_63359a'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_LogOut'))

