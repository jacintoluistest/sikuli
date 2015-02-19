package com.tomsawyer.perspectives.automation.sikuli;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.basics.Settings;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSAutomationUtils;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSEnvironment;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSFunctions;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSImageMapPreviewTestCases;
import com.tomsawyer.perspectives.automation.sikuli.tests.TSTester;

public class TSBridgeDetectionImageMapPreviewTest
{
		@BeforeClass
		public static void setUp()
		{
			// org.sikuli.basics.Debug.setDebugLevel(3);

			Settings.MoveMouseDelay = new Float(1.5);
			String defaultBrowser = TSAutomationUtils.getProperty("DefaultBrowser");
			className = TSMaxFlowImageMapPreviewTest.class.getName();
			environment =
				new TSEnvironment("MaxFlow", TSEnvironment.IMAGEMAP_PREVIEW, defaultBrowser);
			TSAutomationTester = new TSTester(defaultBrowser);
			imageMapTester =
				new TSImageMapPreviewTestCases(environment, TSAutomationTester, className);
			TSAutomationTester =
				TSFunctions.setImageMapTest(TSAutomationTester, "MaxFlowProjectPath");
			environment = TSFunctions.setScreenFolder(TSAutomationTester, environment);

		}
		
		@AfterClass
		public static void closeAll()
		{
			TSAutomationTester.fullScreenBrowser();
			TSAutomationTester.closeCurrentBrowser();
			TSAutomationTester.closeAll();
		}
		
		
		@Test
		public void testOnMouseHoverSaveAs()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverSaveAsImage());
		}


		@Test
		public void testOnMouseHoverPrintSetUp()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverPrintSetUp());
		}


		@Test
		public void testOnMouseHoverPrintPreview()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverPrintPreview());
		}


		@Test
		public void testOnMouseHoverSelect()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverSelect());
		}


		@Test
		public void testOnMouseHoverPan()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverPan());
		}


		@Test
		public void testOnMOuseHoverMarqueeZoom()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverMarqueeZoom());
		}


		@Test
		public void testOnMouseHoverZoomIn()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverZoomIn());
		}


		@Test
		public void testOnMouseHoverZoomOut()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverZoomOut());
		}


		@Test
		public void testOnMouseHoverZoomFit()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverZoomFit());
		}


		@Test
		public void testOnMOuseHoverOverview()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverOverview());
		}
		
		@Test
		public void testOnMouseHoverCircularLayout()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverCircularLayout());
		}


		@Test
		public void testOnMouseHoverHierarchicalLayout()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverHierarchicalLayout());
		}


		@Test
		public void testOnMouseHoverOrthogonalLayout()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverOrthogonalLayout());
		}


		@Test
		public void testOnMouseHoverSymmetricLayout()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverSymmetricLayout());
		}
		
		
		@Test
		public void testOnMouseHoverGlobalLayout()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverGlobalLayout());
		}
		
		@Test
		public void testOnMouseHoverIncrementalLayout()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverIncrementalLayout());
		}
		
		@Test
		public void testOnMouseHoverRun()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverRunBridgeDetection());
		}

		@Test
		public void testOnMouseHoverClearResults()
		{
			Assert.assertTrue(imageMapTester.testOnMouseHoverClearResults());
		}
		
		public void testCircularLayout()
		{
			Assert.assertTrue(imageMapTester.testCircularLayout());
		}


		public void testHierarchicalLayout()
		{
			Assert.assertTrue(imageMapTester.testHierarchicalLayout());
		}


		public void testOrthogonalLayout()
		{
			Assert.assertTrue(imageMapTester.testOrthogonalLayout());
		}


		public void testSymetricLayout()
		{
			Assert.assertTrue(imageMapTester.testSymmetricLayout());
		}

		
		static TSTester TSAutomationTester;

		static String className;

		static TSEnvironment environment;

		static int screenId;

		static String projectName;

		static TSImageMapPreviewTestCases imageMapTester;


}
