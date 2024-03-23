import com.microsoft.playwright.BrowserType
import com.microsoft.playwright.Playwright
import org.scalatest.wordspec.AnyWordSpec

import scala.util.Using

class TestPlaywright extends AnyWordSpec {

  def test() = {
    Using(Playwright.create()) { playwright =>
      val browser = playwright
        .chromium()
        .launch(new BrowserType.LaunchOptions().setHeadless(false))
      val page = browser.newPage();
      page.navigate("http://playwright.dev");
      System.out.println(page.title());
    }
  }

  "work 1" in {
    test()
  }

  "work 2" in {
    test()
  }
}
