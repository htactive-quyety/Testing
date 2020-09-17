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

WebUI.setText(findTestObject('Object Repository/Test Add New User Pass/input_Login_email'), 'faddy_admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Add New User Pass/input_Login_password'), 'DX5oRW0DBYSuMKllilWT5w==')

WebUI.click(findTestObject('Object Repository/Test Add New User Pass/button_Login'))

WebUI.click(findTestObject('Object Repository/Test Add New User Pass/a_USERS MANAGEMENT'))

WebUI.click(findTestObject('Object Repository/Test Add New User Pass/button_List User (53)_btn-add-user btn btn-_74f5cb'))

WebUI.setText(findTestObject('Object Repository/Test Add New User Pass/input_First Name_firstName'), 'demo')

WebUI.setText(findTestObject('Object Repository/Test Add New User Pass/input_Last Name_lastName'), 'demo')

WebUI.setText(findTestObject('Object Repository/Test Add New User Pass/input_Email_email'), 'demo@gmail.com')

WebUI.setText(findTestObject('Object Repository/Test Add New User Pass/input_Phone Number_phone'), '0236547385')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Add New User Pass/input_Password_password'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Add New User Pass/input_Password confirm_passwordConfirm'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Add New User Pass/select_SellerBuyer'), 'Buyer', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Add New User Pass/select_ActivePause'), 'Pause', true)

WebUI.click(findTestObject('Object Repository/Test Add New User Pass/button_ADD'))

WebUI.setText(findTestObject('Object Repository/Test Add New User Pass/input_Filter_form-control w-auto ml-3'), 'demo')

WebUI.click(findTestObject('Object Repository/Test Add New User Pass/td_demo'))

WebUI.click(findTestObject('Object Repository/Test Add New User Pass/img_Users_c-avatar-img'))

WebUI.click(findTestObject('Object Repository/Test Add New User Pass/span_Account_fas fa-sign-out-alt mr-2'))

WebUI.closeBrowser()

