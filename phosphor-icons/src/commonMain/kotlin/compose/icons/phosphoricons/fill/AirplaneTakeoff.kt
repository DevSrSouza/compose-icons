package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) {
            return _airplaneTakeoff!!
        }
        _airplaneTakeoff = Builder(name = "AirplaneTakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 216.0f)
                close()
                moveTo(247.1f, 89.5f)
                lineTo(228.5f, 66.7f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, -46.2f, -8.2f)
                lineTo(139.5f, 83.6f)
                lineTo(81.3f, 64.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -2.9f, 0.1f)
                lineTo(61.9f, 71.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.3f, 19.9f)
                lineToRelative(26.6f, 24.0f)
                lineTo(63.7f, 127.5f)
                lineTo(37.6f, 116.3f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -3.2f, 0.0f)
                lineToRelative(-16.7f, 7.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.5f, 19.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(37.7f, 35.3f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, false, 42.7f, 4.9f)
                lineTo(246.0f, 95.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.9f, -2.8f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 247.1f, 89.5f)
                close()
            }
        }
        .build()
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
