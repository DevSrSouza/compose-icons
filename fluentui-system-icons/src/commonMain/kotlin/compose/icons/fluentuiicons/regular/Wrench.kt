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

public val RegularGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5001f, 7.751f)
                curveTo(10.5001f, 4.5753f, 13.0745f, 2.001f, 16.2501f, 2.001f)
                curveTo(17.196f, 2.001f, 18.0906f, 2.23f, 18.8794f, 2.6362f)
                curveTo(19.0924f, 2.7458f, 19.2401f, 2.9506f, 19.2771f, 3.1872f)
                curveTo(19.314f, 3.4239f, 19.2358f, 3.6639f, 19.0664f, 3.8333f)
                lineTo(16.3006f, 6.5991f)
                lineTo(17.3613f, 7.6597f)
                lineTo(20.1398f, 4.8812f)
                curveTo(20.3081f, 4.713f, 20.5461f, 4.6345f, 20.7814f, 4.6698f)
                curveTo(21.0167f, 4.7051f, 21.2213f, 4.8499f, 21.3327f, 5.0601f)
                curveTo(21.759f, 5.8637f, 22.0001f, 6.7803f, 22.0001f, 7.751f)
                curveTo(22.0001f, 10.9266f, 19.4258f, 13.501f, 16.2501f, 13.501f)
                curveTo(15.7895f, 13.501f, 15.3408f, 13.4467f, 14.9104f, 13.3439f)
                lineTo(7.5455f, 20.9628f)
                curveTo(6.4237f, 22.1232f, 4.5921f, 22.2091f, 3.3667f, 21.1587f)
                curveTo(2.0329f, 20.0155f, 1.9377f, 17.9851f, 3.1586f, 16.7221f)
                lineTo(10.6339f, 8.989f)
                curveTo(10.5462f, 8.5897f, 10.5001f, 8.1754f, 10.5001f, 7.751f)
                close()
                moveTo(16.2501f, 3.501f)
                curveTo(13.9029f, 3.501f, 12.0001f, 5.4038f, 12.0001f, 7.751f)
                curveTo(12.0001f, 8.1829f, 12.0643f, 8.5985f, 12.1832f, 8.9895f)
                curveTo(12.2624f, 9.2501f, 12.1942f, 9.5331f, 12.0049f, 9.7289f)
                lineTo(4.2371f, 17.7646f)
                curveTo(3.6165f, 18.4066f, 3.6649f, 19.4387f, 4.3428f, 20.0198f)
                curveTo(4.9658f, 20.5538f, 5.8968f, 20.5101f, 6.467f, 19.9202f)
                lineTo(14.1435f, 11.9791f)
                curveTo(14.3435f, 11.7722f, 14.6443f, 11.698f, 14.9176f, 11.7881f)
                curveTo(15.3358f, 11.926f, 15.7834f, 12.001f, 16.2501f, 12.001f)
                curveTo(18.5973f, 12.001f, 20.5001f, 10.0982f, 20.5001f, 7.751f)
                curveTo(20.5001f, 7.4088f, 20.4598f, 7.0766f, 20.3838f, 6.7585f)
                lineTo(17.8916f, 9.2507f)
                curveTo(17.5987f, 9.5436f, 17.1238f, 9.5436f, 16.831f, 9.2507f)
                lineTo(14.7096f, 7.1294f)
                curveTo(14.4167f, 6.8365f, 14.4167f, 6.3616f, 14.7096f, 6.0687f)
                lineTo(17.1763f, 3.602f)
                curveTo(16.8785f, 3.5359f, 16.5686f, 3.501f, 16.2501f, 3.501f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
