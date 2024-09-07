package org.example.springmodulithhandson

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter

class ModulithTest {
    @Test
    fun `createApplicationModuleModel()`() {
        val modules = ApplicationModules.of(SpringModulithHandsOnApplication::class.java)

        modules.forEach { println(it) }
    }

    @Test
    fun `verifiesModularStructure()`() {
        val modules = ApplicationModules.of(SpringModulithHandsOnApplication::class.java)

        modules.verify()
    }

    @Test
    fun `createModuleDocumentation()`() {
        val modules = ApplicationModules.of(SpringModulithHandsOnApplication::class.java)

        Documenter(modules)
            .writeDocumentation()
            .writeIndividualModulesAsPlantUml()
    }
}
