package androidx.compose.material.icons.generator

import androidx.compose.material.icons.generator.vector.Vector

/**
 * Parser that converts [icon]s into [Vector]s
 */
actual class IconParser actual constructor(icon: Icon) {
    /**
     * @return a [Vector] representing the provided [icon].
     */
    actual fun parse(): Vector {
        TODO("Not yet implemented")
    }
}