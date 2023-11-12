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

WebUI.callTestCase(findTestCase('4-User Creation/User creation gmail'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.live.com/ppsecure/secure.srf?cobrandid=90015&id=292841&contextid=E57483C30F39536E&opid=197A5E84B644D38B&uaid=af2ef0982d184b8a823cc860bf690449&ru=https://outlook.live.com/owa/%3fRpsCsrfState%3dcfb851bc-d7c3-8be4-4e90-990477e51407')

WebUI.setText(findTestObject('Object Repository/Page_Microsoft hesabnzda oturum an/input_Oturum a_loginfmt'), 'baristestingkatalon@outlook.com')

WebUI.click(findTestObject('Object Repository/Page_Microsoft hesabnzda oturum an/input_Bir tane olutur_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Microsoft hesabnzda oturum an/input_Parola girin_passwd'), 
    'R8t6bDwx6O+Vvds3OSoX9g==')

WebUI.click(findTestObject('Object Repository/Page_Microsoft hesabnzda oturum an/input_Bir tane olutur_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Posta - baris govercin - Outlook/span_Use this link to verify your account. _d4e68e'))

WebUI.click(findTestObject('Object Repository/Page_Posta - baris govercin - Outlook/a_Verify Account'))

WebUI.switchToWindowTitle('OneTeg | Simplified Integration')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_Password Matched_el-form-item is-succes_998e0e'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Back to Login_newPassword'), 
    ',.Aslan,.123')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Valid Password_confirm_password'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Confirm'))

WebUI.setText(findTestObject('Page_OneTeg  Simplified Integration/input_Email_login-username'), 'baristestingkatalon@outlook.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Password_login-password'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Users'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), 'bbbaristesting')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/td_bbbaristesting'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Back'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), 'bbbaristesting')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Dropbox Connection Katalon Test_cog-_5dcd2f'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Delete'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_cyangateone_nav-link dropdown-toggle labe_63359a'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_LogOut'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Email_login-username'), 'bgovercin@cyangate.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Password_login-password'), 
    'Ivdx4VpTewhRw10ELGOG8w==')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Users'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), 'bbbaristesting')

