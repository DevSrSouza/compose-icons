package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.CompressRight: ImageVector
    get() {
        if (_compressRight != null) {
            return _compressRight!!
        }
        _compressRight = Builder(name = "CompressRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.567f, 8.0295f)
                lineTo(20.9105f, 1.7693f)
                lineTo(22.3153f, 3.1928f)
                lineTo(15.9916f, 9.4335f)
                lineTo(19.5614f, 9.4477f)
                lineTo(19.5534f, 11.4477f)
                lineTo(12.5535f, 11.4199f)
                lineTo(12.5813f, 4.4199f)
                lineTo(14.5813f, 4.4279f)
                lineTo(14.567f, 8.0295f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9788f, 14.5429f)
                lineTo(4.4089f, 14.5457f)
                lineTo(4.4073f, 12.5457f)
                lineTo(11.4073f, 12.5402f)
                lineTo(11.4128f, 19.5402f)
                lineTo(9.4128f, 19.5417f)
                lineTo(9.41f, 15.9402f)
                lineTo(3.0962f, 22.2306f)
                lineTo(1.6846f, 20.8138f)
                lineTo(7.9788f, 14.5429f)
                close()
            }
        }
        .build()
        return _compressRight!!
    }

private var _compressRight: ImageVector? = null
