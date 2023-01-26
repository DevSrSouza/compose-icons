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

public val BaselineGroup.SignalWifi4Bar: ImageVector
    get() {
        if (_signalWifi4Bar != null) {
            return _signalWifi4Bar!!
        }
        _signalWifi4Bar = Builder(name = "SignalWifi4Bar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 21.49f)
                lineTo(23.64f, 7.0f)
                curveToRelative(-0.45f, -0.34f, -4.93f, -4.0f, -11.64f, -4.0f)
                curveTo(5.28f, 3.0f, 0.81f, 6.66f, 0.36f, 7.0f)
                lineToRelative(11.63f, 14.49f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.01f, -0.01f)
                close()
            }
        }
        .build()
        return _signalWifi4Bar!!
    }

private var _signalWifi4Bar: ImageVector? = null
