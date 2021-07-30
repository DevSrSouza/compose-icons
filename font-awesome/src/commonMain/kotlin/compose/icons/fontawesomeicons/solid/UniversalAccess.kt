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

public val SolidGroup.UniversalAccess: ImageVector
    get() {
        if (_universalAccess != null) {
            return _universalAccess!!
        }
        _universalAccess = Builder(name = "UniversalAccess", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveToRelative(114.953f, 0.0f, 208.0f, 93.029f, 208.0f, 208.0f)
                curveToRelative(0.0f, 114.953f, -93.029f, 208.0f, -208.0f, 208.0f)
                curveToRelative(-114.953f, 0.0f, -208.0f, -93.029f, -208.0f, -208.0f)
                curveToRelative(0.0f, -114.953f, 93.029f, -208.0f, 208.0f, -208.0f)
                moveToRelative(0.0f, -40.0f)
                curveTo(119.033f, 8.0f, 8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.033f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.033f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 64.0f)
                curveTo(149.961f, 64.0f, 64.0f, 149.961f, 64.0f, 256.0f)
                reflectiveCurveToRelative(85.961f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -85.961f, 192.0f, -192.0f)
                reflectiveCurveTo(362.039f, 64.0f, 256.0f, 64.0f)
                close()
                moveTo(256.0f, 108.0f)
                curveToRelative(19.882f, 0.0f, 36.0f, 16.118f, 36.0f, 36.0f)
                reflectiveCurveToRelative(-16.118f, 36.0f, -36.0f, 36.0f)
                reflectiveCurveToRelative(-36.0f, -16.118f, -36.0f, -36.0f)
                reflectiveCurveToRelative(16.118f, -36.0f, 36.0f, -36.0f)
                close()
                moveTo(373.741f, 206.023f)
                curveToRelative(-28.712f, 6.779f, -55.511f, 12.748f, -82.14f, 15.807f)
                curveToRelative(0.851f, 101.023f, 12.306f, 123.052f, 25.037f, 155.621f)
                curveToRelative(3.617f, 9.26f, -0.957f, 19.698f, -10.217f, 23.315f)
                curveToRelative(-9.261f, 3.617f, -19.699f, -0.957f, -23.316f, -10.217f)
                curveToRelative(-8.705f, -22.308f, -17.086f, -40.636f, -22.261f, -78.549f)
                horizontalLineToRelative(-9.686f)
                curveToRelative(-5.167f, 37.851f, -13.534f, 56.208f, -22.262f, 78.549f)
                curveToRelative(-3.615f, 9.255f, -14.05f, 13.836f, -23.315f, 10.217f)
                curveToRelative(-9.26f, -3.617f, -13.834f, -14.056f, -10.217f, -23.315f)
                curveToRelative(12.713f, -32.541f, 24.185f, -54.541f, 25.037f, -155.621f)
                curveToRelative(-26.629f, -3.058f, -53.428f, -9.027f, -82.141f, -15.807f)
                curveToRelative(-8.6f, -2.031f, -13.926f, -10.648f, -11.895f, -19.249f)
                reflectiveCurveToRelative(10.647f, -13.926f, 19.249f, -11.895f)
                curveToRelative(96.686f, 22.829f, 124.283f, 22.783f, 220.775f, 0.0f)
                curveToRelative(8.599f, -2.03f, 17.218f, 3.294f, 19.249f, 11.895f)
                curveToRelative(2.029f, 8.601f, -3.297f, 17.219f, -11.897f, 19.249f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
