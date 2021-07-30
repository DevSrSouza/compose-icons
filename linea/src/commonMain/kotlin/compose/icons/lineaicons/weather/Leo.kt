package compose.icons.lineaicons.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.Leo: ImageVector
    get() {
        if (_leo != null) {
            return _leo!!
        }
        _leo = Builder(name = "Leo", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp, viewportWidth
                = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.649f, 33.597f)
                curveToRelative(-8.337f, -4.888f, -11.134f, -15.608f, -6.247f, -23.946f)
                curveTo(21.29f, 1.312f, 32.012f, -1.485f, 40.35f, 3.403f)
                curveToRelative(8.337f, 4.888f, 11.134f, 15.608f, 6.247f, 23.946f)
                curveTo(46.597f, 27.35f, 36.0f, 46.0f, 36.0f, 54.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 42.0f)
                moveToRelative(-9.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -18.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.064f, 58.0f)
                curveToRelative(-1.473f, 2.963f, -4.531f, 5.0f, -8.064f, 5.0f)
                curveToRelative(-4.971f, 0.0f, -9.0f, -4.029f, -9.0f, -9.0f)
            }
        }
        .build()
        return _leo!!
    }

private var _leo: ImageVector? = null
