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

WebUI.navigateToUrl('https://akademik.polban.ac.id/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/h2_PANDUAN LOGIN APLIKASI AKADEMIK'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/h2_JADWAL KEGIATAN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/p_Mahasiswa - Sign in to start your session'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/a_I forgot my password'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/button_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Page_Mahasiswa  Log in/a_I forgot my password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/h1_Forgot Password'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/p_Please enter your Email so we can send yo_91eab7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/label_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/input_Email_submit'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Mahasiswa  Log in/input_Email_email'), 'roma.ulina.tif418')

WebUI.click(findTestObject('Object Repository/Page_Mahasiswa  Log in/input_Email_submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mahasiswa  Log in/p_The Email Address field must contain a va_4349c4'), 
    0)

WebUI.closeBrowser()

