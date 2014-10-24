import java.io.File;
import org.sikuli.basics.Settings;


public class TSEnvironment
{
	// On this path are stored the images used for the project Tests
	public String projectImagesPath;

	// On this path are stores the images used for tool bar on Desktop preview
	public String toolBarImagesPath;

	// On this path are the tool tips expected for the tests
	public String toolTipsImagePath;
	
	
	String testTypeImagePath;

	String projectName;

	String operativeSystem;

	String testPreviewType;
	
	String evidencePath;


	public TSEnvironment(String project, int testType)
	{
		
		
		switch (testType)
		{
			case 1:
				this.testTypeImagePath = "CommonDesktopPreview";
				this.testPreviewType="Desktop";
				break;
			case 2:
				this.testTypeImagePath = "CommonImageMapPreview";
				this.testPreviewType="ImageMap";
				break;
			case 3:
				this.testTypeImagePath = "CommonCanvasPreview";
				this.testPreviewType="HtmlCanvas";
				break;

			default:
				System.out.println("Error");

		}
		this.projectName = project;
		System.out.println("Setting");
		setEnvironment();
	}


	public void setEnvironment()
	{
		
		Settings.MoveMouseDelay = new Float(1.5);

		if (TSAutomationUtils.getOs().contains("mac os x"))

			operativeSystem = "Mac";
		else
		{
			operativeSystem = "Windows";
		}

		projectImagesPath =
			"images" + File.separator + operativeSystem + File.separator
				+ this.projectName + File.separator + testPreviewType;
		System.out.println(projectImagesPath);
		toolBarImagesPath =
			"images" + File.separator + operativeSystem + File.separator
				+ "TomSawyerPerspectives" + File.separator + testTypeImagePath
				+ File.separator + "ToolBar";
		System.out.println(toolBarImagesPath);

		toolTipsImagePath =
			"images" + File.separator + operativeSystem + File.separator
				+ "TomSawyerPerspectives" + File.separator + testTypeImagePath
				+ File.separator + "HoverToolTips";
		System.out.println(toolTipsImagePath);
		
		evidencePath = "images" + File.separator + operativeSystem + File.separator + projectName + File.separator +"Evidence"+File.separator;

	}


	public final static int DESKTOP_PREVIEW = 1;

	public final static int IMAGEMAP_PREVIEW = 2;

	public final static int HTML5_PREVIEW = 3;

}
