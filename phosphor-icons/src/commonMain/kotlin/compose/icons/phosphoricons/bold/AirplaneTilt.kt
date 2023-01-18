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

public val BoldGroup.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) {
            return _airplaneTilt!!
        }
        _airplaneTilt = Builder(name = "AirplaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 115.3f)
                lineToRelative(27.9f, -26.1f)
                lineToRelative(1.7f, -2.1f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -53.1f, -48.6f)
                lineTo(165.3f, 40.0f)
                lineTo(140.7f, 66.0f)
                lineTo(60.1f, 36.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.6f, 2.8f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 25.3f, 82.0f)
                lineToRelative(59.9f, 39.9f)
                lineTo(75.0f, 132.0f)
                lineTo(56.0f, 132.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -8.5f, 3.5f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.7f, 19.9f)
                lineToRelative(36.1f, 12.2f)
                lineToRelative(12.3f, 36.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.7f, 7.8f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 2.7f, 0.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(24.0f, -24.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 124.0f, 200.0f)
                lineTo(124.0f, 181.3f)
                lineToRelative(10.1f, -9.1f)
                lineToRelative(40.0f, 58.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 18.4f, 1.7f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.8f, -12.6f)
                close()
                moveTo(185.7f, 205.3f)
                lineTo(146.1f, 147.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -8.5f, -5.2f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.1f, 3.1f)
                lineToRelative(-24.2f, 22.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 176.0f)
                verticalLineToRelative(19.0f)
                lineToRelative(-6.8f, 6.9f)
                lineToRelative(-8.0f, -23.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -7.5f, -7.5f)
                lineToRelative(-23.6f, -8.0f)
                lineTo(61.0f, 156.0f)
                lineTo(80.0f, 156.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -1.8f, -18.5f)
                lineTo(50.8f, 70.1f)
                lineToRelative(8.3f, -8.2f)
                lineToRelative(80.8f, 29.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.8f, -3.1f)
                lineToRelative(31.7f, -33.5f)
                curveToRelative(0.1f, 0.0f, 0.1f, 0.0f, 0.1f, -0.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 16.0f, 0.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.5f, 0.5f)
                lineToRelative(-32.2f, 30.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.1f, 12.8f)
                lineToRelative(29.4f, 80.8f)
                close()
            }
        }
        .build()
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
