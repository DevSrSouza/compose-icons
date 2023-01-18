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

public val BoldGroup.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) {
            return _trafficSign!!
        }
        _trafficSign = Builder(name = "TrafficSign", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.5f, 104.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.8f, 0.8f)
                lineToRelative(0.3f, 0.4f)
                lineToRelative(0.4f, 0.5f)
                lineToRelative(0.3f, 0.6f)
                lineToRelative(0.3f, 0.4f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 0.2f, 0.6f)
                lineToRelative(0.3f, 0.5f)
                curveToRelative(0.1f, 0.2f, 0.1f, 0.4f, 0.2f, 0.6f)
                reflectiveCurveToRelative(0.1f, 0.3f, 0.2f, 0.5f)
                reflectiveCurveToRelative(0.1f, 0.4f, 0.1f, 0.6f)
                reflectiveCurveToRelative(0.1f, 0.4f, 0.2f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, 0.1f, 0.6f)
                verticalLineToRelative(0.5f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, 0.0f, 2.4f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.1f, 0.6f)
                curveToRelative(-0.1f, 0.2f, -0.1f, 0.4f, -0.2f, 0.6f)
                reflectiveCurveToRelative(-0.1f, 0.4f, -0.1f, 0.6f)
                reflectiveCurveToRelative(-0.1f, 0.4f, -0.2f, 0.5f)
                reflectiveCurveToRelative(-0.1f, 0.4f, -0.2f, 0.6f)
                lineToRelative(-0.3f, 0.5f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.2f, 0.6f)
                lineToRelative(-0.3f, 0.4f)
                lineToRelative(-0.3f, 0.6f)
                lineToRelative(-0.4f, 0.5f)
                lineToRelative(-0.3f, 0.4f)
                lineToRelative(-0.8f, 0.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(139.0f, 132.0f)
                lineTo(112.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(246.8f, 142.1f)
                lineTo(142.1f, 246.8f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -28.2f, 0.0f)
                lineTo(9.2f, 142.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 0.0f, -28.2f)
                lineTo(113.9f, 9.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 28.2f, 0.0f)
                lineTo(246.8f, 113.9f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 246.8f, 142.1f)
                close()
                moveTo(227.0f, 128.0f)
                lineTo(128.0f, 29.0f)
                lineTo(29.0f, 128.0f)
                lineToRelative(99.0f, 99.0f)
                close()
            }
        }
        .build()
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
