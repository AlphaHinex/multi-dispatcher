package alpha.hinex.demo.app

import io.github.springroll.test.AbstractIntegrationTest
import org.junit.Test
import org.springframework.http.HttpStatus

class IntegrationTest extends AbstractIntegrationTest {

    @Test
    void test() {
        assert resOfGet('/', HttpStatus.OK) == 'hello world'
        assert resOfGet('/foo/same/path', HttpStatus.OK) == 'in foo controller'
        assert resOfGet('/bar/same/path', HttpStatus.OK) == 'in bar controller'
    }

}
