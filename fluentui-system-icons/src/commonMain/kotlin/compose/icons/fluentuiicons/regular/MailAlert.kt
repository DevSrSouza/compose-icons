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

public val RegularGroup.MailAlert: ImageVector
    get() {
        if (_mailAlert != null) {
            return _mailAlert!!
        }
        _mailAlert = Builder(name = "MailAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5025f, 1.0f)
                curveTo(15.2934f, 1.0f, 13.5025f, 2.7909f, 13.5025f, 5.0f)
                lineTo(13.5023f, 8.0f)
                lineTo(12.5539f, 8.8004f)
                curveTo(12.2462f, 9.06f, 12.0923f, 9.1899f, 12.0457f, 9.2913f)
                curveTo(11.9312f, 9.5407f, 12.0391f, 9.8358f, 12.2875f, 9.9525f)
                curveTo(12.3885f, 10.0f, 12.5898f, 10.0f, 12.9925f, 10.0f)
                horizontalLineTo(22.0121f)
                curveTo(22.4148f, 10.0f, 22.6162f, 10.0f, 22.7172f, 9.9525f)
                curveTo(22.9656f, 9.8358f, 23.0735f, 9.5407f, 22.9589f, 9.2913f)
                curveTo(22.9123f, 9.1899f, 22.7584f, 9.06f, 22.4507f, 8.8003f)
                lineTo(21.5025f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(21.5025f, 2.7909f, 19.7116f, 1.0f, 17.5025f, 1.0f)
                close()
                moveTo(19.0025f, 11.0f)
                curveTo(18.7842f, 11.5826f, 18.195f, 12.0f, 17.5025f, 12.0f)
                curveTo(16.81f, 12.0f, 16.2208f, 11.5826f, 16.0025f, 11.0f)
                horizontalLineTo(19.0025f)
                close()
                moveTo(22.0f, 16.75f)
                verticalLineTo(11.0f)
                lineTo(20.5f, 11.0f)
                verticalLineTo(16.75f)
                lineTo(20.4942f, 16.8935f)
                curveTo(20.4212f, 17.7929f, 19.6682f, 18.5f, 18.75f, 18.5f)
                horizontalLineTo(5.25f)
                lineTo(5.1065f, 18.4942f)
                curveTo(4.2071f, 18.4212f, 3.5f, 17.6682f, 3.5f, 16.75f)
                verticalLineTo(9.374f)
                lineTo(11.6507f, 13.6637f)
                lineTo(11.7468f, 13.706f)
                curveTo(11.9431f, 13.7764f, 12.1619f, 13.7623f, 12.3493f, 13.6637f)
                lineTo(15.4503f, 12.0313f)
                curveTo(15.2878f, 11.8289f, 15.1559f, 11.6003f, 15.0624f, 11.3509f)
                lineTo(14.9309f, 11.0f)
                lineTo(14.1893f, 11.0f)
                lineTo(12.0f, 12.1525f)
                lineTo(3.5f, 7.679f)
                verticalLineTo(7.25f)
                lineTo(3.5058f, 7.1065f)
                curveTo(3.5788f, 6.2071f, 4.3318f, 5.5f, 5.25f, 5.5f)
                horizontalLineTo(12.4988f)
                lineTo(12.4988f, 5.0f)
                curveTo(12.4988f, 4.6575f, 12.5333f, 4.3231f, 12.5989f, 4.0f)
                horizontalLineTo(5.25f)
                lineTo(5.0656f, 4.0051f)
                curveTo(3.3565f, 4.1007f, 2.0f, 5.517f, 2.0f, 7.25f)
                verticalLineTo(16.75f)
                lineTo(2.0051f, 16.9344f)
                curveTo(2.1007f, 18.6435f, 3.517f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(18.75f)
                lineTo(18.9344f, 19.9949f)
                curveTo(20.6435f, 19.8992f, 22.0f, 18.483f, 22.0f, 16.75f)
                close()
            }
        }
        .build()
        return _mailAlert!!
    }

private var _mailAlert: ImageVector? = null
