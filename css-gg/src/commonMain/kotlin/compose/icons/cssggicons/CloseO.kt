package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.CloseO: ImageVector
    get() {
        if (_closeO != null) {
            return _closeO!!
        }
        _closeO = Builder(name = "CloseO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3394f, 9.3224f)
                curveTo(16.7434f, 8.9459f, 16.7657f, 8.3131f, 16.3891f, 7.9091f)
                curveTo(16.0126f, 7.5051f, 15.3798f, 7.4828f, 14.9758f, 7.8594f)
                lineTo(12.0497f, 10.5866f)
                lineTo(9.3224f, 7.6605f)
                curveTo(8.9459f, 7.2565f, 8.3131f, 7.2342f, 7.9091f, 7.6108f)
                curveTo(7.5051f, 7.9873f, 7.4828f, 8.6201f, 7.8594f, 9.0241f)
                lineTo(10.5866f, 11.9502f)
                lineTo(7.6605f, 14.6775f)
                curveTo(7.2565f, 15.054f, 7.2342f, 15.6868f, 7.6108f, 16.0908f)
                curveTo(7.9873f, 16.4948f, 8.6201f, 16.5171f, 9.0241f, 16.1405f)
                lineTo(11.9502f, 13.4133f)
                lineTo(14.6775f, 16.3394f)
                curveTo(15.054f, 16.7434f, 15.6868f, 16.7657f, 16.0908f, 16.3891f)
                curveTo(16.4948f, 16.0126f, 16.5171f, 15.3798f, 16.1405f, 14.9758f)
                lineTo(13.4133f, 12.0497f)
                lineTo(16.3394f, 9.3224f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.9249f, 5.9249f, 1.0f, 12.0f, 1.0f)
                curveTo(18.0751f, 1.0f, 23.0f, 5.9249f, 23.0f, 12.0f)
                curveTo(23.0f, 18.0751f, 18.0751f, 23.0f, 12.0f, 23.0f)
                curveTo(5.9249f, 23.0f, 1.0f, 18.0751f, 1.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _closeO!!
    }

private var _closeO: ImageVector? = null
