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

public val CssGgIcons.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.3433f, 3.6857f)
                curveTo(6.8316f, 3.1974f, 7.3673f, 2.7854f, 7.9357f, 2.4497f)
                curveTo(10.4352f, 0.9735f, 13.5651f, 0.9735f, 16.0645f, 2.4497f)
                curveTo(16.6329f, 2.7854f, 17.1686f, 3.1974f, 17.657f, 3.6857f)
                lineTo(12.0001f, 9.3425f)
                lineTo(6.3433f, 3.6857f)
                close()
                moveTo(12.0001f, 6.5141f)
                lineTo(9.4131f, 3.9271f)
                curveTo(11.0447f, 3.1477f, 12.9556f, 3.1477f, 14.5871f, 3.9271f)
                lineTo(12.0001f, 6.5141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.6576f)
                curveTo(2.0f, 9.5265f, 3.439f, 6.7316f, 5.6917f, 4.898f)
                lineTo(7.1153f, 6.3215f)
                curveTo(5.2204f, 7.7845f, 4.0f, 10.0785f, 4.0f, 12.6576f)
                curveTo(4.0f, 17.0759f, 7.5817f, 20.6576f, 12.0f, 20.6576f)
                curveTo(16.4183f, 20.6576f, 20.0f, 17.0759f, 20.0f, 12.6576f)
                curveTo(20.0f, 10.0785f, 18.7796f, 7.7845f, 16.8847f, 6.3215f)
                lineTo(18.3083f, 4.898f)
                curveTo(20.561f, 6.7316f, 22.0f, 9.5265f, 22.0f, 12.6576f)
                curveTo(22.0f, 18.1804f, 17.5228f, 22.6576f, 12.0f, 22.6576f)
                curveTo(6.4771f, 22.6576f, 2.0f, 18.1804f, 2.0f, 12.6576f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
