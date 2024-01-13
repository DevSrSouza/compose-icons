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

public val RegularGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(542.6f, 400.0f)
                curveToRelative(2.7f, -7.8f, 1.3f, -16.5f, -3.9f, -23.0f)
                lineToRelative(-14.9f, -18.6f)
                curveTo(495.5f, 322.9f, 480.0f, 278.8f, 480.0f, 233.4f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -77.4f, -55.0f, -142.0f, -128.0f, -156.8f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(51.2f)
                curveToRelative(-42.6f, 8.6f, -79.0f, 34.2f, -102.0f, 69.3f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(224.0f, 150.3f)
                curveTo(243.6f, 117.7f, 279.3f, 96.0f, 320.0f, 96.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, 50.1f, 112.0f, 112.0f)
                verticalLineToRelative(25.4f)
                curveToRelative(0.0f, 32.7f, 6.4f, 64.8f, 18.7f, 94.5f)
                lineTo(224.0f, 150.3f)
                close()
                moveTo(406.2f, 416.0f)
                lineToRelative(-60.9f, -48.0f)
                horizontalLineTo(168.3f)
                curveToRelative(21.2f, -32.8f, 34.4f, -70.3f, 38.4f, -109.1f)
                lineTo(160.0f, 222.1f)
                verticalLineToRelative(11.4f)
                curveToRelative(0.0f, 45.4f, -15.5f, 89.5f, -43.8f, 124.9f)
                lineTo(101.3f, 377.0f)
                curveToRelative(-5.8f, 7.2f, -6.9f, 17.1f, -2.9f, 25.4f)
                reflectiveCurveToRelative(12.4f, 13.6f, 21.6f, 13.6f)
                horizontalLineTo(406.2f)
                close()
                moveTo(384.0f, 448.0f)
                horizontalLineTo(320.0f)
                horizontalLineTo(256.0f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                reflectiveCurveToRelative(28.3f, 18.7f, 45.3f, 18.7f)
                reflectiveCurveToRelative(33.3f, -6.7f, 45.3f, -18.7f)
                reflectiveCurveToRelative(18.7f, -28.3f, 18.7f, -45.3f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
