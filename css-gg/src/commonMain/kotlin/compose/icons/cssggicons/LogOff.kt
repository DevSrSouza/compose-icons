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

public val CssGgIcons.LogOff: ImageVector
    get() {
        if (_logOff != null) {
            return _logOff!!
        }
        _logOff = Builder(name = "LogOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.009f)
                curveTo(13.0f, 3.457f, 12.553f, 3.009f, 12.0f, 3.009f)
                curveTo(11.448f, 3.008f, 11.0f, 3.456f, 11.0f, 4.008f)
                lineTo(10.997f, 12.012f)
                curveTo(10.997f, 12.564f, 11.444f, 13.012f, 11.997f, 13.012f)
                curveTo(12.549f, 13.012f, 12.997f, 12.565f, 12.997f, 12.012f)
                lineTo(13.0f, 4.009f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.992f)
                curveTo(4.0f, 10.783f, 4.895f, 8.783f, 6.343f, 7.335f)
                lineTo(7.757f, 8.749f)
                curveTo(6.672f, 9.835f, 6.0f, 11.335f, 6.0f, 12.992f)
                curveTo(6.0f, 16.305f, 8.686f, 18.992f, 12.0f, 18.992f)
                curveTo(15.314f, 18.992f, 18.0f, 16.305f, 18.0f, 12.992f)
                curveTo(18.0f, 11.335f, 17.328f, 9.835f, 16.243f, 8.749f)
                lineTo(17.657f, 7.335f)
                curveTo(19.105f, 8.783f, 20.0f, 10.783f, 20.0f, 12.992f)
                curveTo(20.0f, 17.41f, 16.418f, 20.992f, 12.0f, 20.992f)
                curveTo(7.582f, 20.992f, 4.0f, 17.41f, 4.0f, 12.992f)
                close()
            }
        }
        .build()
        return _logOff!!
    }

private var _logOff: ImageVector? = null
