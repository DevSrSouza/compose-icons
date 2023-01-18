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

public val FilledGroup.Bot: ImageVector
    get() {
        if (_bot != null) {
            return _bot!!
        }
        _bot = Builder(name = "Bot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7534f, 13.9994f)
                curveTo(18.9961f, 13.9994f, 20.0034f, 15.0068f, 20.0034f, 16.2494f)
                verticalLineTo(17.1545f)
                curveTo(20.0034f, 18.2482f, 19.526f, 19.2874f, 18.6961f, 19.9998f)
                curveTo(17.1307f, 21.3437f, 14.8904f, 22.0006f, 12.0004f, 22.0006f)
                curveTo(9.1109f, 22.0006f, 6.872f, 21.344f, 5.3092f, 20.0003f)
                curveTo(4.4806f, 19.2879f, 4.0039f, 18.2495f, 4.0039f, 17.1567f)
                verticalLineTo(16.2494f)
                curveTo(4.0039f, 15.0068f, 5.0113f, 13.9994f, 6.2539f, 13.9994f)
                horizontalLineTo(17.7534f)
                close()
                moveTo(11.8989f, 2.0069f)
                lineTo(12.0007f, 2.0f)
                curveTo(12.3804f, 2.0f, 12.6942f, 2.2822f, 12.7438f, 2.6482f)
                lineTo(12.7507f, 2.75f)
                lineTo(12.7499f, 3.499f)
                lineTo(16.2504f, 3.4995f)
                curveTo(17.493f, 3.4995f, 18.5004f, 4.5069f, 18.5004f, 5.7495f)
                verticalLineTo(10.2541f)
                curveTo(18.5004f, 11.4967f, 17.493f, 12.5041f, 16.2504f, 12.5041f)
                horizontalLineTo(7.7504f)
                curveTo(6.5077f, 12.5041f, 5.5004f, 11.4967f, 5.5004f, 10.2541f)
                verticalLineTo(5.7495f)
                curveTo(5.5004f, 4.5069f, 6.5077f, 3.4995f, 7.7504f, 3.4995f)
                lineTo(11.2499f, 3.499f)
                lineTo(11.2507f, 2.75f)
                curveTo(11.2507f, 2.3703f, 11.5328f, 2.0565f, 11.8989f, 2.0069f)
                lineTo(12.0007f, 2.0f)
                lineTo(11.8989f, 2.0069f)
                close()
                moveTo(9.7497f, 6.4995f)
                curveTo(9.0597f, 6.4995f, 8.5004f, 7.0588f, 8.5004f, 7.7488f)
                curveTo(8.5004f, 8.4388f, 9.0597f, 8.9981f, 9.7497f, 8.9981f)
                curveTo(10.4396f, 8.9981f, 10.9989f, 8.4388f, 10.9989f, 7.7488f)
                curveTo(10.9989f, 7.0588f, 10.4396f, 6.4995f, 9.7497f, 6.4995f)
                close()
                moveTo(14.2424f, 6.4995f)
                curveTo(13.5524f, 6.4995f, 12.9931f, 7.0588f, 12.9931f, 7.7488f)
                curveTo(12.9931f, 8.4388f, 13.5524f, 8.9981f, 14.2424f, 8.9981f)
                curveTo(14.9324f, 8.9981f, 15.4917f, 8.4388f, 15.4917f, 7.7488f)
                curveTo(15.4917f, 7.0588f, 14.9324f, 6.4995f, 14.2424f, 6.4995f)
                close()
            }
        }
        .build()
        return _bot!!
    }

private var _bot: ImageVector? = null
