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

public val RegularGroup.MailMultiple: ImageVector
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
                moveTo(5.25f, 4.0f)
                horizontalLineTo(16.75f)
                curveTo(18.483f, 4.0f, 19.8992f, 5.3565f, 19.9949f, 7.0656f)
                lineTo(20.0f, 7.25f)
                verticalLineTo(15.75f)
                curveTo(20.0f, 17.483f, 18.6435f, 18.8992f, 16.9344f, 18.9949f)
                lineTo(16.75f, 19.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 19.0f, 2.1007f, 17.6435f, 2.0051f, 15.9344f)
                lineTo(2.0f, 15.75f)
                verticalLineTo(7.25f)
                curveTo(2.0f, 5.517f, 3.3565f, 4.1007f, 5.0656f, 4.0051f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(18.5f, 8.899f)
                lineTo(11.3493f, 12.6637f)
                curveTo(11.1619f, 12.7623f, 10.9431f, 12.7764f, 10.7468f, 12.706f)
                lineTo(10.6507f, 12.6637f)
                lineTo(3.5f, 8.9f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.6682f, 4.2071f, 17.4212f, 5.1065f, 17.4942f)
                lineTo(5.25f, 17.5f)
                horizontalLineTo(16.75f)
                curveTo(17.6682f, 17.5f, 18.4212f, 16.7929f, 18.4942f, 15.8935f)
                lineTo(18.5f, 15.75f)
                verticalLineTo(8.899f)
                close()
                moveTo(16.75f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.3318f, 5.5f, 3.5788f, 6.2071f, 3.5058f, 7.1065f)
                lineTo(3.502f, 7.206f)
                lineTo(11.0f, 11.1525f)
                lineTo(18.4994f, 7.2048f)
                curveTo(18.4755f, 6.2592f, 17.7014f, 5.5f, 16.75f, 5.5f)
                close()
            }
        }
        .build()
        return _mailMultiple!!
    }

private var _mailMultiple: ImageVector? = null
