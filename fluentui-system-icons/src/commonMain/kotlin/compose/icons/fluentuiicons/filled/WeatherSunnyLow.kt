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

public val FilledGroup.WeatherSunnyLow: ImageVector
    get() {
        if (_weatherSunnyLow != null) {
            return _weatherSunnyLow!!
        }
        _weatherSunnyLow = Builder(name = "WeatherSunnyLow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 2.75f)
                curveTo(12.75f, 2.3358f, 12.4142f, 2.0f, 12.0f, 2.0f)
                curveTo(11.5858f, 2.0f, 11.25f, 2.3358f, 11.25f, 2.75f)
                verticalLineTo(4.25f)
                curveTo(11.25f, 4.6642f, 11.5858f, 5.0f, 12.0f, 5.0f)
                curveTo(12.4142f, 5.0f, 12.75f, 4.6642f, 12.75f, 4.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(19.0303f, 4.9697f)
                curveTo(19.3232f, 5.2625f, 19.3232f, 5.7374f, 19.0303f, 6.0303f)
                lineTo(17.9697f, 7.091f)
                curveTo(17.6768f, 7.3839f, 17.2019f, 7.3839f, 16.909f, 7.091f)
                curveTo(16.6161f, 6.7981f, 16.6161f, 6.3232f, 16.909f, 6.0303f)
                lineTo(17.9697f, 4.9697f)
                curveTo(18.2626f, 4.6768f, 18.7374f, 4.6768f, 19.0303f, 4.9697f)
                close()
                moveTo(6.5907f, 13.0f)
                curveTo(6.5311f, 12.6757f, 6.5f, 12.3415f, 6.5f, 12.0f)
                curveTo(6.5f, 8.9624f, 8.9624f, 6.5f, 12.0f, 6.5f)
                curveTo(15.0376f, 6.5f, 17.5f, 8.9624f, 17.5f, 12.0f)
                curveTo(17.5f, 12.3415f, 17.4689f, 12.6757f, 17.4093f, 13.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 13.0f, 22.0f, 13.3358f, 22.0f, 13.75f)
                curveTo(22.0f, 14.1642f, 21.6642f, 14.5f, 21.25f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 14.5f, 2.0f, 14.1642f, 2.0f, 13.75f)
                curveTo(2.0f, 13.3358f, 2.3358f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(6.5907f)
                close()
                moveTo(6.75f, 16.0f)
                curveTo(6.3358f, 16.0f, 6.0f, 16.3358f, 6.0f, 16.75f)
                curveTo(6.0f, 17.1642f, 6.3358f, 17.5f, 6.75f, 17.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 17.5f, 18.0f, 17.1642f, 18.0f, 16.75f)
                curveTo(18.0f, 16.3358f, 17.6642f, 16.0f, 17.25f, 16.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(10.75f, 19.0f)
                curveTo(10.3358f, 19.0f, 10.0f, 19.3358f, 10.0f, 19.75f)
                curveTo(10.0f, 20.1642f, 10.3358f, 20.5f, 10.75f, 20.5f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 20.5f, 14.0f, 20.1642f, 14.0f, 19.75f)
                curveTo(14.0f, 19.3358f, 13.6642f, 19.0f, 13.25f, 19.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(4.9698f, 4.9697f)
                curveTo(5.2627f, 4.6768f, 5.7375f, 4.6768f, 6.0304f, 4.9697f)
                lineTo(7.0911f, 6.0303f)
                curveTo(7.384f, 6.3232f, 7.384f, 6.7981f, 7.0911f, 7.091f)
                curveTo(6.7982f, 7.3839f, 6.3233f, 7.3839f, 6.0304f, 7.091f)
                lineTo(4.9698f, 6.0303f)
                curveTo(4.6769f, 5.7374f, 4.6769f, 5.2626f, 4.9698f, 4.9697f)
                close()
            }
        }
        .build()
        return _weatherSunnyLow!!
    }

private var _weatherSunnyLow: ImageVector? = null
