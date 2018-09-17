package MavenTask;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.service.local.AppiumDriverLocalService;

//import org.testng.annotations.BeforeSuite;

import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class broswer {
	Process p;
	private AppiumServiceBuilder builder;
	private AppiumDriverLocalService service;
	
	String nodePath = "/usr/local/bin/node";
	//String nodePath="/Applications/Utilities/Terminal.app";
	String appiumJSPath="/usr/local/bin/appium";
	//String appiumJSPath ="/Applications/Appium2.app/Contents/Resources/node_modules/appium/lib/main.js";
	//String appiumJSPath = "/Applications/Appium2.app/Contents/Resources/node_modules/appium/build/lib/main.js";
	String cmd = "/usr/bin/open -a Terminal " + appiumJSPath;		
	/*
	public static void main(String[] args) {
		startAppium();
	}
	*/
	@BeforeSuite
	public void startAppium() throws InterruptedException, IOException
	{///usr/local/lib/node_modules/appium/appium
		/*
		   Thread.sleep(2000L);
		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
	            .usingDriverExecutable(new File("/usr/bin/open -a Terminal "))
	            .withAppiumJS(new File("/Applications/Appium2.app/Contents/Resources/node_modules/appium/build/lib/main.js"))
	            .usingPort(4723).withIPAddress("127.0.0.1"));
	    service.start();
	    Thread.sleep(2000L);
	    */
		/*
		builder = new AppiumServiceBuilder();
		System.out.println("1");
		builder.usingDriverExecutable(new File(nodePath));
		System.out.println("2");
		builder.withAppiumJS(new File(appiumJSPath));
		System.out.println("2");
		builder.withIPAddress("127.0.0.1");
		System.out.println("3");
		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"info");
		System.out.println("4");
		service = AppiumDriverLocalService.buildService(builder);
		System.out.println("5");
		*/
	//	/Applications/Appium.app/Contents/Resources/node/bin/node /Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js --address 127.0.0.1 --bootstrap-port 4724 --no-reset --local-timezone

		// main.js   /Applications/Appium\ 2.app/Contents/Resources/node_modules/appium/lib/main.js 
		System.out.println("Appium server start now!");
		//Runtime.getRuntime().exec("/usr/local/bin/open -a Terminal /Applications/Appium\\\\ 2.app/Contents/Resources/node_modules/appium/build/lib/main.js");
		p=Runtime.getRuntime().exec(cmd);

        // Provide wait time of 10 mins to start appium server properly.
        // If face any eÏrror(Could not start a new session...) then Increase
        // this time to 15 or 20 mins.
        Thread.sleep(10000);
        //System.out.println(p);
        
        if (p != null) {
            System.out.println("Appium server Is started now.");
            Thread.sleep(10000);
            
        }
        
		/*
		service =new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node")).withAppiumJS(new File("/Applications/Appium\\ 2.app/Contents/Resources/node_modules/appium/lib/main.js"));
		Thread.sleep(200);
		System.out.println("Appium server start now!if you can see this then which mean wrong wi next");
		service.build().start();*/
		System.out.println("Appium server is at your service!");
	}
	@AfterSuite
	 public void appiumStop() throws IOException {
	        System.out.println(p);
	        if (p != null) {
	            p.destroy();
	        }
	        System.out.println("Appium server Is stopped now.");
	    }
	/*
	@BeforeSuite
	public void broswer()
	{
		Running.getRuntime().exec("cmd/");
		Thread.sleep(200);
	}*/

}
