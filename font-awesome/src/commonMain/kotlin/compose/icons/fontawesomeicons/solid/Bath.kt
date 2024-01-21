package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(name = "Bath", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 77.3f)
                curveToRelative(0.0f, -7.3f, 5.9f, -13.3f, 13.3f, -13.3f)
                curveToRelative(3.5f, 0.0f, 6.9f, 1.4f, 9.4f, 3.9f)
                lineToRelative(14.9f, 14.9f)
                curveTo(130.0f, 91.8f, 128.0f, 101.7f, 128.0f, 112.0f)
                curveToRelative(0.0f, 19.9f, 7.2f, 38.0f, 19.2f, 52.0f)
                curveToRelative(-5.3f, 9.2f, -4.0f, 21.1f, 3.8f, 29.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineTo(289.0f, 89.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                curveToRelative(-7.9f, -7.9f, -19.8f, -9.1f, -29.0f, -3.8f)
                curveTo(246.0f, 39.2f, 227.9f, 32.0f, 208.0f, 32.0f)
                curveToRelative(-10.3f, 0.0f, -20.2f, 2.0f, -29.2f, 5.5f)
                lineTo(163.9f, 22.6f)
                curveTo(149.4f, 8.1f, 129.7f, 0.0f, 109.3f, 0.0f)
                curveTo(66.6f, 0.0f, 32.0f, 34.6f, 32.0f, 77.3f)
                verticalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(77.3f)
                close()
                moveTo(32.0f, 352.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 28.4f, 12.4f, 54.0f, 32.0f, 71.6f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(384.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(439.6f)
                curveToRelative(19.6f, -17.6f, 32.0f, -43.1f, 32.0f, -71.6f)
                verticalLineTo(352.0f)
                horizontalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
