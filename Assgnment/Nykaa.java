package Assgnment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {
	
	
	
		public static void main(String[] args) {
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.nykaa.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		
			
			WebElement move=driver.findElement(By.xpath("//a[text()='brands']"));
			
			Actions act=new Actions(driver);
			
			act.moveToElement(move).build().perform();
			
			
			
			WebElement text2=driver.findElement(By.linkText("L'Oreal Paris"));
			
			text2.click();
			
			String title=driver.getTitle();
			                                 
			System.out.println(title);
			
			driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
			
			
		    driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
			
			
			driver.findElement(By.xpath("//span[text()='Category']")).click();
			
			
			driver.findElement(By.xpath("(//span[@class='filter-name '])[2]")).click();
			
			
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			
			
			driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
			
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			
	        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
			
			
		
			
			WebElement shamp=driver.findElement(By.xpath("//div[@class='css-43m2vm']"));
			
			shamp.click();
			
			Set<String>w1=driver.getWindowHandles();
			
			List<String> bj =new ArrayList<String>(w1);
			
			
			driver.switchTo().window(bj.get(1));

			
			WebElement size=driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
			
			Select select=new Select(size);
			select.selectByValue("2");
			
		    WebElement amount=driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]"));
			
		    String mrprice=amount.getText();
		    
		    String replaceamount= mrprice.replaceAll("[^0-9]", "");
			
		    System.out.println("amount="+replaceamount);
			
			driver.findElement(By.xpath("(//button[@class=' css-1qvy369']//span)[1]")).click();
			
			
			driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
			
			driver.switchTo().frame(0);
			
			WebElement ra=driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span"));
			
			String rate=ra.getText();
			
			String price1 = rate.replaceAll("[^0-9]", "");
			
			System.out.println(price1);
			
			driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
			
			
			
			driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
			
			driver.findElement(By.xpath("//div[@class='css-gecnnw eqr1d9n12']")).click();
			
			
			WebElement check2=driver.findElement(By.xpath("(//span[@class='css-1b232xc ehes2bo3'])[2]"));
			
			check2.click();
			
			WebElement check3=driver.findElement(By.xpath("(//p[@class='css-masf0q eka6zu20'])[2]"));
			
			String rate2=check3.getText();
			
			String price2 = rate2.replaceAll("[^0-9]", "");
			
			System.out.println(price2);
			
			if (price1.equals(price2)) 
			{
				System.out.println(" the same in step 14");
			}

}
}
