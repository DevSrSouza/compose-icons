package androidx.compose.material.icons.generator

/**
 * Converts a snake_case name to a KotlinProperty name.
 *
 * If the first character of [this] is a digit, the resulting name will be prefixed with an `_`
 */
internal actual fun String.toKotlinPropertyName(): String {
    return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, this).let { name ->
        if (name.first().isDigit()) "_$name" else name
    }
}