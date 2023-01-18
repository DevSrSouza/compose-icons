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

public val FilledGroup.MailInbox: ImageVector
    get() {
        if (_mailInbox != null) {
            return _mailInbox!!
        }
        _mailInbox = Builder(name = "MailInbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                curveTo(9.3797f, 13.0f, 9.6935f, 13.2822f, 9.7431f, 13.6482f)
                lineTo(9.75f, 13.75f)
                curveTo(9.75f, 14.9926f, 10.7574f, 16.0f, 12.0f, 16.0f)
                curveTo(13.2426f, 16.0f, 14.25f, 14.9926f, 14.25f, 13.75f)
                curveTo(14.25f, 13.3358f, 14.5858f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.3318f, 18.7929f, 4.5788f, 17.8935f, 4.5058f)
                lineTo(17.75f, 4.5f)
                close()
            }
        }
        .build()
        return _mailInbox!!
    }

private var _mailInbox: ImageVector? = null
