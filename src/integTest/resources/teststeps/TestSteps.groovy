package cucumber.steps

import io.cucumber.java.en.When
import io.cucumber.java.en.Then

class TestSteps {
    @When('I throw an exception')
    def iThrowAnException() {
        throw new RuntimeException()
    }

    @When('I do nothing')
    def iDoNothing() {

    }

    @Then('I pass my assertion')
    def iPassMyAssertion() {
        assert 1 == 1
    }

    @Then('I fail my assertion')
    def iFailMyAssertion() {
        assert 1 == 2
    }

    @Then('^the value of sysprop (.*) is (.*)$')
    def checkSysprop(String key, String value) {
        assert System.properties.getProperty(key) == value
    }
}