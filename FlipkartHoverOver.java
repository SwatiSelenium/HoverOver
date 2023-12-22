package HoverOver;
//hoverover sign in on flipkart and click flipkart pluz zone
//this assign is similar to click on fashion and then mens tshirt - these options are not coming bcoz of sale
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverOver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='✕']")).click();
		WebElement signin = driver.findElement(By.xpath("//span[.='Sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(signin).perform();
		WebElement flpz= driver.findElement(By.xpath("//a[.='Flipkart Plus Zone']"));
		flpz.click();
		// chk if prg is working or not? flipkart is having some prb now
	}

}
