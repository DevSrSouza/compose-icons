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

public val SolidGroup.BellSlash: ImageVector
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
                lineToRelative(-90.2f, -70.7f)
                curveToRelative(0.2f, -0.4f, 0.4f, -0.9f, 0.6f, -1.3f)
                curveToRelative(5.2f, -11.5f, 3.1f, -25.0f, -5.3f, -34.4f)
                lineToRelative(-7.4f, -8.3f)
                curveTo(497.3f, 319.2f, 480.0f, 273.9f, 480.0f, 226.8f)
                lineTo(480.0f, 208.0f)
                curveToRelative(0.0f, -77.4f, -55.0f, -142.0f, -128.0f, -156.8f)
                lineTo(352.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(288.0f, 51.2f)
                curveToRelative(-42.6f, 8.6f, -79.0f, 34.2f, -102.0f, 69.3f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(406.2f, 416.0f)
                lineTo(160.0f, 222.1f)
                verticalLineToRelative(4.8f)
                curveToRelative(0.0f, 47.0f, -17.3f, 92.4f, -48.5f, 127.6f)
                lineToRelative(-7.4f, 8.3f)
                curveToRelative(-8.4f, 9.4f, -10.4f, 22.9f, -5.3f, 34.4f)
                reflectiveCurveTo(115.4f, 416.0f, 128.0f, 416.0f)
                lineTo(406.2f, 416.0f)
                close()
                moveTo(365.3f, 493.3f)
                curveToRelative(12.0f, -12.0f, 18.7f, -28.3f, 18.7f, -45.3f)
                lineTo(320.0f, 448.0f)
                lineTo(256.0f, 448.0f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                reflectiveCurveToRelative(28.3f, 18.7f, 45.3f, 18.7f)
                reflectiveCurveToRelative(33.3f, -6.7f, 45.3f, -18.7f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
