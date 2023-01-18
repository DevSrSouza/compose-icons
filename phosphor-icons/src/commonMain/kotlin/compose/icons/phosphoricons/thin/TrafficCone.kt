package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 212.0f)
                lineTo(210.8f, 212.0f)
                lineTo(149.6f, 36.1f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 138.3f, 28.0f)
                lineTo(117.7f, 28.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -11.3f, 8.1f)
                lineTo(45.2f, 212.0f)
                lineTo(24.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(232.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(92.6f, 100.0f)
                horizontalLineToRelative(70.8f)
                lineToRelative(19.5f, 56.0f)
                lineTo(73.1f, 156.0f)
                close()
                moveTo(113.9f, 38.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.8f, -2.7f)
                horizontalLineToRelative(20.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.8f, 2.7f)
                lineTo(160.6f, 92.0f)
                lineTo(95.4f, 92.0f)
                close()
                moveTo(70.3f, 164.0f)
                lineTo(185.7f, 164.0f)
                lineToRelative(16.7f, 48.0f)
                lineTo(53.6f, 212.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
