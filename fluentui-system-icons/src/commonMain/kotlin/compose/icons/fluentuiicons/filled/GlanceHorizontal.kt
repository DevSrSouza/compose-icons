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

public val FilledGroup.GlanceHorizontal: ImageVector
    get() {
        if (_glanceHorizontal != null) {
            return _glanceHorizontal!!
        }
        _glanceHorizontal = Builder(name = "GlanceHorizontal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.002f, 4.7527f)
                curveTo(13.002f, 3.7863f, 12.2185f, 3.0027f, 11.252f, 3.0027f)
                horizontalLineTo(4.7519f)
                curveTo(3.7854f, 3.0027f, 3.002f, 3.7863f, 3.002f, 4.7527f)
                verticalLineTo(9.2528f)
                curveTo(3.002f, 10.2192f, 3.7854f, 11.0027f, 4.7519f, 11.0027f)
                horizontalLineTo(11.252f)
                curveTo(12.2185f, 11.0027f, 13.002f, 10.2192f, 13.002f, 9.2528f)
                verticalLineTo(4.7527f)
                close()
                moveTo(8.9895f, 14.7345f)
                curveTo(8.9895f, 13.7681f, 8.206f, 12.9845f, 7.2395f, 12.9845f)
                horizontalLineTo(4.7519f)
                curveTo(3.7854f, 12.9845f, 3.002f, 13.7681f, 3.002f, 14.7345f)
                verticalLineTo(19.249f)
                curveTo(3.002f, 20.2155f, 3.7854f, 20.999f, 4.7519f, 20.999f)
                horizontalLineTo(7.2395f)
                curveTo(8.206f, 20.999f, 8.9895f, 20.2155f, 8.9895f, 19.249f)
                verticalLineTo(14.7345f)
                close()
                moveTo(21.0036f, 14.749f)
                curveTo(21.0036f, 13.7825f, 20.2201f, 12.999f, 19.2536f, 12.999f)
                horizontalLineTo(12.7536f)
                curveTo(11.8355f, 12.999f, 11.0824f, 13.7061f, 11.0094f, 14.6054f)
                lineTo(11.0036f, 14.749f)
                verticalLineTo(19.249f)
                curveTo(11.0036f, 20.2155f, 11.7871f, 20.999f, 12.7536f, 20.999f)
                horizontalLineTo(19.2536f)
                curveTo(20.2201f, 20.999f, 21.0036f, 20.2155f, 21.0036f, 19.249f)
                verticalLineTo(14.749f)
                close()
                moveTo(21.0036f, 4.7527f)
                curveTo(21.0036f, 3.7863f, 20.2201f, 3.0027f, 19.2536f, 3.0027f)
                horizontalLineTo(16.7536f)
                curveTo(15.7871f, 3.0027f, 15.0036f, 3.7863f, 15.0036f, 4.7527f)
                verticalLineTo(9.2528f)
                curveTo(15.0036f, 10.2192f, 15.7871f, 11.0027f, 16.7536f, 11.0027f)
                horizontalLineTo(19.2536f)
                curveTo(20.2201f, 11.0027f, 21.0036f, 10.2192f, 21.0036f, 9.2528f)
                verticalLineTo(4.7527f)
                close()
            }
        }
        .build()
        return _glanceHorizontal!!
    }

private var _glanceHorizontal: ImageVector? = null
