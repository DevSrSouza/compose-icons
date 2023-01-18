package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) {
            return _airplaneTakeoff!!
        }
        _airplaneTakeoff = Builder(name = "AirplaneTakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9f, 140.4f)
                lineToRelative(37.7f, 35.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 38.0f, 4.3f)
                lineTo(244.0f, 92.0f)
                lineTo(225.4f, 69.2f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -41.0f, -7.3f)
                lineTo(140.0f, 88.0f)
                lineTo(80.0f, 68.0f)
                lineTo(63.5f, 75.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.2f, 13.3f)
                lineTo(92.0f, 116.0f)
                lineTo(64.0f, 132.0f)
                lineTo(36.0f, 120.0f)
                lineToRelative(-16.8f, 7.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.9f, 140.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(24.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(168.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 216.0f)
                close()
                moveTo(251.9f, 93.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -3.9f, 5.5f)
                lineToRelative(-151.4f, 88.0f)
                arcToRelative(39.6f, 39.6f, 0.0f, false, true, -47.4f, -5.4f)
                lineTo(11.5f, 146.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -4.9f, -14.4f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 9.5f, -12.0f)
                lineToRelative(16.7f, -7.2f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, 6.4f, 0.0f)
                lineToRelative(24.3f, 10.5f)
                lineToRelative(14.9f, -8.6f)
                lineTo(55.9f, 94.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 4.4f, -26.6f)
                lineToRelative(16.5f, -7.1f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, 5.7f, -0.2f)
                lineToRelative(56.6f, 18.9f)
                lineTo(180.3f, 55.0f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, 51.3f, 9.2f)
                lineToRelative(18.6f, 22.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 251.9f, 93.4f)
                close()
                moveTo(231.9f, 89.8f)
                lineTo(219.2f, 74.3f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -30.8f, -5.5f)
                lineTo(144.1f, 94.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.6f, 0.7f)
                lineToRelative(-57.1f, -19.0f)
                lineTo(66.7f, 82.4f)
                lineToRelative(30.7f, 27.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 2.6f, 6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, 6.0f)
                lineToRelative(-28.0f, 16.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -7.2f, 0.5f)
                lineTo(36.0f, 128.7f)
                lineToRelative(-13.6f, 5.8f)
                lineToRelative(37.7f, 35.4f)
                arcToRelative(23.8f, 23.8f, 0.0f, false, false, 28.5f, 3.2f)
                close()
            }
        }
        .build()
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
