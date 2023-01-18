package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) {
            return _clockClockwise!!
        }
        _clockClockwise = Builder(name = "ClockClockwise", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 128.1f)
                horizontalLineToRelative(0.0f)
                lineTo(124.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(45.7f)
                lineToRelative(39.6f, 22.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 173.0f, 154.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.4f, 2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -2.0f, -0.5f)
                lineToRelative(-41.6f, -24.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-0.3f, -0.3f)
                lineToRelative(-0.3f, -0.3f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.2f, -0.3f)
                reflectiveCurveToRelative(-0.1f, -0.2f, -0.1f, -0.3f)
                lineToRelative(-0.2f, -0.4f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.3f, -0.1f, -0.4f)
                verticalLineToRelative(-0.3f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 124.0f, 128.1f)
                close()
                moveTo(227.7f, 101.6f)
                lineTo(227.9f, 101.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.1f, -0.4f)
                verticalLineToRelative(-0.3f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.5f, 0.1f, -0.8f)
                verticalLineToRelative(-40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                lineTo(220.1f, 90.1f)
                lineTo(193.1f, 62.9f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, 0.0f, 130.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, -5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 0.0f, -118.8f)
                lineToRelative(27.1f, 27.1f)
                lineTo(184.2f, 95.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(41.5f)
                lineToRelative(0.4f, -0.2f)
                lineToRelative(0.3f, -0.2f)
                lineToRelative(0.6f, -0.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.5f, -0.6f)
                close()
            }
        }
        .build()
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
