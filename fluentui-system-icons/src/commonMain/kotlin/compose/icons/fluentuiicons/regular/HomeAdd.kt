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

public val RegularGroup.HomeAdd: ImageVector
    get() {
        if (_homeAdd != null) {
            return _homeAdd!!
        }
        _homeAdd = Builder(name = "HomeAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5495f, 2.5319f)
                curveTo(11.3874f, 1.8253f, 12.6126f, 1.8253f, 13.4505f, 2.5319f)
                lineTo(20.2005f, 8.224f)
                curveTo(20.7074f, 8.6515f, 21.0f, 9.2809f, 21.0f, 9.9441f)
                verticalLineTo(12.0218f)
                curveTo(20.5368f, 11.7253f, 20.0335f, 11.4858f, 19.5f, 11.3135f)
                verticalLineTo(9.9441f)
                curveTo(19.5f, 9.723f, 19.4025f, 9.5132f, 19.2335f, 9.3707f)
                lineTo(12.4835f, 3.6786f)
                curveTo(12.2042f, 3.4431f, 11.7958f, 3.4431f, 11.5165f, 3.6786f)
                lineTo(4.7665f, 9.3707f)
                curveTo(4.5975f, 9.5132f, 4.5f, 9.723f, 4.5f, 9.9441f)
                verticalLineTo(19.7468f)
                curveTo(4.5f, 19.8849f, 4.6119f, 19.9968f, 4.75f, 19.9968f)
                horizontalLineTo(11.4968f)
                curveTo(11.722f, 20.5377f, 12.0182f, 21.0415f, 12.3737f, 21.4968f)
                horizontalLineTo(4.75f)
                curveTo(3.7835f, 21.4968f, 3.0f, 20.7133f, 3.0f, 19.7468f)
                verticalLineTo(9.9441f)
                curveTo(3.0f, 9.2809f, 3.2926f, 8.6515f, 3.7995f, 8.224f)
                lineTo(10.5495f, 2.5319f)
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
                horizontalLineTo(14.4956f)
                curveTo(14.2197f, 18.0f, 13.9961f, 17.7762f, 13.9961f, 17.5f)
                curveTo(13.9961f, 17.2239f, 14.2197f, 17.0f, 14.4956f, 17.0f)
                horizontalLineTo(17.0005f)
                lineTo(17.0f, 14.4993f)
                curveTo(17.0f, 14.2231f, 17.2239f, 13.9993f, 17.5f, 13.9993f)
                curveTo(17.7761f, 13.9993f, 18.0f, 14.2231f, 18.0f, 14.4993f)
                lineTo(18.0005f, 17.0f)
                horizontalLineTo(20.4966f)
                curveTo(20.7725f, 17.0f, 20.9961f, 17.2239f, 20.9961f, 17.5f)
                curveTo(20.9961f, 17.7762f, 20.7725f, 18.0f, 20.4966f, 18.0f)
                horizontalLineTo(18.0006f)
                close()
            }
        }
        .build()
        return _homeAdd!!
    }

private var _homeAdd: ImageVector? = null
