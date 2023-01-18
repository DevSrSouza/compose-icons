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

public val RegularGroup.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) {
            return _clockClockwise!!
        }
        _clockClockwise = Builder(name = "ClockClockwise", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 80.0f)
                verticalLineToRelative(43.4f)
                lineToRelative(37.6f, 21.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, 14.9f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, -4.0f, -1.1f)
                lineToRelative(-41.6f, -24.0f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.3f, -0.3f)
                lineToRelative(-0.2f, -0.2f)
                curveToRelative(-0.2f, -0.1f, -0.3f, -0.3f, -0.4f, -0.4f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-0.2f, -0.4f)
                lineToRelative(-0.2f, -0.3f)
                lineToRelative(-0.2f, -0.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.2f, -0.4f)
                lineToRelative(-0.2f, -0.3f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, -0.3f)
                lineToRelative(-0.2f, -0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, -0.3f)
                curveToRelative(0.0f, -0.2f, 0.0f, -0.3f, -0.1f, -0.4f)
                verticalLineToRelative(-0.4f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.3f, -0.1f, -0.4f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(230.8f, 104.2f)
                curveToRelative(0.1f, -0.2f, 0.2f, -0.3f, 0.2f, -0.4f)
                lineToRelative(0.2f, -0.3f)
                curveToRelative(0.1f, -0.1f, 0.1f, -0.3f, 0.2f, -0.4f)
                lineToRelative(0.2f, -0.3f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.1f, -0.4f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.1f, -0.3f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.3f, 0.1f, -0.4f)
                reflectiveCurveToRelative(0.1f, -0.3f, 0.1f, -0.4f)
                verticalLineToRelative(-0.4f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.1f, -0.8f)
                verticalLineToRelative(-40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -16.0f, 0.0f)
                lineTo(216.2f, 80.4f)
                lineTo(195.9f, 60.1f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, 135.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.3f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -113.2f)
                lineToRelative(20.3f, 20.3f)
                lineTo(184.2f, 91.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(42.3f)
                lineToRelative(0.4f, -0.2f)
                horizontalLineToRelative(0.3f)
                lineToRelative(0.4f, -0.2f)
                horizontalLineToRelative(0.3f)
                lineToRelative(0.4f, -0.2f)
                lineToRelative(0.3f, -0.2f)
                lineToRelative(0.4f, -0.3f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(1.2f, -1.1f)
                lineToRelative(0.2f, -0.3f)
                close()
            }
        }
        .build()
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
