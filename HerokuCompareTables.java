package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HerokuCompareTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		
		List<WebElement> rows1 = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		List<WebElement> rows2 = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
		
		 if(rows1.size() != rows2.size() ) {
			 
			 System.out.println("Rows Count Mismatch  table 1: "+rows1.size() +" table2 :"+rows2.size());
		 }
		 
		 
		 for(int i=0 ; i<Math.min(rows1.size(), rows2.size()) ; i++) {
			 
			 List<WebElement> row1 = rows1.get(i).findElements(By.tagName("tr"));
			 List<WebElement> row2 = rows2.get(i).findElements(By.tagName("tr"));
			 
			 
			 for(int i1=0 ; i1<Math.min(row1.size(), row2.size()) ; i1++) {
				 
				 List<WebElement> col = row1.get(i1).findElements(By.tagName("td"));
				 List<WebElement> col1 = row2.get(i1).findElements(By.tagName("td"));
				 
				 if(!col.equals(col1)) {
					 
					 System.out.println("Mismatch at row : "+ i +" column: "+i1);
					 System.out.println("Table1: "+ col + " Table2: "+col1);
					 
				 }
				
					 System.out.println("Table1: "+ col + " Table2: "+col1);
					 System.out.print(col1 + " | ");
					 System.out.print(col + " | ");
				 
			 }
		 }
	
	}

}
