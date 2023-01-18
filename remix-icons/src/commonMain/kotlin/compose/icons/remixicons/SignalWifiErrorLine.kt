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

public val RemixIcons.SignalWifiErrorLine: ImageVector
    get() {
        if (_signalWifiErrorLine != null) {
            return _signalWifiErrorLine!!
        }
        _signalWifiErrorLine = Builder(name = "SignalWifiErrorLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(4.284f, 0.0f, 8.22f, 1.497f, 11.31f, 3.996f)
                lineToRelative(-1.257f, 1.556f)
                curveTo(19.306f, 6.331f, 15.808f, 5.0f, 12.0f, 5.0f)
                curveToRelative(-3.089f, 0.0f, -5.973f, 0.875f, -8.419f, 2.392f)
                lineTo(12.0f, 17.817f)
                lineToRelative(6.0f, -7.429f)
                verticalLineToRelative(3.183f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveTo(3.78f, 4.497f, 7.714f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(22.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _signalWifiErrorLine!!
    }

private var _signalWifiErrorLine: ImageVector? = null
