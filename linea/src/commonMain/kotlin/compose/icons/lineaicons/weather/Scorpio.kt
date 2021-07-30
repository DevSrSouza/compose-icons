package compose.icons.lineaicons.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.Scorpio: ImageVector
    get() {
        if (_scorpio != null) {
            return _scorpio!!
        }
        _scorpio = Builder(name = "Scorpio", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(30.0f, 52.0f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -11.0f, 8.0f, -11.0f)
                reflectiveCurveToRelative(8.0f, 11.0f, 8.0f, 11.0f)
                reflectiveCurveToRelative(0.0f, 33.0f, 0.0f, 40.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 52.0f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 0.0f, 0.083f, -11.0f, 8.0f, -11.0f)
                reflectiveCurveToRelative(8.0f, 11.0f, 8.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -10.0f, -8.0f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(52.0f, 53.0f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(-5.0f, 5.0f)
            }
        }
        .build()
        return _scorpio!!
    }

private var _scorpio: ImageVector? = null
