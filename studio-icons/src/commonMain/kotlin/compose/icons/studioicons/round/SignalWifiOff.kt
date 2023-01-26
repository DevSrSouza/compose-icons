package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SignalWifiOff: ImageVector
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
                curveToRelative(-1.32f, 0.0f, -2.55f, 0.14f, -3.69f, 0.38f)
                lineTo(18.43f, 13.5f)
                lineTo(23.64f, 7.0f)
                close()
                moveTo(4.12f, 2.01f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.35f, 1.35f)
                curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7.0f)
                lineToRelative(10.08f, 12.56f)
                curveToRelative(0.8f, 1.0f, 2.32f, 1.0f, 3.12f, 0.0f)
                lineToRelative(2.35f, -2.93f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(4.12f, 2.01f)
                close()
            }
        }
        .build()
        return _signalWifiOff!!
    }

private var _signalWifiOff: ImageVector? = null
