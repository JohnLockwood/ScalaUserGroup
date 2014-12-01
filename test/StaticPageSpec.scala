import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._
import static.StaticPage


@RunWith(classOf[JUnitRunner])
class StaticPageSpec extends Specification {

    "StaticPage" should {

        "be a class in static package" in new WithApplication {
            val staticPage = new StaticPage()
        }
    }
}