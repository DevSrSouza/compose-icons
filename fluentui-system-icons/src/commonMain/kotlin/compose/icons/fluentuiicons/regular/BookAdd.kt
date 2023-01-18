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

public val RegularGroup.BookAdd: ImageVector
    get() {
        if (_bookAdd != null) {
            return _bookAdd!!
        }
        _bookAdd = Builder(name = "BookAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.5f)
                curveTo(3.0f, 3.1193f, 4.1193f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.3807f, 2.0f, 19.5f, 3.1193f, 19.5f, 4.5f)
                verticalLineTo(11.3135f)
                curveTo(19.0218f, 11.159f, 18.5195f, 11.0585f, 18.0f, 11.0189f)
                verticalLineTo(4.5f)
                curveTo(18.0f, 3.9477f, 17.5523f, 3.5f, 17.0f, 3.5f)
                horizontalLineTo(5.5f)
                curveTo(4.9477f, 3.5f, 4.5f, 3.9477f, 4.5f, 4.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0189f)
                curveTo(11.0585f, 18.5195f, 11.159f, 19.0218f, 11.3135f, 19.5f)
                horizontalLineTo(4.5f)
                curveTo(4.5f, 20.0523f, 4.9477f, 20.5f, 5.5f, 20.5f)
                horizontalLineTo(11.7322f)
                curveTo(12.0194f, 21.051f, 12.3832f, 21.5557f, 12.8096f, 22.0f)
                horizontalLineTo(5.5f)
                curveTo(4.1193f, 22.0f, 3.0f, 20.8807f, 3.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(18.0011f, 20.5035f)
                lineTo(18.0006f, 18.0f)
                horizontalLineTo(20.503f)
                curveTo(20.7792f, 18.0f, 21.003f, 17.7762f, 21.003f, 17.5f)
                curveTo(21.003f, 17.2239f, 20.7792f, 17.0f, 20.503f, 17.0f)
                horizontalLineTo(18.0005f)
                lineTo(18.0f, 14.4993f)
                curveTo(18.0f, 14.2231f, 17.7761f, 13.9993f, 17.5f, 13.9993f)
                curveTo(17.2239f, 13.9993f, 17.0f, 14.2231f, 17.0f, 14.4993f)
                lineTo(17.0005f, 17.0f)
                horizontalLineTo(14.4961f)
                curveTo(14.22f, 17.0f, 13.9961f, 17.2239f, 13.9961f, 17.5f)
                curveTo(13.9961f, 17.7762f, 14.22f, 18.0f, 14.4961f, 18.0f)
                horizontalLineTo(17.0006f)
                lineTo(17.0011f, 20.5035f)
                curveTo(17.0011f, 20.7797f, 17.225f, 21.0035f, 17.5011f, 21.0035f)
                curveTo(17.7773f, 21.0035f, 18.0011f, 20.7797f, 18.0011f, 20.5035f)
                close()
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 5.4477f, 6.4477f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 5.0f, 16.0f, 5.4477f, 16.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 8.5523f, 15.5523f, 9.0f, 15.0f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 9.0f, 6.0f, 8.5523f, 6.0f, 8.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.5f, 7.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _bookAdd!!
    }

private var _bookAdd: ImageVector? = null
