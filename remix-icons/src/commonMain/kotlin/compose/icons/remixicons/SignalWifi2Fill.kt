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

public val RemixIcons.SignalWifi2Fill: ImageVector
    get() {
        if (_signalWifi2Fill != null) {
            return _signalWifi2Fill!!
        }
        _signalWifi2Fill = Builder(name = "SignalWifi2Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 5.0f)
                curveToRelative(-3.028f, 0.0f, -5.923f, 0.842f, -8.42f, 2.392f)
                lineToRelative(3.178f, 3.935f)
                curveTo(8.316f, 10.481f, 10.102f, 10.0f, 12.0f, 10.0f)
                curveToRelative(1.898f, 0.0f, 3.683f, 0.48f, 5.241f, 1.327f)
                lineTo(20.42f, 7.39f)
                curveTo(17.922f, 5.841f, 15.027f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _signalWifi2Fill!!
    }

private var _signalWifi2Fill: ImageVector? = null
