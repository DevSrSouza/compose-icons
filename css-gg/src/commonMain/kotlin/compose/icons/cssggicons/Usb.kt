package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 8.5f)
                verticalLineTo(1.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.5f)
                curveTo(19.0f, 21.1569f, 17.6569f, 22.5f, 16.0f, 22.5f)
                horizontalLineTo(8.0f)
                curveTo(6.3432f, 22.5f, 5.0f, 21.1569f, 5.0f, 19.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(7.0f)
                close()
                moveTo(9.0f, 3.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.5f)
                close()
                moveTo(17.0f, 10.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.5f)
                curveTo(7.0f, 20.0523f, 7.4477f, 20.5f, 8.0f, 20.5f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 20.5f, 17.0f, 20.0523f, 17.0f, 19.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
