package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.WeatherMoon: ImageVector
    get() {
        if (_weatherMoon != null) {
            return _weatherMoon!!
        }
        _weatherMoon = Builder(name = "WeatherMoon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0258f, 17.0014f)
                curveTo(17.2639f, 21.7851f, 11.1471f, 23.4241f, 6.3634f, 20.6622f)
                curveTo(5.0607f, 19.9101f, 3.964f, 18.8926f, 3.1287f, 17.6797f)
                curveTo(2.8495f, 17.2741f, 3.0301f, 16.7141f, 3.4937f, 16.5482f)
                curveTo(7.2611f, 15.1997f, 9.2789f, 13.6372f, 10.4498f, 11.4021f)
                curveTo(11.6825f, 9.0491f, 12.001f, 6.4716f, 11.1387f, 2.9386f)
                curveTo(11.0195f, 2.4501f, 11.4053f, 1.9849f, 11.9075f, 2.0119f)
                curveTo(13.4645f, 2.0954f, 14.9856f, 2.5426f, 16.3649f, 3.339f)
                curveTo(21.1486f, 6.1009f, 22.7876f, 12.2177f, 20.0258f, 17.0014f)
                close()
            }
        }
        .build()
        return _weatherMoon!!
    }

private var _weatherMoon: ImageVector? = null
