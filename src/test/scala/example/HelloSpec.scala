package example

import org.specs2.mutable.Specification

class HelloSpec extends Specification {

  "Hello" should {
    "say hello" in {
      Hello.greeting shouldEqual "hello"
    }
  }

}
