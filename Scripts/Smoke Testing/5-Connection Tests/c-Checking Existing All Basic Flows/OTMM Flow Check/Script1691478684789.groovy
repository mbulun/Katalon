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

WebUI.navigateToUrl('https://app.qa.oneteg.com/en/activities')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Flows'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/a_OTMM basic flow'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_Metadatamodels Retrieve Metadata Models_f9a591'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Search Assets_flow-simulate'))

WebUI.delay(3)

WebUI.rightClick(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/p_100503.249 main INFO  i.c.c.c.g.i.routes._679911'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Activities'))

WebUI.delay(3)

