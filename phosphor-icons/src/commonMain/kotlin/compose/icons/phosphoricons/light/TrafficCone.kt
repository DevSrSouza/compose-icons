package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 210.0f)
                lineTo(212.3f, 210.0f)
                lineTo(151.5f, 35.4f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 138.3f, 26.0f)
                lineTo(117.7f, 26.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.2f, 9.4f)
                lineTo(43.7f, 210.0f)
                lineTo(24.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(232.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(94.0f, 102.0f)
                horizontalLineToRelative(68.0f)
                lineToRelative(18.1f, 52.0f)
                lineTo(75.9f, 154.0f)
                close()
                moveTo(115.8f, 39.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, -1.3f)
                horizontalLineToRelative(20.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, 1.3f)
                lineTo(157.8f, 90.0f)
                lineTo(98.2f, 90.0f)
                close()
                moveTo(71.7f, 166.0f)
                lineTo(184.3f, 166.0f)
                lineToRelative(15.3f, 44.0f)
                lineTo(56.4f, 210.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
