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

WebUI.openBrowser('https://www.demoblaze.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_STORE/img_360_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Product description_btn btn-success btn-lg'))

WebUI.delay(4)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_STORE/a_PRODUCT STORE_nav-link'))

WebUI.click(findTestObject('Object Repository/Page_STORE/img_CATEGORIES_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Product description_btn btn-success btn-lg_1'))

WebUI.delay(4)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_STORE/a_(current)_cartur'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Total_btn btn-success'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), 'Mayra')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), 'Ecuador')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), 'Quito')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), '')

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Month_month'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), '12')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '25')

WebUI.click(findTestObject('Object Repository/Page_STORE/div_Place order_modal-body'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Close_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Cancel_confirm btn btn-lg btn-primary'))

