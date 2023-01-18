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

public val RegularGroup.UsbStick: ImageVector
    get() {
        if (_usbStick != null) {
            return _usbStick!!
        }
        _usbStick = Builder(name = "UsbStick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2673f, 1.9971f)
                curveTo(15.647f, 1.9971f, 15.9608f, 2.2792f, 16.0104f, 2.6453f)
                lineTo(16.0173f, 2.7471f)
                lineTo(16.0176f, 7.1326f)
                curveTo(16.8335f, 7.4269f, 17.4304f, 8.1793f, 17.4978f, 9.0794f)
                lineTo(17.5042f, 9.2498f)
                verticalLineTo(19.7498f)
                curveTo(17.5042f, 20.9406f, 16.579f, 21.9154f, 15.4082f, 21.9946f)
                lineTo(15.2542f, 21.9998f)
                horizontalLineTo(8.7542f)
                curveTo(7.5633f, 21.9998f, 6.5885f, 21.0746f, 6.5093f, 19.9038f)
                lineTo(6.5041f, 19.7498f)
                verticalLineTo(9.2498f)
                curveTo(6.5041f, 8.2653f, 7.1364f, 7.4285f, 8.0171f, 7.1233f)
                lineTo(8.0165f, 2.7471f)
                curveTo(8.0165f, 2.3674f, 8.2986f, 2.0536f, 8.6647f, 2.0039f)
                lineTo(8.7665f, 1.9971f)
                horizontalLineTo(15.2673f)
                close()
                moveTo(15.2542f, 8.4998f)
                horizontalLineTo(8.7542f)
                curveTo(8.3745f, 8.4998f, 8.0607f, 8.7819f, 8.011f, 9.148f)
                lineTo(8.0042f, 9.2498f)
                verticalLineTo(19.7498f)
                curveTo(8.0042f, 20.1295f, 8.2863f, 20.4433f, 8.6524f, 20.4929f)
                lineTo(8.7542f, 20.4998f)
                horizontalLineTo(15.2542f)
                curveTo(15.6338f, 20.4998f, 15.9476f, 20.2176f, 15.9973f, 19.8516f)
                lineTo(16.0042f, 19.7498f)
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
        return _usbStick!!
    }

private var _usbStick: ImageVector? = null
