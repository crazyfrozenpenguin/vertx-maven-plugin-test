package it.org.vertx.maven.plugin.test.selenium;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.By.tagName;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VertxTest {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://localhost:8080");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void shouldSayHello() {
		final WebElement h1 = driver.findElement(tagName("h1"));

		assertThat("Should contain", h1.getText(), containsString("vert.x"));
	}
}
