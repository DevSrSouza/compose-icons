package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.HourglassHalf: ImageVector
    get() {
        if (_hourglassHalf != null) {
            return _hourglassHalf!!
        }
        _hourglassHalf = Builder(name = "HourglassHalf", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                curveTo(0.0f, 10.7f, 10.7f, 0.0f, 24.0f, 0.0f)
                horizontalLineTo(360.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(67.0f)
                curveToRelative(0.0f, 40.3f, -16.0f, 79.0f, -44.5f, 107.5f)
                lineTo(225.9f, 256.0f)
                lineToRelative(81.5f, 81.5f)
                curveTo(336.0f, 366.0f, 352.0f, 404.7f, 352.0f, 445.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(445.0f)
                curveToRelative(0.0f, -40.3f, 16.0f, -79.0f, 44.5f, -107.5f)
                lineTo(158.1f, 256.0f)
                lineTo(76.5f, 174.5f)
                curveTo(48.0f, 146.0f, 32.0f, 107.3f, 32.0f, 67.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(24.0f)
                curveTo(10.7f, 48.0f, 0.0f, 37.3f, 0.0f, 24.0f)
                close()
                moveTo(110.5f, 371.5f)
                curveToRelative(-3.9f, 3.9f, -7.5f, 8.1f, -10.7f, 12.5f)
                horizontalLineTo(284.2f)
                curveToRelative(-3.2f, -4.4f, -6.8f, -8.6f, -10.7f, -12.5f)
                lineTo(192.0f, 289.9f)
                lineToRelative(-81.5f, 81.5f)
                close()
                moveTo(284.2f, 128.0f)
                curveTo(297.0f, 110.4f, 304.0f, 89.0f, 304.0f, 67.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(67.0f)
                curveToRelative(0.0f, 22.1f, 7.0f, 43.4f, 19.8f, 61.0f)
                horizontalLineTo(284.2f)
                close()
            }
        }
        .build()
        return _hourglassHalf!!
    }

private var _hourglassHalf: ImageVector? = null
