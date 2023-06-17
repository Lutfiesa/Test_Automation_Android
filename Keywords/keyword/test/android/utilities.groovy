package keyword.test.android

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class utilities {
	
	@Keyword
	def testAndroid(inputdata1, inputdata2) {
		
		Mobile.clearText(findTestObject('Object Repository/Test Android APK/inputtextEditMainMenu'), 1)
		Mobile.setText(findTestObject('Object Repository/Test Android APK/inputtextEditMainMenu'), inputdata1, 0)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttonPopupWindow'), 1)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttondismiss2'), 2)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttonChrome'), 0)
		Mobile.setText(findTestObject('Object Repository/Test Android APK/inputTextSayHelloDemo'), inputdata2, 0)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttonDropDown'), 1)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/selectcarMercedes'), 1)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttonSendMeYourName'), 1)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttonDropdownWebDrive'), 0)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/selectClickSource'), 0)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttonigototarget'), 1)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttinGotoHomeScreen'), 0)
		Mobile.tap(findTestObject('Object Repository/Test Android APK/buttoncheckbox'), 0)
		
	}
	
	@Keyword
	def popup( ) {
		
		if(Mobile.verifyElementExist(findTestObject('Object Repository/Test Android APK/popupcheckupdate'), 5, FailureHandling.OPTIONAL)) {
				Mobile.tap(findTestObject('Object Repository/Test Android APK/buttonokPopup'), 3)
		} else {
				println('button Lewati tidak ada')
		}
		
	}
	
}
