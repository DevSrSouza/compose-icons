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

public val LightGroup.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) {
            return _clockCounterClockwise!!
        }
        _clockCounterClockwise = Builder(name = "ClockCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 80.0f)
                verticalLineToRelative(44.5f)
                lineToRelative(38.6f, 22.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 10.4f)
                lineToRelative(-41.6f, -24.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.3f, -0.2f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.2f, -0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.2f, -0.3f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-0.2f, -0.2f)
                verticalLineToRelative(-0.2f)
                lineToRelative(-0.2f, -0.3f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.3f)
                reflectiveCurveToRelative(-0.1f, -0.1f, -0.1f, -0.2f)
                lineToRelative(-0.2f, -0.3f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, -0.1f, -0.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.1f, -0.4f)
                verticalLineToRelative(-0.2f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, -0.3f)
                verticalLineToRelative(-0.3f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, -0.3f)
                lineTo(122.1f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(194.5f, 61.5f)
                arcToRelative(94.3f, 94.3f, 0.0f, false, false, -133.0f, 0.0f)
                lineTo(37.8f, 85.2f)
                lineTo(37.8f, 59.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 0.4f, 0.1f, 0.8f, 0.1f, 1.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.4f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, 0.5f, 1.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.8f, 1.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.9f, 0.7f)
                horizontalLineToRelative(0.1f)
                lineToRelative(1.0f, 0.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.1f, 0.3f)
                lineTo(71.8f, 105.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(46.3f, 93.3f)
                lineTo(70.0f, 70.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, true, 0.0f, 116.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.5f, 0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, false, 133.0f, -133.0f)
                close()
            }
        }
        .build()
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
