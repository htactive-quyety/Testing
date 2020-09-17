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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fappymanagement.web.app/login')

WebUI.setText(findTestObject('Object Repository/Test Add New Market Failed/input_Login_email'), 'faddy_admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Add New Market Failed/input_Login_password'), 'DX5oRW0DBYSuMKllilWT5w==')

WebUI.click(findTestObject('Object Repository/Test Add New Market Failed/button_Login'))

WebUI.click(findTestObject('Object Repository/Test Add New Market Failed/a_SELLERS MANAGEMENT'))

WebUI.click(findTestObject('Object Repository/Test Add New Market Failed/a_MARKETERS'))

WebUI.click(findTestObject('Object Repository/Test Add New Market Failed/button_List Marketers (9)_btn btn-outline-s_275565'))

WebUI.click(findTestObject('Object Repository/Test Add New Market Failed/button_SAVE'))

WebUI.setText(findTestObject('Object Repository/Test Add New Market Failed/input_Phone Number_phone'), '43465546547')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Add New Market Failed/select_1 star2 star3 star4 star5 star'), 
    '4', true)

WebUI.uploadFile(findTestObject('upload Image Market/button_Upload'), 'C:\\Users\\Administrator\\Desktop\\104742030_1164711730530963_5066775043358081452_o.jpg')

WebUI.setText(findTestObject('Object Repository/Test Add New Market Failed/textarea_Address_form-control'), 'h')

WebUI.setText(findTestObject('Object Repository/Test Add New Market Failed/textarea_h'), 'hh')

WebUI.setText(findTestObject('Object Repository/Test Add New Market Failed/textarea_hh'), 'hhh')

WebUI.setText(findTestObject('Object Repository/Test Add New Market Failed/textarea_hhh'), 'hhhh')

WebUI.click(findTestObject('Object Repository/Test Add New Market Failed/button_SAVE'))

WebUI.closeBrowser()

