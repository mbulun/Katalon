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

WebUI.callTestCase(findTestCase('1-Login/Login_WithoutLogout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Flows'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_3-4Allportal Hospital Basic Flow  v8'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_Apps Get all respository apps (GET)'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__flow-connection-select'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_4Allportal Hospital_test_intern'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Name_flow-step-name'), 'Apps: Get all respository apps (GET)')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__flow-action-select'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Apps Get all respository apps (GET)'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/path_1'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/path_1'))

