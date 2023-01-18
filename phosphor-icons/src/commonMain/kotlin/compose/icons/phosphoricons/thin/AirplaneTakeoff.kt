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

public val ThinGroup.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) {
            return _airplaneTakeoff!!
        }
        _airplaneTakeoff = Builder(name = "AirplaneTakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(24.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(168.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 216.0f)
                close()
                moveTo(247.9f, 92.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.9f, 2.8f)
                lineToRelative(-151.4f, 88.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, true, -42.7f, -4.9f)
                lineTo(14.2f, 143.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.5f, -19.8f)
                lineToRelative(16.7f, -7.2f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 3.2f, 0.0f)
                lineToRelative(26.1f, 11.2f)
                lineToRelative(21.5f, -12.2f)
                lineToRelative(-26.6f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.3f, -19.9f)
                lineToRelative(16.5f, -7.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.9f, -0.1f)
                lineToRelative(58.2f, 19.4f)
                lineToRelative(42.8f, -25.1f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, true, 46.2f, 8.2f)
                lineToRelative(18.6f, 22.8f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 247.9f, 92.7f)
                close()
                moveTo(237.9f, 90.9f)
                lineTo(222.3f, 71.8f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -35.9f, -6.5f)
                lineTo(142.0f, 91.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.3f, 0.4f)
                lineTo(80.2f, 72.3f)
                lineTo(65.1f, 78.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.4f, 3.1f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 64.0f, 85.4f)
                lineTo(94.7f, 113.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 1.3f, 3.4f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -2.0f, 3.1f)
                lineToRelative(-28.0f, 16.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.6f, 0.2f)
                lineTo(36.0f, 124.4f)
                lineToRelative(-15.2f, 6.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.3f, 2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.2f, 3.7f)
                lineToRelative(37.7f, 35.3f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, 33.2f, 3.8f)
                close()
            }
        }
        .build()
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
