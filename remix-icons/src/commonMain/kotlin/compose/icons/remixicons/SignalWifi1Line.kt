package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SignalWifi1Line: ImageVector
    get() {
        if (_signalWifi1Line != null) {
            return _signalWifi1Line!!
        }
        _signalWifi1Line = Builder(name = "SignalWifi1Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(4.284f, 0.0f, 8.22f, 1.497f, 11.31f, 3.996f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveTo(3.78f, 4.497f, 7.714f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-0.693f, 0.0f, -1.367f, 0.117f, -2.0f, 0.34f)
                lineToRelative(2.0f, 2.477f)
                lineToRelative(2.0f, -2.477f)
                curveToRelative(-0.63f, -0.22f, -1.307f, -0.34f, -2.0f, -0.34f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-3.028f, 0.0f, -5.923f, 0.842f, -8.42f, 2.392f)
                lineToRelative(5.108f, 6.324f)
                curveTo(9.698f, 13.256f, 10.818f, 13.0f, 12.0f, 13.0f)
                curveToRelative(1.181f, 0.0f, 2.303f, 0.256f, 3.312f, 0.716f)
                lineTo(20.42f, 7.39f)
                curveTo(17.922f, 5.841f, 15.027f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _signalWifi1Line!!
    }

private var _signalWifi1Line: ImageVector? = null
