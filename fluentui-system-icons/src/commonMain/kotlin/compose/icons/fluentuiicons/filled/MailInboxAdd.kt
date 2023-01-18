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

public val FilledGroup.MailInboxAdd: ImageVector
    get() {
        if (_mailInboxAdd != null) {
            return _mailInboxAdd!!
        }
        _mailInboxAdd = Builder(name = "MailInboxAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.5f)
                curveTo(22.0f, 3.4624f, 19.5376f, 1.0f, 16.5f, 1.0f)
                curveTo(13.4624f, 1.0f, 11.0f, 3.4624f, 11.0f, 6.5f)
                curveTo(11.0f, 9.5376f, 13.4624f, 12.0f, 16.5f, 12.0f)
                curveTo(19.5376f, 12.0f, 22.0f, 9.5376f, 22.0f, 6.5f)
                close()
                moveTo(17.0006f, 7.0f)
                lineTo(17.0011f, 9.5035f)
                curveTo(17.0011f, 9.7797f, 16.7773f, 10.0035f, 16.5011f, 10.0035f)
                curveTo(16.225f, 10.0035f, 16.0011f, 9.7797f, 16.0011f, 9.5035f)
                lineTo(16.0006f, 7.0f)
                horizontalLineTo(13.4961f)
                curveTo(13.22f, 7.0f, 12.9961f, 6.7762f, 12.9961f, 6.5f)
                curveTo(12.9961f, 6.2239f, 13.22f, 6.0f, 13.4961f, 6.0f)
                horizontalLineTo(16.0005f)
                lineTo(16.0f, 3.4993f)
                curveTo(16.0f, 3.2231f, 16.2239f, 2.9993f, 16.5f, 2.9993f)
                curveTo(16.7761f, 2.9993f, 17.0f, 3.2231f, 17.0f, 3.4993f)
                lineTo(17.0005f, 6.0f)
                horizontalLineTo(19.503f)
                curveTo(19.7792f, 6.0f, 20.003f, 6.2239f, 20.003f, 6.5f)
                curveTo(20.003f, 6.7762f, 19.7792f, 7.0f, 19.503f, 7.0f)
                horizontalLineTo(17.0006f)
                close()
                moveTo(19.5f, 14.0f)
                verticalLineTo(12.2678f)
                curveTo(20.051f, 11.9806f, 20.5557f, 11.6168f, 21.0f, 11.1904f)
                verticalLineTo(18.75f)
                curveTo(21.0f, 20.5449f, 19.5449f, 22.0f, 17.75f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 22.0f, 3.0f, 20.5449f, 3.0f, 18.75f)
                verticalLineTo(7.25f)
                curveTo(3.0f, 5.4551f, 4.4551f, 4.0f, 6.25f, 4.0f)
                horizontalLineTo(10.4982f)
                curveTo(10.3004f, 4.4742f, 10.1572f, 4.9768f, 10.0764f, 5.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 5.5f, 4.5f, 6.2835f, 4.5f, 7.25f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                curveTo(9.3797f, 14.0f, 9.6935f, 14.2822f, 9.7431f, 14.6482f)
                lineTo(9.75f, 14.75f)
                curveTo(9.75f, 15.9926f, 10.7574f, 17.0f, 12.0f, 17.0f)
                curveTo(13.2426f, 17.0f, 14.25f, 15.9926f, 14.25f, 14.75f)
                curveTo(14.25f, 14.3358f, 14.5858f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _mailInboxAdd!!
    }

private var _mailInboxAdd: ImageVector? = null
