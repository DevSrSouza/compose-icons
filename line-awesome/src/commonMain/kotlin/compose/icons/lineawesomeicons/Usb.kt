package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                lineTo(13.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 20.063f)
                curveTo(14.219f, 19.734f, 13.41f, 19.609f, 12.656f, 19.5f)
                curveTo(11.781f, 19.375f, 10.984f, 19.25f, 10.563f, 19.031f)
                curveTo(10.141f, 18.813f, 10.0f, 18.707f, 10.0f, 18.0f)
                lineTo(10.0f, 15.719f)
                curveTo(10.598f, 15.371f, 11.0f, 14.738f, 11.0f, 14.0f)
                curveTo(11.0f, 12.895f, 10.105f, 12.0f, 9.0f, 12.0f)
                curveTo(7.895f, 12.0f, 7.0f, 12.895f, 7.0f, 14.0f)
                curveTo(7.0f, 14.738f, 7.402f, 15.371f, 8.0f, 15.719f)
                lineTo(8.0f, 18.0f)
                curveTo(8.0f, 19.293f, 8.734f, 20.313f, 9.625f, 20.781f)
                curveTo(10.516f, 21.25f, 11.469f, 21.375f, 12.344f, 21.5f)
                curveTo(13.219f, 21.625f, 14.016f, 21.75f, 14.438f, 21.969f)
                curveTo(14.859f, 22.188f, 15.0f, 22.293f, 15.0f, 23.0f)
                curveTo(15.0f, 23.031f, 15.0f, 23.063f, 15.0f, 23.094f)
                lineTo(15.0f, 23.188f)
                curveTo(13.84f, 23.602f, 13.0f, 24.699f, 13.0f, 26.0f)
                curveTo(13.0f, 27.656f, 14.344f, 29.0f, 16.0f, 29.0f)
                curveTo(17.656f, 29.0f, 19.0f, 27.656f, 19.0f, 26.0f)
                curveTo(19.0f, 24.699f, 18.16f, 23.602f, 17.0f, 23.188f)
                curveTo(17.008f, 23.125f, 17.008f, 23.063f, 17.0f, 23.0f)
                lineTo(17.0f, 21.156f)
                curveTo(17.004f, 21.105f, 17.004f, 21.051f, 17.0f, 21.0f)
                curveTo(17.0f, 20.332f, 17.191f, 20.137f, 17.75f, 19.813f)
                curveTo(18.309f, 19.488f, 19.25f, 19.219f, 20.25f, 18.969f)
                curveTo(21.25f, 18.719f, 22.309f, 18.488f, 23.25f, 17.938f)
                curveTo(24.191f, 17.387f, 25.0f, 16.332f, 25.0f, 15.0f)
                lineTo(25.0f, 13.0f)
                lineTo(26.0f, 13.0f)
                lineTo(26.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                lineTo(22.0f, 13.0f)
                lineTo(23.0f, 13.0f)
                lineTo(23.0f, 15.0f)
                curveTo(23.0f, 15.668f, 22.809f, 15.863f, 22.25f, 16.188f)
                curveTo(21.691f, 16.512f, 20.75f, 16.781f, 19.75f, 17.031f)
                curveTo(18.836f, 17.258f, 17.875f, 17.484f, 17.0f, 17.938f)
                lineTo(17.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
