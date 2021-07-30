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

public val WeatherGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 41.265f)
                curveTo(11.052f, 53.27f, 20.401f, 63.0f, 32.0f, 63.0f)
                reflectiveCurveToRelative(21.0f, -9.73f, 21.0f, -21.735f)
                curveTo(53.0f, 25.729f, 32.035f, 1.0f, 32.035f, 1.0f)
                reflectiveCurveTo(10.931f, 25.729f, 11.0f, 41.265f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
