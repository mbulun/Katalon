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

WebUI.navigateToUrl('https://app.qa.oneteg.com/en/flows/edit/957acdd6-8cad-4c0b-a87c-a2bc9d680c27/1')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Flows'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Active_search-input'), 'bria')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_Bria Basic Flow  v1'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/img_LogOut_logo-step-header'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__flow-connection-select'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/span_Bria Connection_test_intern'))

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Name_flow-step-name'), 'Search for images matching the given text query (GET)')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input__flow-action-select'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/li_Search Search for images matching the gi_c65525'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/select_Style_propertiesqueryParamstyle-select'), 
    'photo realistic', true)

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Page_propertiesqueryParampage-input'), 
    '[{"name":"1","type":"input"}]')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Page_propertiesqueryParampage-input'), 
    '[{"name":"1","type":"input"}]')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/select_Camera_propertiesqueryParamcamera-select'), 
    'landscape', true)

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Num Results Per Page_propertiesqueryP_0806fc'), 
    '[{"name":"1","type":"input"}]')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_1_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Num Results Per Page_propertiesqueryP_0806fc'), 
    '[{"name":"1","type":"input"}]')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Query_propertiesqueryParamquery-input'), 
    '[{"name":"Clean Oceans","type":"input"}]')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_Clean Oceans'), 'Clean Oceans')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Query_propertiesqueryParamquery-input'), 
    '[{"name":"Clean Oceans","type":"input"}]')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/select_Medium_propertiesqueryParammedium-select'), 
    'photography', true)

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Num Synthetic Results Per Page_proper_d595ef'), 
    '[{"name":"1","type":"input"}]')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/div_1_1_2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Num Synthetic Results Per Page_proper_d595ef'), 
    '[{"name":"1","type":"input"}]')

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Synchronous_propertiesqueryParamsynch_7d3244'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/select_Atmosphere_propertiesqueryParamatmos_1b8258'), 
    'warm', true)

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/input_Synthetic Search_propertiesqueryParam_cd6f35'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Organization_el-button el-button--de_e5629d'))

WebUI.click(findTestObject('Object Repository/Page_OneTeg  Simplified Integration/button_Search Assets_flow-simulate'))

