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

public val RegularGroup.Premium: ImageVector
    get() {
        if (_premium != null) {
            return _premium!!
        }
        _premium = Builder(name = "Premium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9989f, 3.0f)
                curveTo(18.2398f, 3.0f, 18.4638f, 3.1155f, 18.6038f, 3.3065f)
                lineTo(18.6585f, 3.3929f)
                lineTo(21.922f, 9.4212f)
                lineTo(21.9599f, 9.5141f)
                lineTo(21.972f, 9.5539f)
                lineTo(21.9921f, 9.6561f)
                lineTo(21.9979f, 9.75f)
                curveTo(21.9979f, 9.819f, 21.9886f, 9.8859f, 21.9711f, 9.9494f)
                lineTo(21.9237f, 10.0754f)
                lineTo(21.8862f, 10.144f)
                curveTo(21.8641f, 10.1796f, 21.839f, 10.2136f, 21.8107f, 10.2457f)
                lineTo(21.8705f, 10.1683f)
                lineTo(21.846f, 10.2025f)
                lineTo(12.5962f, 20.7081f)
                curveTo(12.5161f, 20.8144f, 12.4128f, 20.8917f, 12.2989f, 20.94f)
                lineTo(12.2007f, 20.973f)
                lineTo(12.1235f, 20.9904f)
                lineTo(11.9993f, 21.0003f)
                lineTo(11.899f, 20.9937f)
                lineTo(11.7811f, 20.9682f)
                curveTo(11.7209f, 20.9509f, 11.6623f, 20.9254f, 11.6075f, 20.8922f)
                lineTo(11.5983f, 20.8847f)
                curveTo(11.5512f, 20.8564f, 11.5072f, 20.8218f, 11.4672f, 20.7815f)
                lineTo(2.1781f, 10.2352f)
                lineTo(2.1518f, 10.2025f)
                lineTo(2.1118f, 10.144f)
                curveTo(2.0563f, 10.0544f, 2.0192f, 9.9523f, 2.0057f, 9.8429f)
                lineTo(2.0f, 9.75f)
                lineTo(2.0029f, 9.6841f)
                lineTo(2.0161f, 9.5954f)
                curveTo(2.0222f, 9.5655f, 2.0301f, 9.5367f, 2.0397f, 9.5087f)
                lineTo(2.0625f, 9.4502f)
                lineTo(2.0905f, 9.3929f)
                lineTo(5.3394f, 3.3929f)
                curveTo(5.4541f, 3.1811f, 5.6623f, 3.0391f, 5.8969f, 3.0069f)
                lineTo(5.999f, 3.0f)
                horizontalLineTo(17.9989f)
                close()
                moveTo(14.997f, 10.5f)
                horizontalLineTo(8.998f)
                lineTo(11.9989f, 18.187f)
                lineTo(14.997f, 10.5f)
                close()
                moveTo(7.389f, 10.5f)
                horizontalLineTo(4.409f)
                lineTo(9.76f, 16.574f)
                lineTo(7.389f, 10.5f)
                close()
                moveTo(19.587f, 10.5f)
                horizontalLineTo(16.608f)
                lineTo(14.24f, 16.57f)
                lineTo(19.587f, 10.5f)
                close()
                moveTo(8.971f, 4.5f)
                horizontalLineTo(6.445f)
                lineTo(4.007f, 9.0f)
                horizontalLineTo(7.531f)
                lineTo(8.971f, 4.5f)
                close()
                moveTo(13.4509f, 4.5f)
                horizontalLineTo(10.5459f)
                lineTo(9.105f, 9.0f)
                horizontalLineTo(14.89f)
                lineTo(13.4509f, 4.5f)
                close()
                moveTo(17.5519f, 4.5f)
                horizontalLineTo(15.026f)
                lineTo(16.466f, 9.0f)
                horizontalLineTo(19.988f)
                lineTo(17.5519f, 4.5f)
                close()
            }
        }
        .build()
        return _premium!!
    }

private var _premium: ImageVector? = null
