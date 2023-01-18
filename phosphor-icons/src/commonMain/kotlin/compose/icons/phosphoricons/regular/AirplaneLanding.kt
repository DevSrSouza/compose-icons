package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(240.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 216.0f)
                close()
                moveTo(221.8f, 191.7f)
                lineTo(45.2f, 142.2f)
                arcTo(40.1f, 40.1f, 0.0f, false, true, 16.0f, 103.7f)
                lineTo(16.0f, 51.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 37.1f, 35.9f)
                lineToRelative(13.4f, 4.5f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 4.6f, 3.8f)
                lineTo(69.5f, 71.3f)
                lineTo(88.0f, 77.1f)
                verticalLineToRelative(-26.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.1f, -15.2f)
                lineToRelative(13.4f, 4.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 4.4f, 3.6f)
                lineToRelative(30.4f, 53.2f)
                lineToRelative(45.4f, 12.6f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 232.0f, 148.3f)
                lineTo(232.0f, 184.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -3.2f, 6.4f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 224.0f, 192.0f)
                close()
                moveTo(216.0f, 148.3f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -17.6f, -23.1f)
                lineToRelative(-48.5f, -13.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.8f, -3.7f)
                lineTo(114.6f, 54.6f)
                lineTo(104.0f, 51.1f)
                lineTo(104.0f, 88.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.3f, 6.4f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -7.1f, 1.2f)
                lineToRelative(-32.0f, -10.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.7f, -3.8f)
                lineTo(42.4f, 54.6f)
                lineTo(32.0f, 51.1f)
                verticalLineToRelative(52.6f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 17.5f, 23.1f)
                lineTo(216.0f, 173.5f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
