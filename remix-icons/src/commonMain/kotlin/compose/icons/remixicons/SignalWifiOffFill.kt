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

public val RemixIcons.SignalWifiOffFill: ImageVector
    get() {
        if (_signalWifiOffFill != null) {
            return _signalWifiOffFill!!
        }
        _signalWifiOffFill = Builder(name = "SignalWifiOffFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineToRelative(17.677f, 17.678f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.683f, -3.683f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveToRelative(0.914f, -0.74f, 1.902f, -1.391f, 2.95f, -1.942f)
                lineTo(1.394f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.284f, 0.0f, 8.22f, 1.497f, 11.31f, 3.996f)
                lineToRelative(-5.407f, 6.693f)
                lineTo(7.724f, 3.511f)
                curveTo(9.094f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _signalWifiOffFill!!
    }

private var _signalWifiOffFill: ImageVector? = null
