import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;  


           
		  

public class Sample{  
  
   static Logger logg=Logger.getLogger(Sample.class);
	 
	   public static void main(String[] args)
	   {

		   PropertyConfigurator.configure("log4j.properties");
		   //DOMConfigurator.configure("log4j.xml");  
		   logg.info("Hello this is an info message");  
		   logg.warn("Hello this is an warning message");
		   logg.error("Hello this is an error message");
		   logg.fatal("Hello this is an fatal message");
		   
	   }  
	}   