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

/**
 *WebUI.click clicks the given element.
 *findTestObject uniquely identify the web element. Web Elements are stored as objects under Object Repository*/

WebUI.click(findTestObject('HomePage/SignInButton'))

//waitForPageLoad will wait for maximum (timeOut seconds) until the page is loaded

WebUI.waitForPageLoad(GlobalVariable.timeOut)

//WebUI.setText sets the text - email in input field

WebUI.setText(findTestObject('LogInPage/Email'), email)

//sendKeys is similar to setText but the basic difference is that setKeys pass the data as it is being typed

WebUI.sendKeys(findTestObject('LogInPage/Password'), password)


WebUI.click(findTestObject('LogInPage/SignIn'))

//WebUI.delay provides the delay of delayTime seconds until the suceeding test case runs.

WebUI.delay(GlobalVariable.delayTime)

/*WebUI.verifyTextPresent verifies if the given text is present on the web page.
 * First parameter is string to be compared.
 * Second parameter is set to true if the passed data is RegEx.
*/

WebUI.verifyTextPresent(GlobalVariable.welcomeText, false)

WebUI.click(findTestObject('HomePage/SignOut'))

