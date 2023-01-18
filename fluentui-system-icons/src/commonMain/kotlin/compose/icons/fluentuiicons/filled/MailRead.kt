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

public val FilledGroup.MailRead: ImageVector
    get() {
        if (_mailRead != null) {
            return _mailRead!!
        }
        _mailRead = Builder(name = "MailRead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9998f, 10.127f)
                lineTo(11.653f, 15.1649f)
                curveTo(11.8704f, 15.2784f, 12.1295f, 15.2784f, 12.3468f, 15.1649f)
                lineTo(21.9999f, 10.128f)
                verticalLineTo(17.75f)
                curveTo(21.9999f, 19.483f, 20.6435f, 20.8992f, 18.9343f, 20.9949f)
                lineTo(18.7499f, 21.0f)
                horizontalLineTo(5.2499f)
                curveTo(3.5169f, 21.0f, 2.1007f, 19.6435f, 2.005f, 17.9344f)
                lineTo(1.9998f, 17.75f)
                verticalLineTo(10.127f)
                close()
                moveTo(3.1f, 8.1693f)
                lineTo(11.6166f, 3.1054f)
                curveTo(11.8191f, 2.985f, 12.0641f, 2.9678f, 12.2788f, 3.0538f)
                lineTo(12.3832f, 3.1054f)
                lineTo(20.8998f, 8.1693f)
                curveTo(21.1349f, 8.3091f, 21.3386f, 8.488f, 21.5047f, 8.6949f)
                lineTo(11.9999f, 13.6541f)
                lineTo(2.4951f, 8.6949f)
                curveTo(2.6197f, 8.5397f, 2.7654f, 8.4003f, 2.9297f, 8.2813f)
                lineTo(3.1f, 8.1693f)
                lineTo(11.6166f, 3.1054f)
                lineTo(3.1f, 8.1693f)
                close()
            }
        }
        .build()
        return _mailRead!!
    }

private var _mailRead: ImageVector? = null
