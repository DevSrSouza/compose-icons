package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDoubleLeftDown: ImageVector
    get() {
        if (_cornerDoubleLeftDown != null) {
            return _cornerDoubleLeftDown!!
        }
        _cornerDoubleLeftDown = Builder(name = "CornerDoubleLeftDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.299f, 7.7609f)
                lineTo(16.2801f, 12.6405f)
                lineTo(14.8859f, 11.2065f)
                lineTo(17.3217f, 8.8383f)
                lineTo(11.3015f, 8.8532f)
                curveTo(9.9761f, 8.8565f, 8.9042f, 9.9337f, 8.9075f, 11.2592f)
                lineTo(8.9221f, 17.1591f)
                lineTo(11.1898f, 14.903f)
                lineTo(12.6004f, 16.3208f)
                lineTo(7.6381f, 21.258f)
                lineTo(2.7009f, 16.2957f)
                lineTo(4.1187f, 14.8851f)
                lineTo(6.5225f, 17.3011f)
                lineTo(6.5075f, 11.2652f)
                curveTo(6.5009f, 8.6142f, 8.6446f, 6.4598f, 11.2956f, 6.4532f)
                lineTo(17.224f, 6.4385f)
                lineTo(14.9855f, 4.1361f)
                lineTo(16.4195f, 2.7419f)
                lineTo(21.299f, 7.7609f)
                close()
            }
        }
        .build()
        return _cornerDoubleLeftDown!!
    }

private var _cornerDoubleLeftDown: ImageVector? = null
