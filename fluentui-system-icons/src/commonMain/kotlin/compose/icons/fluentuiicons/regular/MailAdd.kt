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

public val RegularGroup.MailAdd: ImageVector
    get() {
        if (_mailAdd != null) {
            return _mailAdd!!
        }
        _mailAdd = Builder(name = "MailAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.5f, 16.75f)
                verticalLineTo(12.2678f)
                curveTo(21.051f, 11.9806f, 21.5557f, 11.6168f, 22.0f, 11.1904f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(2.0f, 5.517f, 3.3565f, 4.1007f, 5.0656f, 4.0051f)
                lineTo(5.25f, 4.0f)
                horizontalLineTo(11.4982f)
                curveTo(11.3004f, 4.4742f, 11.1572f, 4.9768f, 11.0764f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.3318f, 5.5f, 3.5788f, 6.2071f, 3.5058f, 7.1065f)
                lineTo(3.5f, 7.25f)
                verticalLineTo(7.679f)
                lineTo(12.0f, 12.1525f)
                lineTo(13.3052f, 11.4654f)
                curveTo(13.7437f, 11.8363f, 14.232f, 12.1501f, 14.7587f, 12.3954f)
                lineTo(12.3493f, 13.6637f)
                curveTo(12.1619f, 13.7623f, 11.9431f, 13.7764f, 11.7468f, 13.706f)
                lineTo(11.6507f, 13.6637f)
                lineTo(3.5f, 9.374f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.6682f, 4.2071f, 18.4212f, 5.1065f, 18.4942f)
                lineTo(5.25f, 18.5f)
                horizontalLineTo(18.75f)
                curveTo(19.6682f, 18.5f, 20.4212f, 17.7929f, 20.4942f, 16.8935f)
                lineTo(20.5f, 16.75f)
                close()
            }
        }
        .build()
        return _mailAdd!!
    }

private var _mailAdd: ImageVector? = null
