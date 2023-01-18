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

public val FilledGroup.PhoneAdd: ImageVector
    get() {
        if (_phoneAdd != null) {
            return _phoneAdd!!
        }
        _phoneAdd = Builder(name = "PhoneAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.9926f, 2.0f, 16.0f, 3.0074f, 16.0f, 4.25f)
                lineTo(16.0002f, 11.1739f)
                curveTo(13.1334f, 11.851f, 11.0f, 14.4264f, 11.0f, 17.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 17.5f, 8.0f, 17.8358f, 8.0f, 18.25f)
                curveTo(8.0f, 18.6642f, 8.3358f, 19.0f, 8.75f, 19.0f)
                lineTo(11.1741f, 19.0008f)
                curveTo(11.4453f, 20.1483f, 12.0207f, 21.1782f, 12.8104f, 22.0008f)
                lineTo(6.25f, 22.0f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(17.5f, 13.9992f)
                lineTo(17.4101f, 14.0073f)
                curveTo(17.206f, 14.0443f, 17.0451f, 14.2053f, 17.0081f, 14.4094f)
                lineTo(17.0f, 14.4992f)
                lineTo(16.9996f, 16.9992f)
                lineTo(14.4977f, 17.0f)
                lineTo(14.4078f, 17.0081f)
                curveTo(14.2037f, 17.0451f, 14.0427f, 17.206f, 14.0057f, 17.4101f)
                lineTo(13.9977f, 17.5f)
                lineTo(14.0057f, 17.5899f)
                curveTo(14.0427f, 17.794f, 14.2037f, 17.9549f, 14.4078f, 17.9919f)
                lineTo(14.4977f, 18.0f)
                lineTo(17.0007f, 17.9992f)
                lineTo(17.0011f, 20.5035f)
                lineTo(17.0092f, 20.5934f)
                curveTo(17.0462f, 20.7975f, 17.2071f, 20.9584f, 17.4112f, 20.9954f)
                lineTo(17.5011f, 21.0035f)
                lineTo(17.591f, 20.9954f)
                curveTo(17.7951f, 20.9584f, 17.956f, 20.7975f, 17.9931f, 20.5934f)
                lineTo(18.0011f, 20.5035f)
                lineTo(18.0007f, 17.9992f)
                lineTo(20.5046f, 18.0f)
                lineTo(20.5944f, 17.9919f)
                curveTo(20.7985f, 17.9549f, 20.9595f, 17.794f, 20.9965f, 17.5899f)
                lineTo(21.0046f, 17.5f)
                lineTo(20.9965f, 17.4101f)
                curveTo(20.9595f, 17.206f, 20.7985f, 17.0451f, 20.5944f, 17.0081f)
                lineTo(20.5046f, 17.0f)
                lineTo(17.9996f, 16.9992f)
                lineTo(18.0f, 14.4992f)
                lineTo(17.9919f, 14.4094f)
                curveTo(17.9549f, 14.2053f, 17.794f, 14.0443f, 17.5899f, 14.0073f)
                lineTo(17.5f, 13.9992f)
                close()
            }
        }
        .build()
        return _phoneAdd!!
    }

private var _phoneAdd: ImageVector? = null
