import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.selenium.WebBrowser

class TestSelenium extends AnyWordSpec with WebBrowser {

  def test() = {
    implicit val webDriver: WebDriver = {
      val options = new ChromeOptions
      options.addArguments("--headless")
      new ChromeDriver(options)
    }
    try {
      go to "http://playwright.dev"
      System.out.println(pageTitle);
    } finally {
      webDriver.quit()
    }
  }

  "work 1" in {
    test()
  }

  "work 2" in {
    test()
  }
}
