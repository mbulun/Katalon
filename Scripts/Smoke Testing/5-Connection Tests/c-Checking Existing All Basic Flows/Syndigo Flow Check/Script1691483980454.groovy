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

WebUI.setText(findTestObject('Page_OneTeg  Simplified Integration/input_Active_search-input'), 'syndigo basic flow')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_syndigo basic flow'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_Product Search  Retrieve v2.0  Product _602c1a'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Search Assets_flow-simulate'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/p_113639.572 main INFO  i.c.c.c.g.i.routes._c52a55'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Activities'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('1-Login/Just Logout'), [:], FailureHandling.STOP_ON_FAILURE)

