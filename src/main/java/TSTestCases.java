import java.io.File;
import org.sikuli.script.FindFailed;



public class TSTestCases
{

	public static boolean isDesktopPreviewLaunched(TSTester tester,
		String expectedImagePath)
	{
		boolean result;
		if (tester.isPresentElement(expectedImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;
	}


	public static boolean isImageMapPreviewLaunched(TSTester tester,
		String expectedImagePath)
	{
		boolean result;
		if (tester.isPresentElement(expectedImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;

	}
	
	public static boolean isCanvasPreviewLaunched(TSTester tester , String expectedImagePath){
		boolean result;
		if (tester.isPresentElement(expectedImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isToolBarPresent(TSTester tester, String toolBarImagePath)
	{
		boolean result;
		if (tester.isPresentElement(toolBarImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isViewPresent(TSTester tester, String viewImagePath)
	{

		boolean result = true;
		if (tester.isPresentElement(viewImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;

	}


	public static boolean isViewPresent(TSTester tester,
		String viewImagePath,
		float similar)
	{

		boolean result = true;
		if (tester.isPresentElement(viewImagePath, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;

	}


	public static boolean isOverviewPresent(TSTester tester, String overviewImagePath)
	{
		boolean result = true;
		if (tester.isPresentElement(overviewImagePath) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isOverviewPresent(TSTester tester,
		String overviewImagePath,
		float similar)
	{
		boolean result = true;
		if (tester.isPresentElement(overviewImagePath, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}
	
	public static boolean isLayoutPresent(TSTester tester,
		String expectedLayout,
		float similar)
	{
		boolean result = true;
		if (tester.isPresentElement(expectedLayout, similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isToolTipPresentWeb(TSTester tester,
		String imageHover,
		String imageExpected)
	{
		boolean result = true;
		long timeOut = Long.valueOf( TSAutomationUtils.getProperty("OnMouseHoverTimeOut"));
		
			tester.onMouseHoverImageMap(imageHover);
		
		if (tester.isPresentElement(imageExpected, new Float(0.64), timeOut) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}


	public static boolean isToolTipPresentDesktop(TSTester tester,
		String imageHover,
		String imageExpected)

	{
		boolean result = true;
		long timeOut = 1000;

		if (tester.operativeSystem.contains("windows"))
		{
			tester.onMouseHoverDesktop(imageHover);
		}

		else
		{
			tester.onMouseHoverDesktopMac(imageHover);
		}
		if (tester.isPresentElement(imageExpected, new Float(0.7), timeOut) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("isToolTipPresent result =" + result);
		return result;
	}
	
	public static boolean isToolTipPresentDesktop(TSTester tester,
		String imageHover,
		String imageExpected, float similar)

	{
		boolean result = true;
		long timeOut = 1200;

		if (tester.operativeSystem.contains("windows"))
		{
			tester.onMouseHoverDesktop(imageHover,similar);
		}

		else
		{
			tester.onMouseHoverDesktopMac(imageHover);
		}
		if (tester.isPresentElement(imageExpected, similar, timeOut) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("isToolTipPresent result =" + result);
		return result;
	}

	public static boolean isButtonPresent(TSTester tester, String buttonExpected){
		boolean result;
		if (tester.isPresentElement(buttonExpected) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;
	}
	
	public static boolean isButtonPresent(TSTester tester, String buttonExpected, float similar){
		boolean result;
		if (tester.isPresentElement(buttonExpected,similar) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}

		return result;
	}
	
	public static boolean runMSliceCanvas(TSTester tester,String minCapacity, String expectedLayout){
	boolean result;
		String mSliceButton = tester.tspHtml5PreviewImagePath + File.separator + "MSliceCanvas.png";
		String minCapacityButton = tester.tspHtml5PreviewImagePath + File.separator + "MinCapacityCanvas.png";
		String comboButton = tester.tspHtml5PreviewImagePath + File.separator + "ComboCanvas.png";
		try{
			tester.automationTesterCurrentScreen.click(mSliceButton);
			tester.automationTesterCurrentScreen.doubleClick(minCapacityButton);
			tester.automationTesterCurrentScreen.click(comboButton);
			tester.automationTesterCurrentScreen.click(minCapacity);
		}
		
		catch(FindFailed ff){
			System.out.println(ff.getMessage());
		}
		result=isLayoutPresent(tester, expectedLayout, new Float(0.80));
	
	
	return result;
	}
	
	public static boolean runMSliceImageMap(TSTester tester,String minCapacity, String expectedLayout){
		boolean result;
			String mSliceButton = tester.tspImageMapImagesPath + File.separator + "MSliceImageMap.png";
			String minCapacityButton = tester.tspImageMapImagesPath + File.separator + "MinCapacityImageMap.png";
			String comboButton = tester.tspImageMapImagesPath + File.separator + "ComboImageMap.png";
			try{
				tester.automationTesterCurrentScreen.click(mSliceButton);
				tester.automationTesterCurrentScreen.doubleClick(minCapacityButton);
				tester.automationTesterCurrentScreen.click(comboButton);
				tester.automationTesterCurrentScreen.click(minCapacity);
			}
			
			catch(FindFailed ff){
				System.out.println(ff.getMessage());
			}
			result=isLayoutPresent(tester, expectedLayout, new Float(0.80));
		
		
		return result;
		}
}
