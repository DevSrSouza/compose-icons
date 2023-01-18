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

public val RegularGroup.MailRead: ImageVector
    get() {
        if (_mailRead != null) {
            return _mailRead!!
        }
        _mailRead = Builder(name = "MailRead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1001f, 8.1693f)
                lineTo(11.6167f, 3.1054f)
                curveTo(11.8192f, 2.985f, 12.0642f, 2.9678f, 12.2789f, 3.0538f)
                lineTo(12.3833f, 3.1054f)
                lineTo(20.8999f, 8.1693f)
                curveTo(21.5333f, 8.5459f, 21.9389f, 9.2064f, 21.9937f, 9.9342f)
                lineTo(22.0f, 10.1032f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 19.483f, 20.6435f, 20.8992f, 18.9344f, 20.9949f)
                lineTo(18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 21.0f, 2.1007f, 19.6435f, 2.0051f, 17.9344f)
                lineTo(2.0f, 17.75f)
                verticalLineTo(10.1032f)
                curveTo(2.0f, 9.3664f, 2.3604f, 8.6801f, 2.958f, 8.2611f)
                lineTo(3.1001f, 8.1693f)
                lineTo(11.6167f, 3.1054f)
                lineTo(3.1001f, 8.1693f)
                close()
                moveTo(20.5f, 10.91f)
                lineTo(12.3469f, 15.1649f)
                curveTo(12.1658f, 15.2595f, 11.9557f, 15.2752f, 11.7649f, 15.2122f)
                lineTo(11.6531f, 15.1649f)
                lineTo(3.5f, 10.91f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.6682f, 4.2071f, 19.4212f, 5.1065f, 19.4942f)
                lineTo(5.25f, 19.5f)
                horizontalLineTo(18.75f)
                curveTo(19.6682f, 19.5f, 20.4212f, 18.7929f, 20.4942f, 17.8935f)
                lineTo(20.5f, 17.75f)
                verticalLineTo(10.91f)
                close()
                moveTo(12.0f, 4.6226f)
                lineTo(3.908f, 9.433f)
                lineTo(12.0f, 13.6541f)
                lineTo(20.09f, 9.432f)
                lineTo(12.0f, 4.6226f)
                close()
            }
        }
        .build()
        return _mailRead!!
    }

private var _mailRead: ImageVector? = null
