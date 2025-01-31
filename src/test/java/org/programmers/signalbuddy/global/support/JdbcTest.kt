package org.programmers.signalbuddy.global.support

import org.junit.jupiter.api.BeforeEach
import org.programmers.signalbuddy.global.config.DataInitializer
import org.programmers.signalbuddy.global.db.MariaDBTestContainer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.transaction.annotation.Transactional

@Transactional
@SpringBootTest
@Import(DataInitializer::class)
abstract class JdbcTest : MariaDBTestContainer {

    @Autowired
    private lateinit var dataInitializer: DataInitializer

    @BeforeEach
    fun delete() {
        dataInitializer.clear()
    }
}
