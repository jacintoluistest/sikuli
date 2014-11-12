

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


	public static boolean isToolTipPresentWeb(TSTester tester,
		String imageHover,
		String imageExpected)
	{
		boolean result = true;
		long timeOut = 1200;
		
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
		long timeOut = 1200;

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


	public static boolean isToolTipPresentDesktop(TSTester tester, String imageToolPath)
	{
		boolean result = true;
		long timeOut = 1000;
		tester.onMouseHoverImageMap(imageToolPath);
		if (tester.isPresentElement(imageToolPath, new Float(0.7), timeOut) != null)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}
	
	
	public static boolean circularLayout(){
		
		return true;
	}

}
