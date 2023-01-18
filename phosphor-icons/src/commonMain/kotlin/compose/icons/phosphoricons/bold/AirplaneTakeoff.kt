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

public val BoldGroup.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) {
            return _airplaneTakeoff!!
        }
        _airplaneTakeoff = Builder(name = "AirplaneTakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(24.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(168.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 216.0f)
                close()
                moveTo(255.8f, 94.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -5.8f, 8.3f)
                lineToRelative(-151.4f, 88.0f)
                arcToRelative(44.3f, 44.3f, 0.0f, false, true, -22.2f, 6.0f)
                arcToRelative(43.7f, 43.7f, 0.0f, false, true, -30.0f, -11.9f)
                lineTo(8.7f, 149.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -6.0f, -18.0f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 11.8f, -15.0f)
                lineTo(31.3f, 109.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 9.4f, 0.0f)
                lineToRelative(22.5f, 9.6f)
                lineToRelative(8.4f, -4.8f)
                lineTo(53.3f, 97.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 58.8f, 64.0f)
                lineToRelative(16.5f, -7.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 8.5f, -0.4f)
                lineToRelative(54.8f, 18.3f)
                lineToRelative(39.7f, -23.3f)
                arcToRelative(43.7f, 43.7f, 0.0f, false, true, 56.3f, 10.0f)
                lineToRelative(18.7f, 22.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 255.8f, 94.1f)
                close()
                moveTo(225.8f, 88.7f)
                lineTo(216.1f, 76.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -25.6f, -4.6f)
                lineTo(146.1f, 98.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.9f, 1.1f)
                lineTo(80.5f, 80.8f)
                lineTo(74.0f, 83.6f)
                lineToRelative(26.0f, 23.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.0f, 19.3f)
                lineToRelative(-28.0f, 16.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.7f, 0.6f)
                lineTo(36.0f, 133.1f)
                lineToRelative(-6.4f, 2.7f)
                lineTo(62.8f, 167.0f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 23.8f, 2.7f)
                close()
            }
        }
        .build()
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
