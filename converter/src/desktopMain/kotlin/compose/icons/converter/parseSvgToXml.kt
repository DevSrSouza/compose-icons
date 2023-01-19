package compose.icons.converter

import com.android.ide.common.vectordrawable.Svg2Vector
import java.io.File
import java.io.OutputStream

actual fun parseSvgToXml(inputSVG: File, outStream: OutputStream): String {
    return Svg2Vector.parseSvgToXml(inputSVG, outStream)
}