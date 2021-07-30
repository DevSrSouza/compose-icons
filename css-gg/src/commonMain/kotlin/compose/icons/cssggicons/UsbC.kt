package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.UsbC: ImageVector
    get() {
        if (_usbC != null) {
            return _usbC!!
        }
        _usbC = Builder(name = "UsbC", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveTo(7.4477f, 11.0f, 7.0f, 11.4477f, 7.0f, 12.0f)
                curveTo(7.0f, 12.5523f, 7.4477f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 13.0f, 17.0f, 12.5523f, 17.0f, 12.0f)
                curveTo(17.0f, 11.4477f, 16.5523f, 11.0f, 16.0f, 11.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 9.2386f, 5.2386f, 7.0f, 8.0f, 7.0f)
                horizontalLineTo(16.0f)
                curveTo(18.7614f, 7.0f, 21.0f, 9.2386f, 21.0f, 12.0f)
                curveTo(21.0f, 14.7614f, 18.7614f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(5.2386f, 17.0f, 3.0f, 14.7614f, 3.0f, 12.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(17.6569f, 9.0f, 19.0f, 10.3431f, 19.0f, 12.0f)
                curveTo(19.0f, 13.6569f, 17.6569f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(6.3432f, 15.0f, 5.0f, 13.6569f, 5.0f, 12.0f)
                curveTo(5.0f, 10.3431f, 6.3432f, 9.0f, 8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _usbC!!
    }

private var _usbC: ImageVector? = null
