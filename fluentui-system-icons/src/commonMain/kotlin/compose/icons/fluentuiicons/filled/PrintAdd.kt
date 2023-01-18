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

public val FilledGroup.PrintAdd: ImageVector
    get() {
        if (_printAdd != null) {
            return _printAdd!!
        }
        _printAdd = Builder(name = "PrintAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5f)
                curveTo(23.0f, 3.4624f, 20.5376f, 1.0f, 17.5f, 1.0f)
                curveTo(14.4624f, 1.0f, 12.0f, 3.4624f, 12.0f, 6.5f)
                curveTo(12.0f, 9.5376f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 9.5376f, 23.0f, 6.5f)
                close()
                moveTo(18.0006f, 7.0f)
                lineTo(18.0011f, 9.5035f)
                curveTo(18.0011f, 9.7797f, 17.7773f, 10.0035f, 17.5011f, 10.0035f)
                curveTo(17.225f, 10.0035f, 17.0011f, 9.7797f, 17.0011f, 9.5035f)
                lineTo(17.0006f, 7.0f)
                horizontalLineTo(14.4956f)
                curveTo(14.2197f, 7.0f, 13.9961f, 6.7762f, 13.9961f, 6.5f)
                curveTo(13.9961f, 6.2239f, 14.2197f, 6.0f, 14.4956f, 6.0f)
                horizontalLineTo(17.0005f)
                lineTo(17.0f, 3.4993f)
                curveTo(17.0f, 3.2231f, 17.2239f, 2.9993f, 17.5f, 2.9993f)
                curveTo(17.7761f, 2.9993f, 18.0f, 3.2231f, 18.0f, 3.4993f)
                lineTo(18.0005f, 6.0f)
                horizontalLineTo(20.4966f)
                curveTo(20.7725f, 6.0f, 20.9961f, 6.2239f, 20.9961f, 6.5f)
                curveTo(20.9961f, 6.7762f, 20.7725f, 7.0f, 20.4966f, 7.0f)
                horizontalLineTo(18.0006f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(19.2487f, 13.0f, 20.836f, 12.3095f, 22.0044f, 11.1862f)
                lineTo(22.0071f, 16.2497f)
                curveTo(22.009f, 17.4918f, 21.0021f, 18.5002f, 19.7591f, 18.5009f)
                lineTo(18.0f, 18.5f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(18.499f)
                lineTo(4.25f, 18.5001f)
                curveTo(3.0074f, 18.5001f, 2.0f, 17.4927f, 2.0f, 16.2501f)
                verticalLineTo(10.2536f)
                curveTo(2.0f, 8.4586f, 3.4551f, 7.0036f, 5.25f, 7.0036f)
                lineTo(5.999f, 7.003f)
                lineTo(6.0f, 6.25f)
                curveTo(6.0f, 5.0074f, 7.0074f, 4.0f, 8.25f, 4.0f)
                horizontalLineTo(11.4982f)
                curveTo(11.3004f, 4.4742f, 11.1572f, 4.9768f, 11.0764f, 5.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 5.5f, 7.5f, 5.8358f, 7.5f, 6.25f)
                lineTo(7.499f, 7.003f)
                horizontalLineTo(11.0192f)
                curveTo(11.2759f, 10.3578f, 14.0794f, 13.0f, 17.5f, 13.0f)
                close()
                moveTo(16.5f, 15.25f)
                curveTo(16.5f, 14.8358f, 16.1642f, 14.5f, 15.75f, 14.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 14.5f, 7.5f, 14.8358f, 7.5f, 15.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.1642f, 7.8358f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 20.5f, 16.5f, 20.1642f, 16.5f, 19.75f)
                verticalLineTo(15.25f)
                close()
            }
        }
        .build()
        return _printAdd!!
    }

private var _printAdd: ImageVector? = null
