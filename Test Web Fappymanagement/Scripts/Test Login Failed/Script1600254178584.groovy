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

WebUI.setText(findTestObject('Object Repository/Test Login Failed/input_Login_email'), 'faddy_admin@gmail.com')

WebUI.click(findTestObject('Object Repository/Test Login Failed/button_Login'))

WebUI.setText(findTestObject('Object Repository/Test Login Failed/input_Login_email'), 'faddy_admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Login Failed/input_Login_password'), 'S7CYZ2LRgTWzqiU9rNNC5w==')

WebUI.click(findTestObject('Object Repository/Test Login Failed/button_Login'))

WebUI.setText(findTestObject('Object Repository/Test Login Failed/input_Login_email'), '')

WebUI.click(findTestObject('Object Repository/Test Login Failed/div_LoginSign In to your accountPlease chec_90708b'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test Login Failed/input_Login_password'), 'DX5oRW0DBYSuMKllilWT5w==')

WebUI.click(findTestObject('Object Repository/Test Login Failed/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test Login Failed/input_Login_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Test Login Failed/button_Login'))

WebUI.closeBrowser()

