package com.tomsawyer.perspectives.automation.sikuli;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;

import com.tomsawyer.perspectives.automation.sikuli.tests.TSDesktopPreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;

public class TSMSliceDesktopPreviewTest
{
	
	@BeforeClass
	public static void setUp() throws Exception
	{
		//org.sikuli.basics.Debug.setDebugLevel(3);
		className = TSMSliceDesktopPreviewTest.class.getName();
		Settings.MoveMouseDelay = new Float(1.5);
		environment =
			new TSEnvironment("MSlice", TSEnvironment.DESKTOP_PREVIEW);
		TSAutomationTester = new TSTester();
		desktopTester = new TSDesktopPreviewTestCases(environment, TSAutomationTester, className);
		TSAutomationTester = TSFunctions.setDesktopTest(TSAutomationTester, "MSliceProjectPath");
		environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);

	}

	@AfterClass
	public static void closeAll()
	{
		TSAutomationTester.closeDekstopPreview();
		TSAutomationTester.closeAll();
	}
	
	@Test
	public void testOnMouseHoverSaveAs()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSaveAs());

	}
	
	@Test
	public void testOnMouseHoverPrintSetUp(){
	
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintSetUp());
		
	}

	@Test
	public void testOnMouseHoverPrintPreview(){
	
		Assert.assertTrue(desktopTester.testOnMouseHoverPrintSetUp());
	
	}

	@Test
	public void testOnMouseHoverPrint(){
		Assert.assertTrue(desktopTester.testOnMouseHoverPrint());
	}
	
	@Test
	public void testOnMouseHoverSelect()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverSelect());
	}
	
	@Test
	public void testOnMouseHoverPan()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverPan());
	}
	
	
	
	@Test
	public void testOnMouseHoverNavigateLinks()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverNavigateLinks());
	}
	
	@Test
	public void testOnMouseHoverMarqueeZoom()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverMarqueeZoom());
	}
	
	@Test
	public void testOnMouseHoverInteractiveZoom()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverInteractiveZoom());
	}
	
	@Test
	public void testOnMouseHoverZoomIn()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomIn());
	}

	@Test
	public void testOnMouseHoverZoomFit()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomFit());
	}
	
	@Test
	public void testOnMouseHoverOverview()
	{

		Assert.assertTrue(desktopTester.testOnMouseHoverOverview());
	}
	
	@Test
	public void testOnMouseHoverMSlice()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverMSlice());
	}
	
	@Test
	public void testOnMouseHoverClearResult()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverClearResults());
	}
	
	
	@Test
	public void testOnMouseHoverZoomOut()
	{
		Assert.assertTrue(desktopTester.testOnMouseHoverZoomOut());
	}
	
	@Test
	public void testIsOverviewPresent()
	{
		Assert.assertTrue(desktopTester.testIsOverviewPresent());
		
	}
	

	@Test
	public void testIsMSliceButtonEnable()
	{
		Assert.assertTrue(desktopTester.testIsMSliceButtonEnable());
	}
	
	
	@Test
	public void testIsClearResultsButtonDisable()
	{
		Assert.assertTrue(desktopTester.testIsClearResultsButtonDisable());
	}


	@Test
	public void testMSlice100()
	{
		Assert.assertTrue(desktopTester.testMSlice100());
	}
	
	@Test
	public void testMSlice1000()
	{
		Assert.assertTrue(desktopTester.testMSlice1000());
		
	}

	static TSTester TSAutomationTester;

	static String className;

	static TSEnvironment environment;
	
	static int screenId;
	
	static TSDesktopPreviewTestCases desktopTester;

}
