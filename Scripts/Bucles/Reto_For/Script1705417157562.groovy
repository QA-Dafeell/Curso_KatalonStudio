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

WebUI.navigateToUrl('https://demoqa.com/text-box')

for (x = 1; x <= 2; x++) {
    int num = ((Math.random()) * (1000) as int)
	
	def z= ["ruben","emma","alba","nany"]
	
	Random rn= new Random()
	
	next_nom = z[rn.nextInt(z.size())]

    //WebUI.setText(findTestObject('Object Repository/Bucles/Reto_for/Page_DEMOQA/inputuserName'), 'daniela ' + num)
	WebUI.setText(findTestObject('Object Repository/Bucles/Reto_for/Page_DEMOQA/inputuserName'), next_nom)

    //WebUI.setText(findTestObject('Object Repository/Bucles/Reto_for/Page_DEMOQA/inputuserEmail'), ('dan' + num) + '@gmail.com')
	WebUI.setText(findTestObject('Object Repository/Bucles/Reto_for/Page_DEMOQA/inputuserEmail'), next_nom + '@gmail.com')

    WebUI.setText(findTestObject('Object Repository/Bucles/Reto_for/Page_DEMOQA/textareacurrentAddress'), 'dire1 ' + num)

    WebUI.setText(findTestObject('Object Repository/Bucles/Reto_for/Page_DEMOQA/textareapermanentAddress'), 'dire2' + num)

    WebUI.click(findTestObject('Object Repository/Bucles/Reto_for/Page_DEMOQA/button_Submit'))

    WebUI.delay(3)
}

WebUI.closeBrowser()

