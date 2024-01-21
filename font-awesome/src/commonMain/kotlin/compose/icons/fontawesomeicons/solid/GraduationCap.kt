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

public val SolidGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 32.0f)
                curveToRelative(-8.1f, 0.0f, -16.1f, 1.4f, -23.7f, 4.1f)
                lineTo(15.8f, 137.4f)
                curveTo(6.3f, 140.9f, 0.0f, 149.9f, 0.0f, 160.0f)
                reflectiveCurveToRelative(6.3f, 19.1f, 15.8f, 22.6f)
                lineToRelative(57.9f, 20.9f)
                curveTo(57.3f, 229.3f, 48.0f, 259.8f, 48.0f, 291.9f)
                verticalLineToRelative(28.1f)
                curveToRelative(0.0f, 28.4f, -10.8f, 57.7f, -22.3f, 80.8f)
                curveToRelative(-6.5f, 13.0f, -13.9f, 25.8f, -22.5f, 37.6f)
                curveTo(0.0f, 442.7f, -0.9f, 448.3f, 0.9f, 453.4f)
                reflectiveCurveToRelative(6.0f, 8.9f, 11.2f, 10.2f)
                lineToRelative(64.0f, 16.0f)
                curveToRelative(4.2f, 1.1f, 8.7f, 0.3f, 12.4f, -2.0f)
                reflectiveCurveToRelative(6.3f, -6.1f, 7.1f, -10.4f)
                curveToRelative(8.6f, -42.8f, 4.3f, -81.2f, -2.1f, -108.7f)
                curveTo(90.3f, 344.3f, 86.0f, 329.8f, 80.0f, 316.5f)
                verticalLineTo(291.9f)
                curveToRelative(0.0f, -30.2f, 10.2f, -58.7f, 27.9f, -81.5f)
                curveToRelative(12.9f, -15.5f, 29.6f, -28.0f, 49.2f, -35.7f)
                lineToRelative(157.0f, -61.7f)
                curveToRelative(8.2f, -3.2f, 17.5f, 0.8f, 20.7f, 9.0f)
                reflectiveCurveToRelative(-0.8f, 17.5f, -9.0f, 20.7f)
                lineToRelative(-157.0f, 61.7f)
                curveToRelative(-12.4f, 4.9f, -23.3f, 12.4f, -32.2f, 21.6f)
                lineToRelative(159.6f, 57.6f)
                curveToRelative(7.6f, 2.7f, 15.6f, 4.1f, 23.7f, 4.1f)
                reflectiveCurveToRelative(16.1f, -1.4f, 23.7f, -4.1f)
                lineTo(624.2f, 182.6f)
                curveToRelative(9.5f, -3.4f, 15.8f, -12.5f, 15.8f, -22.6f)
                reflectiveCurveToRelative(-6.3f, -19.1f, -15.8f, -22.6f)
                lineTo(343.7f, 36.1f)
                curveTo(336.1f, 33.4f, 328.1f, 32.0f, 320.0f, 32.0f)
                close()
                moveTo(128.0f, 408.0f)
                curveToRelative(0.0f, 35.3f, 86.0f, 72.0f, 192.0f, 72.0f)
                reflectiveCurveToRelative(192.0f, -36.7f, 192.0f, -72.0f)
                lineTo(496.7f, 262.6f)
                lineTo(354.5f, 314.0f)
                curveToRelative(-11.1f, 4.0f, -22.8f, 6.0f, -34.5f, 6.0f)
                reflectiveCurveToRelative(-23.5f, -2.0f, -34.5f, -6.0f)
                lineTo(143.3f, 262.6f)
                lineTo(128.0f, 408.0f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
