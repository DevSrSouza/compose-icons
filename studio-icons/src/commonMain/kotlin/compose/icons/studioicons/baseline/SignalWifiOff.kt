package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SignalWifiOff: ImageVector
    get() {
        if (_signalWifiOff != null) {
            return _signalWifiOff!!
        }
        _signalWifiOff = Builder(name = "SignalWifiOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.64f, 7.0f)
                curveToRelative(-0.45f, -0.34f, -4.93f, -4.0f, -11.64f, -4.0f)
                curveToRelative(-1.5f, 0.0f, -2.89f, 0.19f, -4.15f, 0.48f)
                lineTo(18.18f, 13.8f)
                lineTo(23.64f, 7.0f)
                close()
                moveTo(17.04f, 15.22f)
                lineTo(3.27f, 1.44f)
                lineTo(2.0f, 2.72f)
                lineToRelative(2.05f, 2.06f)
                curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7.0f)
                lineToRelative(11.63f, 14.49f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(3.9f, -4.86f)
                lineToRelative(3.32f, 3.32f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-3.46f, -3.46f)
                close()
            }
        }
        .build()
        return _signalWifiOff!!
    }

private var _signalWifiOff: ImageVector? = null
