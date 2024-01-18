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

WebUI.setViewPortSize(500, 800)

WebUI.scrollToElement(findTestObject('Reto_validaciones/Page_DEMOQA/button_Submit'), 0)

WebUI.waitForElementClickable(findTestObject('Reto_validaciones/Page_DEMOQA/button_Submit'), 20)

WebUI.click(findTestObject('Reto_validaciones/Page_DEMOQA/button_Submit'))

WebUI.scrollToPosition(0, 800)

Nombre = WebUI.waitForImagePresent(findTestObject('Reto_validaciones/extras/Page_DEMOQA/inputfirstName'), 4)

print(Nombre)

Apellido = WebUI.waitForImagePresent(findTestObject('Reto_validaciones/extras/Page_DEMOQA/inputlastName'), 4)

print(Apellido)

if (Nombre == true) {
    WebUI.setText(findTestObject('Reto_validaciones/extras/Page_DEMOQA/inputfirstName'), 'Daniela')

    WebUI.delay(2)
}


if (Apellido == true) {
	WebUI.setText(findTestObject('Reto_validaciones/extras/Page_DEMOQA/inputlastName'), 'Dan')

	WebUI.delay(5)
}


WebUI.closeBrowser()

