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

public val SolidGroup.PersonDressBurst: ImageVector
    get() {
        if (_personDressBurst != null) {
            return _personDressBurst!!
        }
        _personDressBurst = Builder(name = "PersonDressBurst", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(390.2f, 384.0f)
                horizontalLineTo(408.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(17.8f)
                curveToRelative(10.9f, 0.0f, 18.6f, -10.7f, 15.2f, -21.1f)
                lineTo(546.7f, 248.1f)
                lineToRelative(33.9f, 56.3f)
                curveToRelative(9.1f, 15.1f, 28.8f, 20.0f, 43.9f, 10.9f)
                reflectiveCurveToRelative(20.0f, -28.8f, 10.9f, -43.9f)
                lineToRelative(-53.6f, -89.2f)
                curveToRelative(-20.2f, -33.7f, -56.7f, -54.3f, -96.0f, -54.3f)
                horizontalLineTo(474.2f)
                curveToRelative(-39.3f, 0.0f, -75.7f, 20.6f, -96.0f, 54.3f)
                lineToRelative(-53.6f, 89.2f)
                curveToRelative(-9.1f, 15.1f, -4.2f, 34.8f, 10.9f, 43.9f)
                reflectiveCurveToRelative(34.8f, 4.2f, 43.9f, -10.9f)
                lineToRelative(33.9f, -56.3f)
                lineTo(375.0f, 362.9f)
                curveToRelative(-3.5f, 10.4f, 4.3f, 21.1f, 15.2f, 21.1f)
                close()
                moveTo(190.9f, 18.1f)
                curveTo(188.4f, 12.0f, 182.6f, 8.0f, 176.0f, 8.0f)
                reflectiveCurveToRelative(-12.4f, 4.0f, -14.9f, 10.1f)
                lineToRelative(-29.4f, 74.0f)
                lineTo(55.6f, 68.9f)
                curveToRelative(-6.3f, -1.9f, -13.1f, 0.2f, -17.2f, 5.3f)
                reflectiveCurveToRelative(-4.6f, 12.2f, -1.4f, 17.9f)
                lineToRelative(39.5f, 69.1f)
                lineTo(10.9f, 206.4f)
                curveToRelative(-5.4f, 3.7f, -8.0f, 10.3f, -6.5f, 16.7f)
                reflectiveCurveToRelative(6.7f, 11.2f, 13.1f, 12.2f)
                lineToRelative(78.7f, 12.2f)
                lineTo(90.6f, 327.0f)
                curveToRelative(-0.5f, 6.5f, 3.1f, 12.7f, 9.0f, 15.5f)
                reflectiveCurveToRelative(12.9f, 1.8f, 17.8f, -2.6f)
                lineTo(176.0f, 286.1f)
                lineToRelative(58.6f, 53.9f)
                curveToRelative(4.8f, 4.4f, 11.9f, 5.5f, 17.8f, 2.6f)
                reflectiveCurveToRelative(9.5f, -9.0f, 9.0f, -15.5f)
                lineToRelative(-5.6f, -79.4f)
                lineToRelative(50.5f, -7.8f)
                lineToRelative(24.4f, -40.5f)
                lineToRelative(-55.2f, -38.0f)
                lineTo(315.0f, 92.2f)
                curveToRelative(3.3f, -5.7f, 2.7f, -12.8f, -1.4f, -17.9f)
                reflectiveCurveToRelative(-10.9f, -7.2f, -17.2f, -5.3f)
                lineTo(220.3f, 92.1f)
                lineToRelative(-29.4f, -74.0f)
                close()
            }
        }
        .build()
        return _personDressBurst!!
    }

private var _personDressBurst: ImageVector? = null
