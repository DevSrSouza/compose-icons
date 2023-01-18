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

public val BoldGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(72.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 216.0f)
                close()
                moveTo(252.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(63.8f, 172.0f)
                arcToRelative(43.6f, 43.6f, 0.0f, false, true, -42.1f, -31.4f)
                lineTo(7.6f, 93.7f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 26.8f, 68.0f)
                lineTo(44.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.2f, 4.3f)
                lineTo(69.6f, 92.0f)
                horizontalLineToRelative(9.8f)
                lineTo(72.1f, 70.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 91.1f, 44.0f)
                lineTo(108.0f, 44.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 8.8f, 3.9f)
                lineTo(157.3f, 92.0f)
                lineTo(208.0f, 92.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 252.0f, 136.0f)
                close()
                moveTo(228.0f, 136.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(152.0f, 116.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -8.8f, -3.9f)
                lineTo(102.7f, 68.0f)
                lineTo(96.6f, 68.0f)
                lineToRelative(10.8f, 32.2f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 96.0f, 116.0f)
                lineTo(64.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.2f, -4.3f)
                lineTo(38.4f, 92.0f)
                lineTo(32.1f, 92.0f)
                lineToRelative(12.6f, 41.7f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 63.8f, 148.0f)
                lineTo(228.0f, 148.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
