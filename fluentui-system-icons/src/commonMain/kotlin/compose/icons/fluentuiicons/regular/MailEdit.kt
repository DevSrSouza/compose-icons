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

public val RegularGroup.MailEdit: ImageVector
    get() {
        if (_mailEdit != null) {
            return _mailEdit!!
        }
        _mailEdit = Builder(name = "MailEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 3.0f)
                horizontalLineTo(5.25f)
                lineTo(5.0656f, 3.0051f)
                curveTo(3.3565f, 3.1007f, 2.0f, 4.517f, 2.0f, 6.25f)
                verticalLineTo(15.75f)
                lineTo(2.0051f, 15.9344f)
                curveTo(2.1007f, 17.6435f, 3.517f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(11.717f)
                curveTo(11.9006f, 18.5781f, 12.1624f, 18.1927f, 12.4903f, 17.8648f)
                lineTo(12.855f, 17.5f)
                horizontalLineTo(5.25f)
                lineTo(5.1065f, 17.4942f)
                curveTo(4.2071f, 17.4212f, 3.5f, 16.6682f, 3.5f, 15.75f)
                verticalLineTo(8.374f)
                lineTo(11.6507f, 12.6637f)
                lineTo(11.7468f, 12.706f)
                curveTo(11.9431f, 12.7764f, 12.1619f, 12.7623f, 12.3493f, 12.6637f)
                lineTo(20.5f, 8.373f)
                verticalLineTo(11.0071f)
                curveTo(21.0085f, 10.9738f, 21.5233f, 11.0582f, 22.0f, 11.2603f)
                verticalLineTo(6.25f)
                lineTo(21.9949f, 6.0656f)
                curveTo(21.8992f, 4.3565f, 20.483f, 3.0f, 18.75f, 3.0f)
                close()
                moveTo(5.25f, 4.5f)
                horizontalLineTo(18.75f)
                lineTo(18.8935f, 4.5058f)
                curveTo(19.7929f, 4.5788f, 20.5f, 5.3318f, 20.5f, 6.25f)
                verticalLineTo(6.678f)
                lineTo(12.0f, 11.1525f)
                lineTo(3.5f, 6.679f)
                verticalLineTo(6.25f)
                lineTo(3.5058f, 6.1065f)
                curveTo(3.5788f, 5.2071f, 4.3318f, 4.5f, 5.25f, 4.5f)
                close()
                moveTo(19.0999f, 12.6695f)
                lineTo(13.1974f, 18.5719f)
                curveTo(12.8533f, 18.916f, 12.6092f, 19.3472f, 12.4911f, 19.8194f)
                lineTo(12.0334f, 21.6501f)
                curveTo(11.8344f, 22.4462f, 12.5556f, 23.1674f, 13.3517f, 22.9683f)
                lineTo(15.1824f, 22.5106f)
                curveTo(15.6545f, 22.3926f, 16.0857f, 22.1485f, 16.4299f, 21.8043f)
                lineTo(22.3323f, 15.9019f)
                curveTo(23.2249f, 15.0093f, 23.2249f, 13.5621f, 22.3323f, 12.6695f)
                curveTo(21.4397f, 11.7768f, 19.9925f, 11.7768f, 19.0999f, 12.6695f)
                close()
            }
        }
        .build()
        return _mailEdit!!
    }

private var _mailEdit: ImageVector? = null
