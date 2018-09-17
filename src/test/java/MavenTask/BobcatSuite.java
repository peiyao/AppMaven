package MavenTask;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class BobcatSuite {
	
		static AndroidDriver<MobileElement> driver;
	    static DesiredCapabilities cap = new DesiredCapabilities();
	    @Test
	public void test() throws MalformedURLException,InterruptedException {
		File f=new File("src/test/resources");
		File fs=new File(f,"ApiDemos-debug.apk");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "BH905CXJ5Z");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	    
	  
	}
