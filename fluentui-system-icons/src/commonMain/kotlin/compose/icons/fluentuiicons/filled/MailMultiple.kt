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

public val FilledGroup.MailMultiple: ImageVector
    get() {
        if (_mailMultiple != null) {
            return _mailMultiple!!
        }
        _mailMultiple = Builder(name = "MailMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0005f, 7.5113f)
                curveTo(21.9023f, 8.0889f, 22.5f, 9.0996f, 22.5f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(22.5f, 19.1495f, 20.1495f, 21.5f, 17.25f, 21.5f)
                horizontalLineTo(8.25f)
                curveTo(7.0996f, 21.5f, 6.0889f, 20.9023f, 5.5113f, 20.0005f)
                lineTo(17.25f, 20.0f)
                curveTo(19.3211f, 20.0f, 21.0f, 18.3211f, 21.0f, 16.25f)
                lineTo(21.0005f, 7.5113f)
                close()
                moveTo(20.0f, 8.11f)
                verticalLineTo(15.75f)
                curveTo(20.0f, 17.483f, 18.6435f, 18.8992f, 16.9344f, 18.9949f)
                lineTo(16.75f, 19.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 19.0f, 2.1007f, 17.6435f, 2.0051f, 15.9344f)
                lineTo(2.0f, 15.75f)
                verticalLineTo(8.11f)
                lineTo(10.6507f, 12.6637f)
                curveTo(10.8693f, 12.7788f, 11.1307f, 12.7788f, 11.3493f, 12.6637f)
                lineTo(20.0f, 8.11f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineTo(16.75f)
                curveTo(18.2747f, 4.0f, 19.5541f, 5.0499f, 19.9049f, 6.4662f)
                lineTo(11.0f, 11.1525f)
                lineTo(2.0951f, 6.4662f)
                curveTo(2.4313f, 5.1089f, 3.6203f, 4.0881f, 5.0607f, 4.0054f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        .build()
        return _mailMultiple!!
    }

private var _mailMultiple: ImageVector? = null
