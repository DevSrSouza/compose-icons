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

public val FilledGroup.MailUnread: ImageVector
    get() {
        if (_mailUnread != null) {
            return _mailUnread!!
        }
        _mailUnread = Builder(name = "MailUnread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.11f)
                lineTo(10.6507f, 13.6637f)
                curveTo(10.8693f, 13.7788f, 11.1307f, 13.7788f, 11.3493f, 13.6637f)
                lineTo(18.5564f, 9.8713f)
                curveTo(18.8566f, 9.9552f, 19.1731f, 10.0f, 19.5f, 10.0f)
                curveTo(19.6701f, 10.0f, 19.8373f, 9.9879f, 20.0009f, 9.9644f)
                lineTo(20.0f, 16.75f)
                curveTo(20.0f, 18.483f, 18.6435f, 19.8992f, 16.9344f, 19.9949f)
                lineTo(16.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(9.11f)
                close()
                moveTo(16.337f, 4.9996f)
                curveTo(16.1209f, 5.4543f, 16.0f, 5.9631f, 16.0f, 6.5f)
                curveTo(16.0f, 7.469f, 16.3938f, 8.346f, 17.03f, 8.9798f)
                lineTo(11.0f, 12.1525f)
                lineTo(2.0951f, 7.4662f)
                curveTo(2.4313f, 6.1089f, 3.6203f, 5.0881f, 5.0607f, 5.0054f)
                lineTo(5.25f, 5.0f)
                lineTo(16.337f, 4.9996f)
                close()
                moveTo(19.5f, 4.0f)
                curveTo(20.8807f, 4.0f, 22.0f, 5.1193f, 22.0f, 6.5f)
                curveTo(22.0f, 7.8807f, 20.8807f, 9.0f, 19.5f, 9.0f)
                curveTo(18.1193f, 9.0f, 17.0f, 7.8807f, 17.0f, 6.5f)
                curveTo(17.0f, 5.1193f, 18.1193f, 4.0f, 19.5f, 4.0f)
                close()
            }
        }
        .build()
        return _mailUnread!!
    }

private var _mailUnread: ImageVector? = null
