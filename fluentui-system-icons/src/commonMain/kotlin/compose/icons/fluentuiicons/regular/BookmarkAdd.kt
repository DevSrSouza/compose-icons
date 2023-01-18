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

public val RegularGroup.BookmarkAdd: ImageVector
    get() {
        if (_bookmarkAdd != null) {
            return _bookmarkAdd!!
        }
        _bookmarkAdd = Builder(name = "BookmarkAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9995f, 6.5f)
                curveTo(22.9995f, 3.4624f, 20.5371f, 1.0f, 17.4995f, 1.0f)
                curveTo(14.4619f, 1.0f, 11.9995f, 3.4624f, 11.9995f, 6.5f)
                curveTo(11.9995f, 9.5376f, 14.4619f, 12.0f, 17.4995f, 12.0f)
                curveTo(20.5371f, 12.0f, 22.9995f, 9.5376f, 22.9995f, 6.5f)
                close()
                moveTo(18.0002f, 7.0f)
                lineTo(18.0006f, 9.5035f)
                curveTo(18.0006f, 9.7797f, 17.7768f, 10.0035f, 17.5006f, 10.0035f)
                curveTo(17.2245f, 10.0035f, 17.0006f, 9.7797f, 17.0006f, 9.5035f)
                lineTo(17.0002f, 7.0f)
                horizontalLineTo(14.4951f)
                curveTo(14.2192f, 7.0f, 13.9956f, 6.7762f, 13.9956f, 6.5f)
                curveTo(13.9956f, 6.2239f, 14.2192f, 6.0f, 14.4951f, 6.0f)
                horizontalLineTo(17.0f)
                lineTo(16.9995f, 3.4993f)
                curveTo(16.9995f, 3.2231f, 17.2234f, 2.9993f, 17.4995f, 2.9993f)
                curveTo(17.7757f, 2.9993f, 17.9995f, 3.2231f, 17.9995f, 3.4993f)
                lineTo(18.0f, 6.0f)
                horizontalLineTo(20.4961f)
                curveTo(20.772f, 6.0f, 20.9956f, 6.2239f, 20.9956f, 6.5f)
                curveTo(20.9956f, 6.7762f, 20.772f, 7.0f, 20.4961f, 7.0f)
                horizontalLineTo(18.0002f)
                close()
                moveTo(17.5003f, 19.7815f)
                verticalLineTo(13.0f)
                curveTo(18.0166f, 12.9999f, 18.5188f, 12.9397f, 19.0003f, 12.8259f)
                verticalLineTo(21.2451f)
                curveTo(19.0003f, 21.8563f, 18.3085f, 22.2108f, 17.8123f, 21.8539f)
                lineTo(12.0011f, 17.6729f)
                lineTo(6.19f, 21.8539f)
                curveTo(5.6938f, 22.2108f, 5.0019f, 21.8563f, 5.0019f, 21.2451f)
                verticalLineTo(6.2491f)
                curveTo(5.0019f, 4.4542f, 6.457f, 2.9992f, 8.252f, 2.9992f)
                horizontalLineTo(12.0219f)
                curveTo(11.7252f, 3.4623f, 11.4857f, 3.9657f, 11.3133f, 4.4991f)
                horizontalLineTo(8.252f)
                curveTo(7.2854f, 4.4991f, 6.5019f, 5.2826f, 6.5019f, 6.2491f)
                verticalLineTo(19.7815f)
                lineTo(11.5631f, 16.1402f)
                curveTo(11.8248f, 15.9519f, 12.1775f, 15.9519f, 12.4392f, 16.1402f)
                lineTo(17.5003f, 19.7815f)
                close()
            }
        }
        .build()
        return _bookmarkAdd!!
    }

private var _bookmarkAdd: ImageVector? = null
