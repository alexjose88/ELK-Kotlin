package demo

import org.apache.logging.log4j.LogManager
import kotlin.test.Test

class AppTest {

    private val logger = LogManager.getLogger(AppTest::class.java)


    @Test
    fun `test to create some logs`() {

        logger.info("First info log from kotlin")
        logger.error("This is an error log from Kotlin")
    }
}