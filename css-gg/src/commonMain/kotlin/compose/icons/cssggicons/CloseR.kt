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

public val CssGgIcons.CloseR: ImageVector
    get() {
        if (_closeR != null) {
            return _closeR!!
        }
        _closeR = Builder(name = "CloseR", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3956f, 7.7573f)
                curveTo(16.7862f, 8.1479f, 16.7862f, 8.781f, 16.3956f, 9.1715f)
                lineTo(13.4142f, 12.153f)
                lineTo(16.0896f, 14.8284f)
                curveTo(16.4802f, 15.2189f, 16.4802f, 15.8521f, 16.0896f, 16.2426f)
                curveTo(15.6991f, 16.6331f, 15.0659f, 16.6331f, 14.6754f, 16.2426f)
                lineTo(12.0f, 13.5672f)
                lineTo(9.3246f, 16.2426f)
                curveTo(8.934f, 16.6331f, 8.3009f, 16.6331f, 7.9104f, 16.2426f)
                curveTo(7.5198f, 15.8521f, 7.5198f, 15.2189f, 7.9104f, 14.8284f)
                lineTo(10.5858f, 12.153f)
                lineTo(7.6044f, 9.1715f)
                curveTo(7.2138f, 8.781f, 7.2138f, 8.1479f, 7.6044f, 7.7573f)
                curveTo(7.9949f, 7.3668f, 8.628f, 7.3668f, 9.0186f, 7.7573f)
                lineTo(12.0f, 10.7388f)
                lineTo(14.9814f, 7.7573f)
                curveTo(15.372f, 7.3668f, 16.0051f, 7.3668f, 16.3956f, 7.7573f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 1.0f)
                curveTo(2.3431f, 1.0f, 1.0f, 2.3431f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.6569f, 2.3431f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 23.0f, 23.0f, 21.6569f, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.3431f, 21.6569f, 1.0f, 20.0f, 1.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                close()
            }
        }
        .build()
        return _closeR!!
    }

private var _closeR: ImageVector? = null
