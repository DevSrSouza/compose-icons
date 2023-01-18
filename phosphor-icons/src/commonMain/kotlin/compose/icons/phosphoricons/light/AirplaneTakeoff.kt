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

public val LightGroup.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) {
            return _airplaneTakeoff!!
        }
        _airplaneTakeoff = Builder(name = "AirplaneTakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(24.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(168.0f, 210.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 216.0f)
                close()
                moveTo(249.9f, 93.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -2.9f, 4.1f)
                lineToRelative(-151.4f, 88.0f)
                arcToRelative(37.8f, 37.8f, 0.0f, false, true, -45.1f, -5.1f)
                lineTo(12.8f, 144.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -4.2f, -12.6f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, true, 8.3f, -10.4f)
                lineToRelative(16.7f, -7.2f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, 4.8f, 0.0f)
                lineToRelative(25.2f, 10.8f)
                lineToRelative(18.2f, -10.4f)
                lineTo(57.3f, 92.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -4.5f, -12.7f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 8.3f, -10.5f)
                lineToRelative(16.5f, -7.1f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 4.3f, -0.2f)
                lineToRelative(57.4f, 19.1f)
                lineToRelative(42.0f, -24.7f)
                arcTo(37.9f, 37.9f, 0.0f, false, true, 230.0f, 65.4f)
                lineToRelative(18.6f, 22.8f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 249.9f, 93.1f)
                close()
                moveTo(234.9f, 90.4f)
                lineTo(220.7f, 73.0f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, false, -33.3f, -5.9f)
                lineTo(143.0f, 93.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.9f, 0.5f)
                lineTo(80.3f, 74.4f)
                lineTo(65.9f, 80.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.6f, 3.3f)
                lineTo(96.0f, 111.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 2.0f, 5.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, 4.6f)
                lineToRelative(-28.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.4f, 0.3f)
                lineTo(36.0f, 126.5f)
                lineToRelative(-14.4f, 6.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.2f, 1.5f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 21.0f, 136.0f)
                lineToRelative(37.7f, 35.3f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, false, 30.9f, 3.5f)
                close()
            }
        }
        .build()
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
