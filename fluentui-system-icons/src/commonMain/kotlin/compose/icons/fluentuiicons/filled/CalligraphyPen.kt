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

public val FilledGroup.CalligraphyPen: ImageVector
    get() {
        if (_calligraphyPen != null) {
            return _calligraphyPen!!
        }
        _calligraphyPen = Builder(name = "CalligraphyPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 2.75f)
                curveTo(7.5f, 2.3358f, 7.1642f, 2.0f, 6.75f, 2.0f)
                curveTo(6.3358f, 2.0f, 6.0f, 2.3358f, 6.0f, 2.75f)
                verticalLineTo(5.75f)
                curveTo(6.0f, 6.6465f, 6.6741f, 7.3855f, 7.543f, 7.4879f)
                lineTo(6.5273f, 9.9929f)
                curveTo(6.1194f, 10.9988f, 6.1637f, 12.1753f, 6.6455f, 13.1355f)
                lineTo(10.6354f, 21.0866f)
                curveTo(10.7846f, 21.384f, 10.9988f, 21.621f, 11.25f, 21.7791f)
                verticalLineTo(12.2993f)
                curveTo(10.8016f, 12.04f, 10.5f, 11.5552f, 10.5f, 11.0f)
                curveTo(10.5f, 10.1716f, 11.1716f, 9.5f, 12.0f, 9.5f)
                curveTo(12.8284f, 9.5f, 13.5f, 10.1716f, 13.5f, 11.0f)
                curveTo(13.5f, 11.5552f, 13.1984f, 12.04f, 12.75f, 12.2993f)
                verticalLineTo(21.7791f)
                curveTo(13.0012f, 21.621f, 13.2154f, 21.384f, 13.3646f, 21.0866f)
                lineTo(17.3545f, 13.1355f)
                curveTo(17.8363f, 12.1753f, 17.8806f, 10.9988f, 17.4727f, 9.9929f)
                lineTo(16.4569f, 7.4879f)
                curveTo(17.3259f, 7.3855f, 18.0f, 6.6465f, 18.0f, 5.75f)
                verticalLineTo(2.75f)
                curveTo(18.0f, 2.3358f, 17.6642f, 2.0f, 17.25f, 2.0f)
                curveTo(16.8358f, 2.0f, 16.5f, 2.3358f, 16.5f, 2.75f)
                verticalLineTo(5.75f)
                curveTo(16.5f, 5.8881f, 16.3881f, 6.0f, 16.25f, 6.0f)
                horizontalLineTo(7.75f)
                curveTo(7.6119f, 6.0f, 7.5f, 5.8881f, 7.5f, 5.75f)
                verticalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _calligraphyPen!!
    }

private var _calligraphyPen: ImageVector? = null
