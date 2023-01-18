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

public val RegularGroup.BatteryCheckmark: ImageVector
    get() {
        if (_batteryCheckmark != null) {
            return _batteryCheckmark!!
        }
        _batteryCheckmark = Builder(name = "BatteryCheckmark", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0003f, 6.0f)
                curveTo(18.6572f, 6.0f, 20.0003f, 7.3432f, 20.0003f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0006f)
                curveTo(21.1827f, 10.0f, 21.3535f, 10.0487f, 21.5006f, 10.1338f)
                curveTo(21.7995f, 10.3067f, 22.0006f, 10.6299f, 22.0006f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0006f, 13.3701f, 21.7995f, 13.6933f, 21.5006f, 13.8662f)
                curveTo(21.3535f, 13.9513f, 21.1827f, 14.0f, 21.0006f, 14.0f)
                horizontalLineTo(20.0003f)
                verticalLineTo(15.0f)
                curveTo(20.0003f, 16.6569f, 18.6572f, 18.0f, 17.0003f, 18.0f)
                horizontalLineTo(12.8261f)
                curveTo(12.9398f, 17.5185f, 13.0f, 17.0163f, 13.0f, 16.5f)
                horizontalLineTo(16.9985f)
                curveTo(17.7781f, 16.5f, 18.4189f, 15.9051f, 18.4916f, 15.1445f)
                lineTo(18.4985f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.4985f, 8.2203f, 17.9036f, 7.5795f, 17.1429f, 7.5069f)
                lineTo(16.9985f, 7.5f)
                horizontalLineTo(5.0f)
                curveTo(4.2203f, 7.5f, 3.5796f, 8.0949f, 3.5069f, 8.8555f)
                lineTo(3.5f, 9.0f)
                verticalLineTo(10.7322f)
                curveTo(2.949f, 11.0194f, 2.4443f, 11.3832f, 2.0f, 11.8096f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 7.3432f, 3.3431f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(17.0003f)
                close()
                moveTo(12.0f, 16.5f)
                curveTo(12.0f, 19.5376f, 9.5376f, 22.0f, 6.5f, 22.0f)
                curveTo(3.4624f, 22.0f, 1.0f, 19.5376f, 1.0f, 16.5f)
                curveTo(1.0f, 13.4624f, 3.4624f, 11.0f, 6.5f, 11.0f)
                curveTo(9.5376f, 11.0f, 12.0f, 13.4624f, 12.0f, 16.5f)
                close()
                moveTo(9.8535f, 14.1464f)
                curveTo(9.6583f, 13.9512f, 9.3417f, 13.9512f, 9.1465f, 14.1464f)
                lineTo(5.5f, 17.7929f)
                lineTo(3.8535f, 16.1464f)
                curveTo(3.6583f, 15.9512f, 3.3417f, 15.9512f, 3.1465f, 16.1464f)
                curveTo(2.9512f, 16.3417f, 2.9512f, 16.6583f, 3.1465f, 16.8536f)
                lineTo(5.1465f, 18.8536f)
                curveTo(5.3417f, 19.0488f, 5.6583f, 19.0488f, 5.8535f, 18.8536f)
                lineTo(9.8535f, 14.8536f)
                curveTo(10.0488f, 14.6583f, 10.0488f, 14.3417f, 9.8535f, 14.1464f)
                close()
            }
        }
        .build()
        return _batteryCheckmark!!
    }

private var _batteryCheckmark: ImageVector? = null
