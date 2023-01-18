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

public val FilledGroup.MailCopy: ImageVector
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
                moveTo(4.0f, 8.11f)
                verticalLineTo(15.75f)
                curveTo(4.0f, 17.483f, 5.3565f, 18.8992f, 7.0656f, 18.9949f)
                lineTo(7.25f, 19.0f)
                horizontalLineTo(18.75f)
                curveTo(20.483f, 19.0f, 21.8992f, 17.6435f, 21.9949f, 15.9344f)
                lineTo(22.0f, 15.75f)
                verticalLineTo(8.11f)
                lineTo(13.3493f, 12.6637f)
                curveTo(13.1307f, 12.7788f, 12.8693f, 12.7788f, 12.6507f, 12.6637f)
                lineTo(4.0f, 8.11f)
                close()
                moveTo(18.75f, 4.0f)
                horizontalLineTo(7.25f)
                curveTo(5.7253f, 4.0f, 4.4459f, 5.0499f, 4.0951f, 6.4662f)
                lineTo(13.0f, 11.1525f)
                lineTo(21.9049f, 6.4662f)
                curveTo(21.5688f, 5.1089f, 20.3797f, 4.0881f, 18.9393f, 4.0054f)
                lineTo(18.75f, 4.0f)
                close()
            }
        }
        .build()
        return _mailCopy!!
    }

private var _mailCopy: ImageVector? = null
