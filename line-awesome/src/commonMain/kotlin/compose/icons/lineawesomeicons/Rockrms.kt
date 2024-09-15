package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Rockrms: ImageVector
    get() {
        if (_rockrms != null) {
            return _rockrms!!
        }
        _rockrms = Builder(name = "Rockrms", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(15.5f, 8.0f)
                curveTo(15.212f, 8.0f, 14.936f, 8.126f, 14.746f, 8.342f)
                lineTo(8.047f, 16.0f)
                lineTo(10.703f, 16.0f)
                lineTo(15.473f, 10.551f)
                lineTo(19.898f, 16.0f)
                lineTo(15.0f, 16.0f)
                curveTo(14.609f, 16.0f, 14.255f, 16.228f, 14.092f, 16.582f)
                curveTo(13.929f, 16.937f, 13.986f, 17.353f, 14.24f, 17.65f)
                lineTo(18.826f, 23.0f)
                lineTo(21.461f, 23.0f)
                lineTo(17.174f, 18.0f)
                lineTo(22.0f, 18.0f)
                curveTo(22.386f, 18.0f, 22.736f, 17.778f, 22.902f, 17.43f)
                curveTo(23.067f, 17.082f, 23.018f, 16.668f, 22.775f, 16.369f)
                lineTo(16.275f, 8.369f)
                curveTo(16.089f, 8.14f, 15.813f, 8.005f, 15.52f, 8.0f)
                lineTo(15.5f, 8.0f)
                close()
            }
        }
        .build()
        return _rockrms!!
    }

private var _rockrms: ImageVector? = null
