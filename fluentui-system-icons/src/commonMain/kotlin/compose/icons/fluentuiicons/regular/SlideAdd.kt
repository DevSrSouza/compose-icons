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

public val RegularGroup.SlideAdd: ImageVector
    get() {
        if (_slideAdd != null) {
            return _slideAdd!!
        }
        _slideAdd = Builder(name = "SlideAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(12.8096f)
                curveTo(21.5557f, 12.3832f, 21.051f, 12.0194f, 20.5f, 11.7322f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.0596f, 19.9404f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(4.75f)
                curveTo(4.0596f, 5.5f, 3.5f, 6.0596f, 3.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(3.5f, 17.9404f, 4.0596f, 18.5f, 4.75f, 18.5f)
                horizontalLineTo(11.0764f)
                curveTo(11.1572f, 19.0232f, 11.3004f, 19.5258f, 11.4982f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(18.0006f, 18.0f)
                lineTo(18.0011f, 20.5035f)
                curveTo(18.0011f, 20.7797f, 17.7773f, 21.0035f, 17.5011f, 21.0035f)
                curveTo(17.225f, 21.0035f, 17.0011f, 20.7797f, 17.0011f, 20.5035f)
                lineTo(17.0006f, 18.0f)
                horizontalLineTo(14.4961f)
                curveTo(14.22f, 18.0f, 13.9961f, 17.7762f, 13.9961f, 17.5f)
                curveTo(13.9961f, 17.2239f, 14.22f, 17.0f, 14.4961f, 17.0f)
                horizontalLineTo(17.0005f)
                lineTo(17.0f, 14.4993f)
                curveTo(17.0f, 14.2231f, 17.2239f, 13.9993f, 17.5f, 13.9993f)
                curveTo(17.7761f, 13.9993f, 18.0f, 14.2231f, 18.0f, 14.4993f)
                lineTo(18.0005f, 17.0f)
                horizontalLineTo(20.503f)
                curveTo(20.7792f, 17.0f, 21.003f, 17.2239f, 21.003f, 17.5f)
                curveTo(21.003f, 17.7762f, 20.7792f, 18.0f, 20.503f, 18.0f)
                horizontalLineTo(18.0006f)
                close()
            }
        }
        .build()
        return _slideAdd!!
    }

private var _slideAdd: ImageVector? = null
