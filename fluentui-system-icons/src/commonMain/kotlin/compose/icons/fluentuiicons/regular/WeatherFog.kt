package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.WeatherFog: ImageVector
    get() {
        if (_weatherFog != null) {
            return _weatherFog!!
        }
        _weatherFog = Builder(name = "WeatherFog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7449f, 19.5001f)
                horizontalLineTo(16.2463f)
                curveTo(16.6601f, 19.5001f, 16.9956f, 19.8358f, 16.9956f, 20.2501f)
                curveTo(16.9956f, 20.6298f, 16.7137f, 20.9436f, 16.348f, 20.9932f)
                lineTo(16.2463f, 21.0001f)
                horizontalLineTo(7.7449f)
                curveTo(7.3311f, 21.0001f, 6.9956f, 20.6643f, 6.9956f, 20.2501f)
                curveTo(6.9956f, 19.8704f, 7.2775f, 19.5566f, 7.6433f, 19.5069f)
                lineTo(7.7449f, 19.5001f)
                horizontalLineTo(16.2463f)
                horizontalLineTo(7.7449f)
                close()
                moveTo(4.7501f, 16.5193f)
                horizontalLineTo(19.2501f)
                curveTo(19.6643f, 16.5193f, 20.0001f, 16.8551f, 20.0001f, 17.2693f)
                curveTo(20.0001f, 17.649f, 19.7179f, 17.9628f, 19.3518f, 18.0124f)
                lineTo(19.2501f, 18.0193f)
                horizontalLineTo(4.7501f)
                curveTo(4.3358f, 18.0193f, 4.0001f, 17.6835f, 4.0001f, 17.2693f)
                curveTo(4.0001f, 16.8896f, 4.2822f, 16.5758f, 4.6483f, 16.5261f)
                lineTo(4.7501f, 16.5193f)
                close()
                moveTo(12.0001f, 3.0049f)
                curveTo(15.1686f, 3.0049f, 16.966f, 5.1022f, 17.2275f, 7.635f)
                lineTo(17.3074f, 7.635f)
                curveTo(19.3465f, 7.635f, 20.9995f, 9.2837f, 20.9995f, 11.3175f)
                curveTo(20.9995f, 13.3513f, 19.3465f, 15.0001f, 17.3074f, 15.0001f)
                horizontalLineTo(6.6927f)
                curveTo(4.6536f, 15.0001f, 3.0006f, 13.3513f, 3.0006f, 11.3175f)
                curveTo(3.0006f, 9.2837f, 4.6536f, 7.635f, 6.6927f, 7.635f)
                lineTo(6.7727f, 7.635f)
                curveTo(7.0356f, 5.0855f, 8.8315f, 3.0049f, 12.0001f, 3.0049f)
                close()
                moveTo(12.0001f, 4.5025f)
                curveTo(9.9287f, 4.5025f, 8.1234f, 6.1357f, 8.1234f, 8.3917f)
                curveTo(8.1234f, 8.7492f, 7.8044f, 9.0296f, 7.4392f, 9.0296f)
                lineTo(6.7486f, 9.0296f)
                curveTo(5.4876f, 9.0296f, 4.4654f, 10.0309f, 4.4654f, 11.266f)
                curveTo(4.4654f, 12.5012f, 5.4876f, 13.5025f, 6.7486f, 13.5025f)
                horizontalLineTo(17.2515f)
                curveTo(18.5125f, 13.5025f, 19.5347f, 12.5012f, 19.5347f, 11.266f)
                curveTo(19.5347f, 10.0309f, 18.5125f, 9.0296f, 17.2515f, 9.0296f)
                lineTo(16.5609f, 9.0296f)
                curveTo(16.1957f, 9.0296f, 15.8768f, 8.7492f, 15.8768f, 8.3917f)
                curveTo(15.8768f, 6.1068f, 14.0714f, 4.5025f, 12.0001f, 4.5025f)
                close()
            }
        }
        .build()
        return _weatherFog!!
    }

private var _weatherFog: ImageVector? = null
