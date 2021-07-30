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

public val CssGgIcons.Monday: ImageVector
    get() {
        if (_monday != null) {
            return _monday!!
        }
        _monday = Builder(name = "Monday", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7786f, 6.1392f)
                curveTo(7.7289f, 4.7819f, 9.5995f, 4.4521f, 10.9568f, 5.4024f)
                curveTo(12.314f, 6.3527f, 12.6438f, 8.2234f, 11.6935f, 9.5806f)
                lineTo(5.9577f, 17.7721f)
                curveTo(5.0074f, 19.1293f, 3.1367f, 19.4592f, 1.7795f, 18.5089f)
                curveTo(0.4223f, 17.5585f, 0.0925f, 15.6879f, 1.0428f, 14.3307f)
                lineTo(6.7786f, 6.1392f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2678f, 6.2281f)
                curveTo(16.2182f, 4.8709f, 18.0888f, 4.541f, 19.446f, 5.4914f)
                curveTo(20.8032f, 6.4417f, 21.1331f, 8.3124f, 20.1827f, 9.6696f)
                lineTo(14.447f, 17.8611f)
                curveTo(13.4966f, 19.2183f, 11.626f, 19.5481f, 10.2688f, 18.5978f)
                curveTo(8.9116f, 17.6475f, 8.5817f, 15.7768f, 9.5321f, 14.4196f)
                lineTo(15.2678f, 6.2281f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 18.8596f)
                curveTo(22.1569f, 18.8596f, 23.5f, 17.5165f, 23.5f, 15.8596f)
                curveTo(23.5f, 14.2028f, 22.1569f, 12.8596f, 20.5f, 12.8596f)
                curveTo(18.8431f, 12.8596f, 17.5f, 14.2028f, 17.5f, 15.8596f)
                curveTo(17.5f, 17.5165f, 18.8431f, 18.8596f, 20.5f, 18.8596f)
                close()
            }
        }
        .build()
        return _monday!!
    }

private var _monday: ImageVector? = null
