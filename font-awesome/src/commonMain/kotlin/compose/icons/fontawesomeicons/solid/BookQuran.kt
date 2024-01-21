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

public val SolidGroup.BookQuran: ImageVector
    get() {
        if (_bookQuran != null) {
            return _bookQuran!!
        }
        _bookQuran = Builder(name = "BookQuran", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineTo(448.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(64.0f, 512.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                lineTo(352.0f, 0.0f)
                close()
                moveTo(352.0f, 384.0f)
                lineTo(96.0f, 384.0f)
                verticalLineToRelative(64.0f)
                lineTo(352.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(274.1f, 150.2f)
                lineToRelative(-8.9f, 21.4f)
                lineToRelative(-23.1f, 1.9f)
                curveToRelative(-5.7f, 0.5f, -8.0f, 7.5f, -3.7f, 11.2f)
                lineTo(256.0f, 199.8f)
                lineToRelative(-5.4f, 22.6f)
                curveToRelative(-1.3f, 5.5f, 4.7f, 9.9f, 9.6f, 6.9f)
                lineTo(280.0f, 217.2f)
                lineToRelative(19.8f, 12.1f)
                curveToRelative(4.9f, 3.0f, 10.9f, -1.4f, 9.6f, -6.9f)
                lineTo(304.0f, 199.8f)
                lineToRelative(17.6f, -15.1f)
                curveToRelative(4.3f, -3.7f, 2.0f, -10.8f, -3.7f, -11.2f)
                lineToRelative(-23.1f, -1.9f)
                lineToRelative(-8.9f, -21.4f)
                curveToRelative(-2.2f, -5.3f, -9.6f, -5.3f, -11.8f, 0.0f)
                close()
                moveTo(96.0f, 192.0f)
                curveToRelative(0.0f, 70.7f, 57.3f, 128.0f, 128.0f, 128.0f)
                curveToRelative(25.6f, 0.0f, 49.5f, -7.5f, 69.5f, -20.5f)
                curveToRelative(3.2f, -2.1f, 4.5f, -6.2f, 3.1f, -9.7f)
                reflectiveCurveToRelative(-5.2f, -5.6f, -9.0f, -4.8f)
                curveToRelative(-6.1f, 1.2f, -12.5f, 1.9f, -19.0f, 1.9f)
                curveToRelative(-52.4f, 0.0f, -94.9f, -42.5f, -94.9f, -94.9f)
                reflectiveCurveToRelative(42.5f, -94.9f, 94.9f, -94.9f)
                curveToRelative(6.5f, 0.0f, 12.8f, 0.7f, 19.0f, 1.9f)
                curveToRelative(3.8f, 0.8f, 7.5f, -1.3f, 9.0f, -4.8f)
                reflectiveCurveToRelative(0.2f, -7.6f, -3.1f, -9.7f)
                curveTo(273.5f, 71.5f, 249.6f, 64.0f, 224.0f, 64.0f)
                curveTo(153.3f, 64.0f, 96.0f, 121.3f, 96.0f, 192.0f)
                close()
            }
        }
        .build()
        return _bookQuran!!
    }

private var _bookQuran: ImageVector? = null
