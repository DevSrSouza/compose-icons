package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RadiationAlt: ImageVector
    get() {
        if (_radiationAlt != null) {
            return _radiationAlt!!
        }
        _radiationAlt = Builder(name = "RadiationAlt", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 256.0f)
                horizontalLineToRelative(79.1f)
                curveToRelative(9.2f, 0.0f, 16.9f, -7.7f, 16.0f, -16.8f)
                curveToRelative(-4.6f, -43.6f, -27.0f, -81.8f, -59.5f, -107.8f)
                curveToRelative(-7.6f, -6.1f, -18.8f, -4.5f, -24.0f, 3.8f)
                lineTo(281.9f, 202.0f)
                curveToRelative(18.0f, 11.2f, 30.1f, 31.2f, 30.1f, 54.0f)
                close()
                moveTo(214.2f, 310.1f)
                lineTo(172.4f, 377.0f)
                curveToRelative(-4.9f, 7.8f, -2.4f, 18.4f, 5.8f, 22.5f)
                curveToRelative(21.1f, 10.4f, 44.7f, 16.5f, 69.8f, 16.5f)
                reflectiveCurveToRelative(48.7f, -6.1f, 69.9f, -16.5f)
                curveToRelative(8.2f, -4.1f, 10.6f, -14.7f, 5.8f, -22.5f)
                lineToRelative(-41.8f, -66.9f)
                curveToRelative(-9.8f, 6.2f, -21.4f, 9.9f, -33.8f, 9.9f)
                reflectiveCurveToRelative(-24.1f, -3.7f, -33.9f, -9.9f)
                close()
                moveTo(104.9f, 256.0f)
                lineTo(184.0f, 256.0f)
                curveToRelative(0.0f, -22.8f, 12.1f, -42.8f, 30.2f, -54.1f)
                lineToRelative(-41.7f, -66.8f)
                curveToRelative(-5.2f, -8.3f, -16.4f, -9.9f, -24.0f, -3.8f)
                curveToRelative(-32.6f, 26.0f, -54.9f, 64.2f, -59.5f, 107.8f)
                curveToRelative(-1.1f, 9.2f, 6.7f, 16.9f, 15.9f, 16.9f)
                close()
                moveTo(248.0f, 504.0f)
                curveToRelative(137.0f, 0.0f, 248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                reflectiveCurveTo(0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                close()
                moveTo(248.0f, 72.0f)
                curveToRelative(101.5f, 0.0f, 184.0f, 82.5f, 184.0f, 184.0f)
                reflectiveCurveToRelative(-82.5f, 184.0f, -184.0f, 184.0f)
                reflectiveCurveTo(64.0f, 357.5f, 64.0f, 256.0f)
                reflectiveCurveTo(146.5f, 72.0f, 248.0f, 72.0f)
                close()
                moveTo(248.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _radiationAlt!!
    }

private var _radiationAlt: ImageVector? = null
