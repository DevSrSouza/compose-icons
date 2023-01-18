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

public val RegularGroup.MailUnread: ImageVector
    get() {
        if (_mailUnread != null) {
            return _mailUnread!!
        }
        _mailUnread = Builder(name = "MailUnread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.5f)
                horizontalLineTo(5.25f)
                curveTo(4.3318f, 6.5f, 3.5788f, 7.2071f, 3.5058f, 8.1065f)
                lineTo(3.502f, 8.206f)
                lineTo(11.0f, 12.1525f)
                lineTo(17.0291f, 8.9788f)
                curveTo(17.6621f, 9.6099f, 18.5355f, 10.0f, 19.5f, 10.0f)
                curveTo(19.6701f, 10.0f, 19.8373f, 9.9879f, 20.0009f, 9.9644f)
                lineTo(20.0f, 16.75f)
                curveTo(20.0f, 18.483f, 18.6435f, 19.8992f, 16.9344f, 19.9949f)
                lineTo(16.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 6.517f, 3.3565f, 5.1007f, 5.0656f, 5.0051f)
                lineTo(5.25f, 5.0f)
                horizontalLineTo(16.3368f)
                curveTo(16.1209f, 5.4546f, 16.0f, 5.9632f, 16.0f, 6.5f)
                close()
                moveTo(18.5f, 9.899f)
                lineTo(11.3493f, 13.6637f)
                curveTo(11.1619f, 13.7623f, 10.9431f, 13.7764f, 10.7468f, 13.706f)
                lineTo(10.6507f, 13.6637f)
                lineTo(3.5f, 9.9f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.6682f, 4.2071f, 18.4212f, 5.1065f, 18.4942f)
                lineTo(5.25f, 18.5f)
                horizontalLineTo(16.75f)
                curveTo(17.6682f, 18.5f, 18.4212f, 17.7929f, 18.4942f, 16.8935f)
                lineTo(18.5f, 16.75f)
                verticalLineTo(9.899f)
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
