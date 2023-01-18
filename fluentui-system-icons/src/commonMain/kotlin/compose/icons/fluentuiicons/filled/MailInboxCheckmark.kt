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

public val FilledGroup.MailInboxCheckmark: ImageVector
    get() {
        if (_mailInboxCheckmark != null) {
            return _mailInboxCheckmark!!
        }
        _mailInboxCheckmark = Builder(name = "MailInboxCheckmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.5f)
                curveTo(22.0f, 9.5376f, 19.5376f, 12.0f, 16.5f, 12.0f)
                curveTo(13.4624f, 12.0f, 11.0f, 9.5376f, 11.0f, 6.5f)
                curveTo(11.0f, 3.4624f, 13.4624f, 1.0f, 16.5f, 1.0f)
                curveTo(19.5376f, 1.0f, 22.0f, 3.4624f, 22.0f, 6.5f)
                close()
                moveTo(19.8536f, 4.1465f)
                curveTo(19.6583f, 3.9512f, 19.3417f, 3.9512f, 19.1464f, 4.1465f)
                lineTo(15.5f, 7.7929f)
                lineTo(13.8536f, 6.1465f)
                curveTo(13.6583f, 5.9512f, 13.3417f, 5.9512f, 13.1464f, 6.1465f)
                curveTo(12.9512f, 6.3417f, 12.9512f, 6.6583f, 13.1464f, 6.8535f)
                lineTo(15.1464f, 8.8535f)
                curveTo(15.3417f, 9.0488f, 15.6583f, 9.0488f, 15.8536f, 8.8535f)
                lineTo(19.8536f, 4.8535f)
                curveTo(20.0488f, 4.6583f, 20.0488f, 4.3417f, 19.8536f, 4.1465f)
                close()
                moveTo(19.5f, 12.2678f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 14.0f, 14.25f, 14.3358f, 14.25f, 14.75f)
                curveTo(14.25f, 15.9926f, 13.2426f, 17.0f, 12.0f, 17.0f)
                curveTo(10.7574f, 17.0f, 9.75f, 15.9926f, 9.75f, 14.75f)
                lineTo(9.7431f, 14.6482f)
                curveTo(9.6935f, 14.2822f, 9.3797f, 14.0f, 9.0f, 14.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 6.2835f, 5.2835f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(10.0764f)
                curveTo(10.1572f, 4.9768f, 10.3004f, 4.4742f, 10.4982f, 4.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 4.0f, 3.0f, 5.4551f, 3.0f, 7.25f)
                verticalLineTo(18.75f)
                curveTo(3.0f, 20.5449f, 4.4551f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 22.0f, 21.0f, 20.5449f, 21.0f, 18.75f)
                verticalLineTo(11.1904f)
                curveTo(20.5557f, 11.6168f, 20.051f, 11.9806f, 19.5f, 12.2678f)
                close()
            }
        }
        .build()
        return _mailInboxCheckmark!!
    }

private var _mailInboxCheckmark: ImageVector? = null
