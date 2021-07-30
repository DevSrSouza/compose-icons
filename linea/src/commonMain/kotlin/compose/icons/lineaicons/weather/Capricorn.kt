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

public val WeatherGroup.Capricorn: ImageVector
    get() {
        if (_capricorn != null) {
            return _capricorn!!
        }
        _capricorn = Builder(name = "Capricorn", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -4.0f, 6.0f, -4.0f)
                curveToRelative(5.0f, 0.0f, 4.0f, 10.0f, 4.0f, 10.0f)
                verticalLineToRelative(29.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -10.0f, 7.0f, -10.0f)
                reflectiveCurveToRelative(7.0f, 10.0f, 7.0f, 10.0f)
                verticalLineToRelative(29.0f)
                curveToRelative(0.0f, 0.0f, -1.0f, 14.0f, 15.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 40.0f)
                curveToRelative(-3.0f, 0.0f, -12.0f, 1.0f, -12.0f, 12.0f)
                curveToRelative(0.0f, 1.0f, 1.0f, 11.0f, -12.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 54.0f)
                curveToRelative(3.866f, 0.0f, 7.0f, -3.134f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.134f, -7.0f, -7.0f, -7.0f)
            }
        }
        .build()
        return _capricorn!!
    }

private var _capricorn: ImageVector? = null
