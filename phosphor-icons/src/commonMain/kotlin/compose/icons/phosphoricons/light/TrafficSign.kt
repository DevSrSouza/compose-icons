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

public val LightGroup.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) {
            return _trafficSign!!
        }
        _trafficSign = Builder(name = "TrafficSign", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.6f, 118.1f)
                lineTo(137.9f, 13.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(13.4f, 118.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 0.0f, 19.8f)
                lineTo(118.1f, 242.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineTo(242.6f, 137.9f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 242.6f, 118.1f)
                close()
                moveTo(234.1f, 129.4f)
                lineTo(129.4f, 234.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.8f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(21.9f, 129.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -2.8f)
                lineTo(126.6f, 21.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineTo(234.1f, 126.6f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 234.1f, 129.4f)
                close()
                moveTo(173.0f, 123.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.8f, 0.9f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(153.5f, 126.0f)
                lineTo(112.0f, 126.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, -18.0f, 18.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, 30.0f, -30.0f)
                horizontalLineToRelative(41.5f)
                lineToRelative(-13.7f, -13.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 0.8f, 0.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, 0.5f, 1.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.3f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 2.2f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.3f, 1.0f)
                horizontalLineToRelative(-0.1f)
                arcTo(9.3f, 9.3f, 0.0f, false, true, 173.0f, 123.3f)
                close()
            }
        }
        .build()
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
