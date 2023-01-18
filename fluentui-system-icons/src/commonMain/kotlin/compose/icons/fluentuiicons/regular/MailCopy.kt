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

public val RegularGroup.MailCopy: ImageVector
    get() {
        if (_mailCopy != null) {
            return _mailCopy!!
        }
        _mailCopy = Builder(name = "MailCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9995f, 7.5113f)
                curveTo(2.0977f, 8.0889f, 1.5f, 9.0996f, 1.5f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(1.5f, 19.1495f, 3.8505f, 21.5f, 6.75f, 21.5f)
                horizontalLineTo(15.75f)
                curveTo(16.9004f, 21.5f, 17.9112f, 20.9023f, 18.4887f, 20.0005f)
                lineTo(6.75f, 20.0f)
                curveTo(4.6789f, 20.0f, 3.0f, 18.3211f, 3.0f, 16.25f)
                lineTo(2.9995f, 7.5113f)
                close()
                moveTo(18.75f, 4.0f)
                horizontalLineTo(7.25f)
                curveTo(5.517f, 4.0f, 4.1007f, 5.3565f, 4.0051f, 7.0656f)
                lineTo(4.0f, 7.25f)
                verticalLineTo(15.75f)
                curveTo(4.0f, 17.483f, 5.3565f, 18.8992f, 7.0656f, 18.9949f)
                lineTo(7.25f, 19.0f)
                horizontalLineTo(18.75f)
                curveTo(20.483f, 19.0f, 21.8992f, 17.6435f, 21.9949f, 15.9344f)
                lineTo(22.0f, 15.75f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 5.517f, 20.6435f, 4.1007f, 18.9344f, 4.0051f)
                lineTo(18.75f, 4.0f)
                close()
                moveTo(5.5f, 8.899f)
                lineTo(12.6507f, 12.6637f)
                curveTo(12.8381f, 12.7623f, 13.0569f, 12.7764f, 13.2532f, 12.706f)
                lineTo(13.3493f, 12.6637f)
                lineTo(20.5f, 8.9f)
                verticalLineTo(15.75f)
                curveTo(20.5f, 16.6682f, 19.7929f, 17.4212f, 18.8935f, 17.4942f)
                lineTo(18.75f, 17.5f)
                horizontalLineTo(7.25f)
                curveTo(6.3318f, 17.5f, 5.5788f, 16.7929f, 5.5058f, 15.8935f)
                lineTo(5.5f, 15.75f)
                verticalLineTo(8.899f)
                close()
                moveTo(7.25f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.6682f, 5.5f, 20.4212f, 6.2071f, 20.4942f, 7.1065f)
                lineTo(20.498f, 7.206f)
                lineTo(13.0f, 11.1525f)
                lineTo(5.5006f, 7.2048f)
                curveTo(5.5245f, 6.2592f, 6.2986f, 5.5f, 7.25f, 5.5f)
                close()
            }
        }
        .build()
        return _mailCopy!!
    }

private var _mailCopy: ImageVector? = null
