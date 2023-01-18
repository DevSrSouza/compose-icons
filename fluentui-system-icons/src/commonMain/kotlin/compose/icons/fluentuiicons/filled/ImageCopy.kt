package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ImageCopy: ImageVector
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
                moveTo(12.5707f, 12.1491f)
                lineTo(12.4774f, 12.2272f)
                lineTo(7.0828f, 17.5404f)
                curveTo(7.5703f, 17.8322f, 8.1405f, 18.0f, 8.75f, 18.0f)
                horizontalLineTo(17.25f)
                curveTo(17.8711f, 18.0f, 18.4515f, 17.8258f, 18.945f, 17.5236f)
                lineTo(13.528f, 12.2254f)
                lineTo(13.4442f, 12.1546f)
                curveTo(13.2172f, 11.9893f, 12.9186f, 11.9674f, 12.6725f, 12.0884f)
                lineTo(12.5707f, 12.1491f)
                close()
                moveTo(8.75f, 3.0f)
                curveTo(6.9551f, 3.0f, 5.5f, 4.4551f, 5.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(5.5f, 15.3916f, 5.6859f, 15.9897f, 6.0068f, 16.4935f)
                lineTo(11.4249f, 11.1584f)
                lineTo(11.5532f, 11.0413f)
                curveTo(12.3847f, 10.3389f, 13.6051f, 10.3348f, 14.4411f, 11.0305f)
                lineTo(14.5768f, 11.153f)
                lineTo(20.0098f, 16.4673f)
                curveTo(20.3205f, 15.969f, 20.5f, 15.3805f, 20.5f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 4.4551f, 19.0449f, 3.0f, 17.25f, 3.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(9.4995f, 5.7512f)
                curveTo(10.1895f, 5.7512f, 10.7488f, 6.3105f, 10.7488f, 7.0005f)
                curveTo(10.7488f, 7.6904f, 10.1895f, 8.2497f, 9.4995f, 8.2497f)
                curveTo(8.8096f, 8.2497f, 8.2503f, 7.6904f, 8.2503f, 7.0005f)
                curveTo(8.2503f, 6.3105f, 8.8096f, 5.7512f, 9.4995f, 5.7512f)
                close()
            }
        }
        .build()
        return _imageCopy!!
    }

private var _imageCopy: ImageVector? = null
