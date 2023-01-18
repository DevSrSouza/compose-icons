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

public val RegularGroup.ImageCopy: ImageVector
    get() {
        if (_imageCopy != null) {
            return _imageCopy!!
        }
        _imageCopy = Builder(name = "ImageCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5068f, 6.0078f)
                curveTo(3.6012f, 6.5828f, 3.0f, 7.5962f, 3.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(3.0f, 18.1495f, 5.3505f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(14.75f)
                curveTo(15.9038f, 20.5f, 16.9172f, 19.8988f, 17.4939f, 18.9925f)
                lineTo(17.3717f, 18.9982f)
                lineTo(17.25f, 19.0f)
                horizontalLineTo(8.25f)
                curveTo(6.1789f, 19.0f, 4.5f, 17.3211f, 4.5f, 15.25f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 6.1687f, 4.5023f, 6.088f, 4.5068f, 6.0078f)
                close()
                moveTo(8.75f, 3.0f)
                curveTo(6.9551f, 3.0f, 5.5f, 4.4551f, 5.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(5.5f, 16.5449f, 6.9551f, 18.0f, 8.75f, 18.0f)
                horizontalLineTo(17.25f)
                curveTo(19.0449f, 18.0f, 20.5f, 16.5449f, 20.5f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 4.4551f, 19.0449f, 3.0f, 17.25f, 3.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(13.4309f, 12.1373f)
                lineTo(13.523f, 12.2137f)
                lineTo(17.8295f, 16.4018f)
                curveTo(17.6481f, 16.4654f, 17.4531f, 16.5f, 17.25f, 16.5f)
                horizontalLineTo(8.75f)
                curveTo(8.5469f, 16.5f, 8.3518f, 16.4654f, 8.1705f, 16.4018f)
                lineTo(12.4774f, 12.2137f)
                curveTo(12.7394f, 11.959f, 13.141f, 11.9335f, 13.4309f, 12.1373f)
                close()
                moveTo(8.75f, 4.5f)
                horizontalLineTo(17.25f)
                curveTo(18.2165f, 4.5f, 19.0f, 5.2835f, 19.0f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(19.0f, 14.9588f, 18.9634f, 15.159f, 18.8964f, 15.3447f)
                lineTo(14.5687f, 11.1382f)
                curveTo(13.739f, 10.3316f, 12.4428f, 10.2913f, 11.5665f, 11.0172f)
                lineTo(11.4318f, 11.1382f)
                lineTo(7.104f, 15.3457f)
                curveTo(7.0367f, 15.1597f, 7.0f, 14.9592f, 7.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(7.0f, 5.2835f, 7.7835f, 4.5f, 8.75f, 4.5f)
                close()
                moveTo(10.4996f, 6.7512f)
                curveTo(9.8096f, 6.7512f, 9.2503f, 7.3105f, 9.2503f, 8.0005f)
                curveTo(9.2503f, 8.6904f, 9.8096f, 9.2497f, 10.4996f, 9.2497f)
                curveTo(11.1895f, 9.2497f, 11.7488f, 8.6904f, 11.7488f, 8.0005f)
                curveTo(11.7488f, 7.3105f, 11.1895f, 6.7512f, 10.4996f, 6.7512f)
                close()
            }
        }
        .build()
        return _imageCopy!!
    }

private var _imageCopy: ImageVector? = null
