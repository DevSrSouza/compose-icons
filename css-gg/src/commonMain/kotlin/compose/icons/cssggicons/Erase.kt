package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Erase: ImageVector
    get() {
        if (_erase != null) {
            return _erase!!
        }
        _erase = Builder(name = "Erase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 12.8995f)
                curveTo(2.7189f, 13.6805f, 2.7189f, 14.9468f, 3.5f, 15.7279f)
                lineTo(7.3579f, 19.5858f)
                horizontalLineTo(4.0858f)
                curveTo(3.5335f, 19.5858f, 3.0858f, 20.0335f, 3.0858f, 20.5858f)
                curveTo(3.0858f, 21.1381f, 3.5335f, 21.5858f, 4.0858f, 21.5858f)
                horizontalLineTo(20.0858f)
                curveTo(20.638f, 21.5858f, 21.0858f, 21.1381f, 21.0858f, 20.5858f)
                curveTo(21.0858f, 20.0335f, 20.638f, 19.5858f, 20.0858f, 19.5858f)
                horizontalLineTo(10.9558f)
                lineTo(20.4705f, 10.071f)
                curveTo(21.2516f, 9.29f, 21.2516f, 8.0237f, 20.4705f, 7.2426f)
                lineTo(16.2279f, 3.0f)
                curveTo(15.4468f, 2.2189f, 14.1805f, 2.2189f, 13.3995f, 3.0f)
                lineTo(3.5f, 12.8995f)
                close()
                moveTo(7.8258f, 11.4021f)
                lineTo(4.9142f, 14.3137f)
                lineTo(9.1568f, 18.5563f)
                lineTo(12.0684f, 15.6447f)
                lineTo(7.8258f, 11.4021f)
                close()
                moveTo(9.24f, 9.9879f)
                lineTo(13.4826f, 14.2305f)
                lineTo(19.0563f, 8.6568f)
                lineTo(14.8137f, 4.4142f)
                lineTo(9.24f, 9.9879f)
                close()
            }
        }
        .build()
        return _erase!!
    }

private var _erase: ImageVector? = null
