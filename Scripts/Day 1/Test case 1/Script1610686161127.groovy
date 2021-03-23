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

WebUI.navigateToUrl('https://katalon-test.s3.amazonaws.com/aut/html/form.html')

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_First name_firstName'), 'Minh')

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_Last name_lastName'), 'Nguyen')

//WebUI.click(findTestObject('Object Repository/Page_Demo AUT/input_Male_gender'))
//
//WebUI.click(findTestObject('Object Repository/Page_Demo AUT/td_5'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_Address_address'), '1')
//
//WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/button_login'), '1')
//
//WebUI.click(findTestObject('Object Repository/Page_Demo AUT/div_Password'))
//
//WebUI.click(findTestObject('Object Repository/Page_Demo AUT/div_First name Last name GenderMale Female _743ef4'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/button_login'), '12')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo AUT/input_Password_password'), 'lnBUteI2ioQ=')
//
//WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_Company_company'), '12')
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo AUT/select_High salaryNice managerleaderExcelle_8daca8'), 
//    'High salary', true)
//
//WebUI.click(findTestObject('Object Repository/Page_Demo AUT/input'))
//
//WebUI.click(findTestObject('Object Repository/Page_Demo AUT/input'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/textarea_Comment_comment'), '12')

WebUI.takeScreenshotAsCheckpoint('sample')

WebUI.closeBrowser()

