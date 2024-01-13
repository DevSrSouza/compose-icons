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

public val SolidGroup.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 0.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, true, 224.0f, 0.0f)
                close()
                moveTo(178.3f, 304.0f)
                horizontalLineToRelative(91.4f)
                curveToRelative(11.8f, 0.0f, 23.4f, 1.2f, 34.5f, 3.3f)
                curveToRelative(-2.1f, 18.5f, 7.4f, 35.6f, 21.8f, 44.8f)
                curveToRelative(-16.6f, 10.6f, -26.7f, 31.6f, -20.0f, 53.3f)
                curveToRelative(4.0f, 12.9f, 9.4f, 25.5f, 16.4f, 37.6f)
                reflectiveCurveToRelative(15.2f, 23.1f, 24.4f, 33.0f)
                curveToRelative(15.7f, 16.9f, 39.6f, 18.4f, 57.2f, 8.7f)
                verticalLineToRelative(0.9f)
                curveToRelative(0.0f, 9.2f, 2.7f, 18.5f, 7.9f, 26.3f)
                lineTo(29.7f, 511.9f)
                curveTo(13.3f, 512.0f, 0.0f, 498.7f, 0.0f, 482.3f)
                curveTo(0.0f, 383.8f, 79.8f, 304.0f, 178.3f, 304.0f)
                close()
                moveTo(436.0f, 218.2f)
                curveToRelative(0.0f, -7.0f, 4.5f, -13.3f, 11.3f, -14.8f)
                curveToRelative(10.5f, -2.4f, 21.5f, -3.7f, 32.7f, -3.7f)
                reflectiveCurveToRelative(22.2f, 1.3f, 32.7f, 3.7f)
                curveToRelative(6.8f, 1.5f, 11.3f, 7.8f, 11.3f, 14.8f)
                verticalLineToRelative(17.7f)
                curveToRelative(0.0f, 7.8f, 4.8f, 14.8f, 11.6f, 18.7f)
                curveToRelative(6.8f, 3.9f, 15.1f, 4.5f, 21.8f, 0.6f)
                lineToRelative(13.8f, -7.9f)
                curveToRelative(6.1f, -3.5f, 13.7f, -2.7f, 18.5f, 2.4f)
                curveToRelative(7.6f, 8.1f, 14.3f, 17.2f, 20.1f, 27.2f)
                reflectiveCurveToRelative(10.3f, 20.4f, 13.5f, 31.0f)
                curveToRelative(2.1f, 6.7f, -1.1f, 13.7f, -7.2f, 17.2f)
                lineToRelative(-14.4f, 8.3f)
                curveToRelative(-6.5f, 3.7f, -10.0f, 10.9f, -10.0f, 18.4f)
                reflectiveCurveToRelative(3.5f, 14.7f, 10.0f, 18.4f)
                lineToRelative(14.4f, 8.3f)
                curveToRelative(6.1f, 3.5f, 9.2f, 10.5f, 7.2f, 17.2f)
                curveToRelative(-3.3f, 10.6f, -7.8f, 21.0f, -13.5f, 31.0f)
                reflectiveCurveToRelative(-12.5f, 19.1f, -20.1f, 27.2f)
                curveToRelative(-4.8f, 5.1f, -12.5f, 5.9f, -18.5f, 2.4f)
                lineToRelative(-13.8f, -7.9f)
                curveToRelative(-6.7f, -3.9f, -15.1f, -3.3f, -21.8f, 0.6f)
                curveToRelative(-6.8f, 3.9f, -11.6f, 10.9f, -11.6f, 18.7f)
                verticalLineToRelative(17.7f)
                curveToRelative(0.0f, 7.0f, -4.5f, 13.3f, -11.3f, 14.8f)
                curveToRelative(-10.5f, 2.4f, -21.5f, 3.7f, -32.7f, 3.7f)
                reflectiveCurveToRelative(-22.2f, -1.3f, -32.7f, -3.7f)
                curveToRelative(-6.8f, -1.5f, -11.3f, -7.8f, -11.3f, -14.8f)
                lineTo(436.0f, 467.8f)
                curveToRelative(0.0f, -7.9f, -4.9f, -14.9f, -11.7f, -18.9f)
                curveToRelative(-6.8f, -3.9f, -15.2f, -4.5f, -22.0f, -0.6f)
                lineToRelative(-13.5f, 7.8f)
                curveToRelative(-6.1f, 3.5f, -13.7f, 2.7f, -18.5f, -2.4f)
                curveToRelative(-7.6f, -8.1f, -14.3f, -17.2f, -20.1f, -27.2f)
                reflectiveCurveToRelative(-10.3f, -20.4f, -13.5f, -31.0f)
                curveToRelative(-2.1f, -6.7f, 1.1f, -13.7f, 7.2f, -17.2f)
                lineToRelative(14.0f, -8.1f)
                curveToRelative(6.5f, -3.8f, 10.1f, -11.1f, 10.1f, -18.6f)
                reflectiveCurveToRelative(-3.5f, -14.8f, -10.1f, -18.6f)
                lineToRelative(-14.0f, -8.1f)
                curveToRelative(-6.1f, -3.5f, -9.2f, -10.5f, -7.2f, -17.2f)
                curveToRelative(3.3f, -10.6f, 7.7f, -21.0f, 13.5f, -31.0f)
                reflectiveCurveToRelative(12.5f, -19.1f, 20.1f, -27.2f)
                curveToRelative(4.8f, -5.1f, 12.4f, -5.9f, 18.5f, -2.4f)
                lineToRelative(13.6f, 7.8f)
                curveToRelative(6.8f, 3.9f, 15.2f, 3.3f, 22.0f, -0.6f)
                curveToRelative(6.9f, -3.9f, 11.7f, -11.0f, 11.7f, -18.9f)
                lineTo(436.1f, 218.2f)
                close()
                moveTo(528.1f, 351.7f)
                arcToRelative(48.1f, 48.1f, 0.0f, true, false, -96.1f, 0.0f)
                arcToRelative(48.1f, 48.1f, 0.0f, true, false, 96.1f, 0.0f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
