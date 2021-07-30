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

public val WeatherGroup.Virgo: ImageVector
    get() {
        if (_virgo != null) {
            return _virgo!!
        }
        _virgo = Builder(name = "Virgo", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(54.0f, 64.0f)
                curveToRelative(0.0f, 0.0f, -6.0f, -5.0f, -6.0f, -12.0f)
                reflectiveCurveToRelative(0.0f, -40.0f, 0.0f, -40.0f)
                reflectiveCurveToRelative(0.0f, -11.0f, -8.0f, -11.0f)
                reflectiveCurveToRelative(-8.0f, 11.0f, -8.0f, 11.0f)
                verticalLineToRelative(40.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 52.0f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 0.0f, 0.083f, -11.0f, 8.0f, -11.0f)
                reflectiveCurveToRelative(8.0f, 11.0f, 8.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -10.0f, -8.0f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 24.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -14.0f, 6.0f, -14.0f)
                reflectiveCurveToRelative(6.0f, 14.0f, 6.0f, 14.0f)
                reflectiveCurveToRelative(-1.0f, 34.0f, -27.0f, 34.0f)
            }
        }
        .build()
        return _virgo!!
    }

private var _virgo: ImageVector? = null
