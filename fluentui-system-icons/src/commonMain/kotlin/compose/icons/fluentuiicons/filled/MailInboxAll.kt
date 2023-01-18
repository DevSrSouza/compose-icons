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

public val FilledGroup.MailInboxAll: ImageVector
    get() {
        if (_mailInboxAll != null) {
            return _mailInboxAll!!
        }
        _mailInboxAll = Builder(name = "MailInboxAll", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(13.1909f, 16.0f, 14.1656f, 15.0748f, 14.2448f, 13.904f)
                lineTo(14.25f, 13.75f)
                curveTo(14.25f, 13.3358f, 14.5858f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.3318f, 18.7929f, 4.5788f, 17.8935f, 4.5058f)
                lineTo(17.75f, 4.5f)
                close()
                moveTo(6.75f, 9.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 9.5f, 18.0f, 9.8358f, 18.0f, 10.25f)
                curveTo(18.0f, 10.6297f, 17.7178f, 10.9435f, 17.3518f, 10.9932f)
                lineTo(17.25f, 11.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 11.0f, 6.0f, 10.6642f, 6.0f, 10.25f)
                curveTo(6.0f, 9.8703f, 6.2821f, 9.5565f, 6.6482f, 9.5069f)
                lineTo(6.75f, 9.5f)
                horizontalLineTo(17.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.75f, 6.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 6.5f, 18.0f, 6.8358f, 18.0f, 7.25f)
                curveTo(18.0f, 7.6297f, 17.7178f, 7.9435f, 17.3518f, 7.9932f)
                lineTo(17.25f, 8.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 8.0f, 6.0f, 7.6642f, 6.0f, 7.25f)
                curveTo(6.0f, 6.8703f, 6.2821f, 6.5565f, 6.6482f, 6.5068f)
                lineTo(6.75f, 6.5f)
                horizontalLineTo(17.25f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _mailInboxAll!!
    }

private var _mailInboxAll: ImageVector? = null
