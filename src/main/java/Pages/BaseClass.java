package Pages;


	

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public abstract class BaseClass  {
		Properties prop;
		FileInputStream file;
		
		
		public BaseClass() throws IOException {
			prop = new Properties();
			file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			prop.load(file);
			
			
		}
		
		
		

	}

