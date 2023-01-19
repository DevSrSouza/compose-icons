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

public val WeatherGroup.Storm32: ImageVector
    get() {
        if (_storm32 != null) {
            return _storm32!!
        }
        _storm32 = Builder(name = "Storm32", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(55.0f, 40.0f)
                curveToRelative(4.565f, 0.0f, 8.0f, -3.435f, 8.0f, -8.0f)
                curveToRelative(0.0f, -4.565f, -3.435f, -9.0f, -8.0f, -9.0f)
                curveToRelative(0.0f, -11.414f, -9.586f, -20.0f, -21.0f, -20.0f)
                curveTo(23.898f, 3.0f, 14.8f, 9.423f, 13.0f, 19.0f)
                curveToRelative(0.0f, 0.0f, -1.165f, 0.0f, -2.0f, 0.0f)
                curveTo(5.292f, 19.0f, 1.0f, 24.292f, 1.0f, 30.0f)
                reflectiveCurveToRelative(4.292f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(55.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 46.0f)
                lineToRelative(-3.0f, 7.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(-4.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.0f, 46.0f)
                lineToRelative(-3.0f, 7.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(-4.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 46.0f)
                lineToRelative(-3.0f, 7.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(-4.0f, 7.0f)
            }
        }
        .build()
        return _storm32!!
    }

private var _storm32: ImageVector? = null
