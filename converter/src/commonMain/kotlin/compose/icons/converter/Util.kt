package compose.icons.converter

import java.io.File
import java.io.OutputStream
import java.util.*

fun <T> Stack<T>.peekOrNull(): T? = runCatching { peek() }.getOrNull()
expect fun parseSvgToXml(inputSVG: File, outStream: OutputStream): String