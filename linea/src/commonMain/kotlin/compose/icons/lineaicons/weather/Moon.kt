package compose.icons.lineaicons.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 52.0f)
                curveToRelative(14.359f, 0.0f, 26.0f, -11.641f, 26.0f, -26.0f)
                curveToRelative(0.0f, -9.994f, -6.729f, -18.648f, -15.0f, -23.0f)
                curveToRelative(3.396f, -1.277f, 8.158f, -2.0f, 12.0f, -2.0f)
                curveToRelative(17.121f, 0.0f, 31.0f, 13.879f, 31.0f, 31.0f)
                reflectiveCurveTo(46.121f, 63.0f, 29.0f, 63.0f)
                curveToRelative(-9.505f, 0.0f, -18.313f, -4.265f, -24.0f, -11.0f)
                curveTo(5.23f, 52.006f, 5.768f, 52.0f, 6.0f, 52.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
