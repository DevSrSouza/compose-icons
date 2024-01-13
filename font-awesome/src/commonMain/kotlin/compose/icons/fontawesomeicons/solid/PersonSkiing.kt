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

public val SolidGroup.PersonSkiing: ImageVector
    get() {
        if (_personSkiing != null) {
            return _personSkiing!!
        }
        _personSkiing = Builder(name = "PersonSkiing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.7f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(2.7f, 268.9f)
                curveToRelative(6.1f, -11.8f, 20.6f, -16.3f, 32.4f, -10.2f)
                lineTo(232.7f, 361.3f)
                lineToRelative(46.2f, -69.2f)
                lineToRelative(-75.1f, -75.1f)
                curveToRelative(-14.6f, -14.6f, -20.4f, -33.9f, -18.4f, -52.1f)
                lineToRelative(108.8f, 52.0f)
                lineToRelative(39.3f, 39.3f)
                curveToRelative(16.2f, 16.2f, 18.7f, 41.5f, 6.0f, 60.6f)
                lineTo(289.8f, 391.0f)
                lineToRelative(128.7f, 66.8f)
                curveToRelative(13.6f, 7.1f, 29.8f, 7.2f, 43.6f, 0.3f)
                lineToRelative(15.2f, -7.6f)
                curveToRelative(11.9f, -5.9f, 26.3f, -1.1f, 32.2f, 10.7f)
                reflectiveCurveToRelative(1.1f, 26.3f, -10.7f, 32.2f)
                lineToRelative(-15.2f, 7.6f)
                curveToRelative(-27.5f, 13.7f, -59.9f, 13.5f, -87.2f, -0.7f)
                lineTo(12.9f, 301.3f)
                curveTo(1.2f, 295.2f, -3.4f, 280.7f, 2.7f, 268.9f)
                close()
                moveTo(118.9f, 65.6f)
                lineTo(137.0f, 74.2f)
                lineToRelative(8.7f, -17.4f)
                curveToRelative(4.0f, -7.9f, 13.6f, -11.1f, 21.5f, -7.2f)
                reflectiveCurveToRelative(11.1f, 13.6f, 7.2f, 21.5f)
                lineToRelative(-8.5f, 16.9f)
                lineToRelative(54.7f, 26.2f)
                curveToRelative(1.5f, -0.7f, 3.1f, -1.4f, 4.7f, -2.1f)
                lineToRelative(83.4f, -33.4f)
                curveToRelative(34.2f, -13.7f, 72.8f, 4.2f, 84.5f, 39.2f)
                lineToRelative(17.1f, 51.2f)
                lineToRelative(52.1f, 26.1f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                reflectiveCurveToRelative(-27.1f, 22.2f, -42.9f, 14.3f)
                lineToRelative(-58.1f, -29.0f)
                curveToRelative(-11.4f, -5.7f, -20.0f, -15.7f, -24.1f, -27.8f)
                lineToRelative(-5.8f, -17.3f)
                lineToRelative(-27.3f, 12.1f)
                lineToRelative(-6.8f, 3.0f)
                lineToRelative(-6.7f, -3.2f)
                lineTo(151.5f, 116.7f)
                lineToRelative(-9.2f, 18.4f)
                curveToRelative(-4.0f, 7.9f, -13.6f, 11.1f, -21.5f, 7.2f)
                reflectiveCurveToRelative(-11.1f, -13.6f, -7.2f, -21.5f)
                lineToRelative(9.0f, -18.0f)
                lineToRelative(-17.6f, -8.4f)
                curveToRelative(-8.0f, -3.8f, -11.3f, -13.4f, -7.5f, -21.3f)
                reflectiveCurveToRelative(13.4f, -11.3f, 21.3f, -7.5f)
                close()
            }
        }
        .build()
        return _personSkiing!!
    }

private var _personSkiing: ImageVector? = null
