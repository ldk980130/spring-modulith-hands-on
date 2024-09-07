package org.example.springmodulithhandson

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules

class ModulithTest {
    @Test
    fun `createApplicationModuleModel()`() {
        val modules = ApplicationModules.of(SpringModulithHandsOnApplication::class.java)
        modules.forEach { println(it) }
    }
}
