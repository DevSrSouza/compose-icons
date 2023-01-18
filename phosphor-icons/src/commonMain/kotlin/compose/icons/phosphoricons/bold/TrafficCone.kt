package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 204.0f)
                lineTo(216.5f, 204.0f)
                lineTo(157.2f, 33.4f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 138.3f, 20.0f)
                lineTo(117.7f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 98.8f, 33.4f)
                lineTo(39.5f, 204.0f)
                lineTo(24.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(98.3f, 108.0f)
                horizontalLineToRelative(59.4f)
                lineToRelative(13.9f, 40.0f)
                lineTo(84.4f, 148.0f)
                close()
                moveTo(120.5f, 44.0f)
                horizontalLineToRelative(15.0f)
                lineToRelative(13.9f, 40.0f)
                lineTo(106.6f, 84.0f)
                close()
                moveTo(76.0f, 172.0f)
                lineTo(180.0f, 172.0f)
                lineToRelative(11.1f, 32.0f)
                lineTo(64.9f, 204.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
