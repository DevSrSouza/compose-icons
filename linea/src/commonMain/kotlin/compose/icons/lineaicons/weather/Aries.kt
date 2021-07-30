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

public val WeatherGroup.Aries: ImageVector
    get() {
        if (_aries != null) {
            return _aries!!
        }
        _aries = Builder(name = "Aries", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 25.0f)
                curveToRelative(0.0f, 0.0f, -5.0f, -5.0f, -5.0f, -11.0f)
                reflectiveCurveTo(3.0f, 1.0f, 13.0f, 1.0f)
                curveToRelative(13.25f, 0.0f, 19.0f, 22.0f, 19.0f, 63.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(58.0f, 25.0f)
                curveToRelative(0.0f, 0.0f, 5.0f, -5.0f, 5.0f, -11.0f)
                reflectiveCurveTo(61.0f, 1.0f, 51.0f, 1.0f)
                curveTo(37.75f, 1.0f, 32.0f, 23.0f, 32.0f, 64.0f)
            }
        }
        .build()
        return _aries!!
    }

private var _aries: ImageVector? = null
