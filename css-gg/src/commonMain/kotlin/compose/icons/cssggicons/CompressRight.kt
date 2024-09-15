package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CompressRight: ImageVector
    get() {
        if (_compressRight != null) {
            return _compressRight!!
        }
        _compressRight = Builder(name = "CompressRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.567f, 8.029f)
                lineTo(20.91f, 1.769f)
                lineTo(22.315f, 3.193f)
                lineTo(15.992f, 9.434f)
                lineTo(19.561f, 9.448f)
                lineTo(19.553f, 11.448f)
                lineTo(12.554f, 11.42f)
                lineTo(12.581f, 4.42f)
                lineTo(14.581f, 4.428f)
                lineTo(14.567f, 8.029f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.979f, 14.543f)
                lineTo(4.409f, 14.546f)
                lineTo(4.407f, 12.546f)
                lineTo(11.407f, 12.54f)
                lineTo(11.413f, 19.54f)
                lineTo(9.413f, 19.542f)
                lineTo(9.41f, 15.94f)
                lineTo(3.096f, 22.231f)
                lineTo(1.685f, 20.814f)
                lineTo(7.979f, 14.543f)
                close()
            }
        }
        .build()
        return _compressRight!!
    }

private var _compressRight: ImageVector? = null
