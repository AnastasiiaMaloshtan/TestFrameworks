package pages;

import main.TestManager;

public class ResultPage extends TestManager {
	
	 public boolean isPresent(String parameter) {
	        String result = getDriver().getTitle();
	        while(result.equals("Google")){
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            result = getDriver().getTitle();
	           System.out.println(result); // check of the title of the page
	        }
	        	        return result.contains(parameter);
	    }

}
