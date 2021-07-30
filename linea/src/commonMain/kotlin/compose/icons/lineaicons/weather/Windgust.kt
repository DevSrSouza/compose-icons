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

public val WeatherGroup.Windgust: ImageVector
    get() {
        if (_windgust != null) {
            return _windgust!!
        }
        _windgust = Builder(name = "Windgust", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(44.0f, 40.0f)
                curveToRelative(0.0f, 3.866f, 3.134f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.134f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.134f, -7.0f, -7.0f, -7.0f)
                horizontalLineTo(0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(49.0f, 19.0f)
                curveToRelative(0.0f, -3.866f, 3.134f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.134f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.134f, 7.0f, -7.0f, 7.0f)
                horizontalLineTo(0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.0f, 45.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.239f, -5.0f, -5.0f, -5.0f)
                horizontalLineTo(0.0f)
            }
        }
        .build()
        return _windgust!!
    }

private var _windgust: ImageVector? = null
