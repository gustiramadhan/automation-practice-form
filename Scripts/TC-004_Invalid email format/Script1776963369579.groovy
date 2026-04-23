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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Page_practice-form/input_First Name'), 'user')

WebUI.setText(findTestObject('Page_practice-form/input_Last Name'), 'testing')

WebUI.setText(findTestObject('Page_practice-form/input_Email'), 'usertesting@')

WebUI.click(findTestObject('Page_practice-form/input_Male'))

WebUI.setText(findTestObject('Page_practice-form/input_Mobile Number'), '1234567890')

WebUI.click(findTestObject('Page_practice-form/input_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Page_practice-form/select_2000'), '2000', false)

WebUI.selectOptionByValue(findTestObject('Page_practice-form/select_January'), '0', false)

WebUI.click(findTestObject('Page_practice-form/choose_ Saturday, January 22nd, 2000'))

WebUI.click(findTestObject('Page_practice-form/field_subjects'))

WebUI.setText(findTestObject('Page_practice-form/input_subjectsInput'), 'computer science')

WebUI.click(findTestObject('Page_practice-form/subjects_computer-science'))

WebUI.click(findTestObject('Page_practice-form/input_Sports'))

WebUI.click(findTestObject('Page_practice-form/input_Reading'))

WebUI.click(findTestObject('Page_practice-form/input_Music'))

WebUI.uploadFile(findTestObject('Page_practice-form/input_uploadPicture'), 'C:\\Users\\lenovo\\Downloads\\test.png')

WebUI.setText(findTestObject('Page_practice-form/input_Current Address'), 'jalan mawar no.89')

WebUI.click(findTestObject('Page_practice-form/select-state'))

WebUI.click(findTestObject('Page_practice-form/state_NCR'))

WebUI.click(findTestObject('Page_practice-form/select-city'))

WebUI.click(findTestObject('Page_practice-form/city_DELHI'))

WebUI.click(findTestObject('Page_practice-form/button_submit'))

WebUI.verifyTextNotPresent('Thanks for submitting the form', false)

WebUI.closeBrowser()

