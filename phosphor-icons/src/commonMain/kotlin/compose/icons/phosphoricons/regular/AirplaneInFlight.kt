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

public val RegularGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(72.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
                moveTo(248.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(63.8f, 168.0f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, -38.3f, -28.5f)
                lineTo(11.4f, 92.6f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, 2.5f, -14.2f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 26.8f, 72.0f)
                lineTo(44.0f, 72.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 6.1f, 2.9f)
                lineTo(67.7f, 96.0f)
                lineTo(84.9f, 96.0f)
                lineToRelative(-9.0f, -26.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 91.1f, 48.0f)
                lineTo(108.0f, 48.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 5.9f, 2.6f)
                lineTo(155.5f, 96.0f)
                lineTo(208.0f, 96.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 136.0f)
                close()
                moveTo(232.0f, 136.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(152.0f, 112.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.9f, -2.6f)
                lineTo(104.5f, 64.0f)
                lineTo(91.1f, 64.0f)
                lineToRelative(12.5f, 37.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.1f, 7.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 96.0f, 112.0f)
                lineTo(64.0f, 112.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.1f, -2.9f)
                lineTo(40.3f, 88.0f)
                lineTo(26.7f, 88.0f)
                lineToRelative(14.1f, 46.9f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 23.0f, 17.1f)
                lineTo(232.0f, 152.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
