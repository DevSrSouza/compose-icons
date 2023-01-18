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

public val RegularGroup.UsbPlug: ImageVector
    get() {
        if (_usbPlug != null) {
            return _usbPlug!!
        }
        _usbPlug = Builder(name = "UsbPlug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.2483f)
                curveTo(11.0f, 21.6625f, 10.6642f, 21.9983f, 10.25f, 21.9983f)
                curveTo(9.8703f, 21.9983f, 9.5565f, 21.7161f, 9.5069f, 21.35f)
                lineTo(9.5f, 21.2483f)
                lineTo(9.4992f, 16.9991f)
                lineTo(8.7542f, 16.9998f)
                curveTo(7.5633f, 16.9998f, 6.5885f, 16.0746f, 6.5093f, 14.9038f)
                lineTo(6.5041f, 14.7498f)
                verticalLineTo(9.2498f)
                curveTo(6.5041f, 8.2653f, 7.1364f, 7.4285f, 8.0171f, 7.1233f)
                lineTo(8.0165f, 2.7471f)
                curveTo(8.0165f, 2.3674f, 8.2986f, 2.0536f, 8.6647f, 2.0039f)
                lineTo(8.7665f, 1.9971f)
                horizontalLineTo(15.2673f)
                curveTo(15.647f, 1.9971f, 15.9608f, 2.2792f, 16.0104f, 2.6453f)
                lineTo(16.0173f, 2.7471f)
                lineTo(16.0176f, 7.1326f)
                curveTo(16.8335f, 7.4269f, 17.4304f, 8.1793f, 17.4978f, 9.0794f)
                lineTo(17.5042f, 9.2498f)
                verticalLineTo(14.7498f)
                curveTo(17.5042f, 15.9406f, 16.579f, 16.9154f, 15.4082f, 16.9946f)
                lineTo(15.2542f, 16.9998f)
                lineTo(14.4992f, 16.9991f)
                lineTo(14.5001f, 21.2453f)
                curveTo(14.5001f, 21.6595f, 14.1643f, 21.9953f, 13.7501f, 21.9953f)
                curveTo(13.3704f, 21.9953f, 13.0566f, 21.7131f, 13.007f, 21.347f)
                lineTo(13.0001f, 21.2453f)
                lineTo(12.9992f, 16.9991f)
                horizontalLineTo(10.9992f)
                lineTo(11.0f, 21.2483f)
                close()
                moveTo(15.2542f, 8.4998f)
                horizontalLineTo(8.7542f)
                curveTo(8.3745f, 8.4998f, 8.0607f, 8.7819f, 8.011f, 9.148f)
                lineTo(8.0042f, 9.2498f)
                verticalLineTo(14.7498f)
                curveTo(8.0042f, 15.1295f, 8.2863f, 15.4433f, 8.6524f, 15.4929f)
                lineTo(8.7542f, 15.4998f)
                lineTo(13.7501f, 15.4968f)
                lineTo(13.7932f, 15.4991f)
                lineTo(15.2542f, 15.4998f)
                curveTo(15.6338f, 15.4998f, 15.9476f, 15.2176f, 15.9973f, 14.8516f)
                lineTo(16.0042f, 14.7498f)
                verticalLineTo(9.2498f)
                curveTo(16.0042f, 8.8701f, 15.722f, 8.5563f, 15.3559f, 8.5066f)
                lineTo(15.2542f, 8.4998f)
                close()
                moveTo(14.517f, 3.4968f)
                horizontalLineTo(9.516f)
                verticalLineTo(6.9988f)
                horizontalLineTo(14.517f)
                verticalLineTo(3.4968f)
                close()
            }
        }
        .build()
        return _usbPlug!!
    }

private var _usbPlug: ImageVector? = null
