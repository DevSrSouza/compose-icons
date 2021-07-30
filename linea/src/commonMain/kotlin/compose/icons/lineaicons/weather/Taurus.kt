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

public val WeatherGroup.Taurus: ImageVector
    get() {
        if (_taurus != null) {
            return _taurus!!
        }
        _taurus = Builder(name = "Taurus", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 43.0f)
                moveToRelative(-18.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 36.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -36.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 3.0f)
                curveToRelative(14.0f, 0.0f, 15.0f, 12.0f, 15.0f, 12.0f)
                reflectiveCurveToRelative(0.0f, 10.0f, 17.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 3.0f)
                curveTo(50.0f, 3.0f, 49.0f, 15.0f, 49.0f, 15.0f)
                reflectiveCurveToRelative(0.0f, 10.0f, -17.0f, 10.0f)
            }
        }
        .build()
        return _taurus!!
    }

private var _taurus: ImageVector? = null
