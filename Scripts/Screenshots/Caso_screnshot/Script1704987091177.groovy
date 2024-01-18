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

WebUI.navigateToUrl('https://demoqa.com/webtables')

WebUI.click(findTestObject('Object Repository/Screnshots/Page_DEMOQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/Screnshots/Page_DEMOQA/inputfirstName'), 'Daniela')

WebUI.setText(findTestObject('Object Repository/Screnshots/Page_DEMOQA/inputlastName'), 'dan')

WebUI.setText(findTestObject('Object Repository/Screnshots/Page_DEMOQA/inputuserEmail'), 'dan@gmail.com')

WebUI.setText(findTestObject('Object Repository/Screnshots/Page_DEMOQA/inputage'), '30')

WebUI.setText(findTestObject('Object Repository/Screnshots/Page_DEMOQA/inputsalary'), '3500')

WebUI.setText(findTestObject('Object Repository/Screnshots/Page_DEMOQA/inputdepartment'), 'it')

WebUI.takeScreenshot('C:\\KATALON\\Proyectos\\Proyecto_uno\\Images\\imgtest1.png')

WebUI.closeBrowser()

