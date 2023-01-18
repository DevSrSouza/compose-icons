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

public val RegularGroup.ChatAdd: ImageVector
    get() {
        if (_chatAdd != null) {
            return _chatAdd!!
        }
        _chatAdd = Builder(name = "ChatAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 12.2628f, 21.9899f, 12.5232f, 21.97f, 12.7809f)
                curveTo(21.5319f, 12.3658f, 21.0361f, 12.0111f, 20.4958f, 11.73f)
                curveTo(20.3532f, 7.1605f, 16.6041f, 3.5f, 12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 13.4696f, 3.8728f, 14.8834f, 4.573f, 16.1375f)
                lineTo(4.7237f, 16.4072f)
                lineTo(3.611f, 20.3914f)
                lineTo(7.5975f, 19.2792f)
                lineTo(7.8671f, 19.4295f)
                curveTo(9.043f, 20.0852f, 10.3592f, 20.4531f, 11.73f, 20.4958f)
                curveTo(12.0111f, 21.0361f, 12.3658f, 21.5319f, 12.7809f, 21.97f)
                curveTo(12.5232f, 21.9899f, 12.2628f, 22.0f, 12.0f, 22.0f)
                curveTo(10.3817f, 22.0f, 8.8178f, 21.6146f, 7.4129f, 20.888f)
                lineTo(3.587f, 21.9553f)
                curveTo(2.9221f, 22.141f, 2.2326f, 21.7525f, 2.0469f, 21.0876f)
                curveTo(1.9855f, 20.8676f, 1.9855f, 20.6349f, 2.047f, 20.4151f)
                lineTo(3.1146f, 16.5922f)
                curveTo(2.3864f, 15.186f, 2.0f, 13.6203f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(18.0006f, 18.0f)
                lineTo(18.0011f, 20.5035f)
                curveTo(18.0011f, 20.7797f, 17.7773f, 21.0035f, 17.5011f, 21.0035f)
                curveTo(17.225f, 21.0035f, 17.0011f, 20.7797f, 17.0011f, 20.5035f)
                lineTo(17.0006f, 18.0f)
                horizontalLineTo(14.4956f)
                curveTo(14.2197f, 18.0f, 13.9961f, 17.7762f, 13.9961f, 17.5f)
                curveTo(13.9961f, 17.2239f, 14.2197f, 17.0f, 14.4956f, 17.0f)
                horizontalLineTo(17.0005f)
                lineTo(17.0f, 14.4993f)
                curveTo(17.0f, 14.2231f, 17.2239f, 13.9993f, 17.5f, 13.9993f)
                curveTo(17.7761f, 13.9993f, 18.0f, 14.2231f, 18.0f, 14.4993f)
                lineTo(18.0005f, 17.0f)
                horizontalLineTo(20.4966f)
                curveTo(20.7725f, 17.0f, 20.9961f, 17.2239f, 20.9961f, 17.5f)
                curveTo(20.9961f, 17.7762f, 20.7725f, 18.0f, 20.4966f, 18.0f)
                horizontalLineTo(18.0006f)
                close()
            }
        }
        .build()
        return _chatAdd!!
    }

private var _chatAdd: ImageVector? = null
