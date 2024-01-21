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

public val SolidGroup.PersonBurst: ImageVector
    get() {
        if (_personBurst != null) {
            return _personBurst!!
        }
        _personBurst = Builder(name = "PersonBurst", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(472.0f, 480.0f)
                lineTo(472.0f, 352.0f)
                horizontalLineToRelative(16.0f)
                lineTo(488.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(552.0f, 256.9f)
                lineToRelative(28.6f, 47.5f)
                curveToRelative(9.1f, 15.1f, 28.8f, 20.0f, 43.9f, 10.9f)
                reflectiveCurveToRelative(20.0f, -28.8f, 10.9f, -43.9f)
                lineToRelative(-58.3f, -97.0f)
                curveToRelative(-17.4f, -28.9f, -48.6f, -46.6f, -82.3f, -46.6f)
                lineTo(465.1f, 127.8f)
                curveToRelative(-33.7f, 0.0f, -64.9f, 17.7f, -82.3f, 46.6f)
                lineToRelative(-58.3f, 97.0f)
                curveToRelative(-9.1f, 15.1f, -4.2f, 34.8f, 10.9f, 43.9f)
                reflectiveCurveToRelative(34.8f, 4.2f, 43.9f, -10.9f)
                lineTo(408.0f, 256.9f)
                lineTo(408.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
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
                lineToRelative(24.3f, -40.5f)
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
        return _personBurst!!
    }

private var _personBurst: ImageVector? = null
