package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.TapSingle: ImageVector
    get() {
        if (_tapSingle != null) {
            return _tapSingle!!
        }
        _tapSingle = Builder(name = "TapSingle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0491f, 3.114f)
                curveTo(14.1927f, 3.114f, 16.1393f, 3.9571f, 17.5756f, 5.3297f)
                lineTo(16.1609f, 6.7444f)
                curveTo(15.087f, 5.7335f, 13.6404f, 5.114f, 12.0491f, 5.114f)
                curveTo(10.4086f, 5.114f, 8.9218f, 5.7724f, 7.8387f, 6.8394f)
                lineTo(6.4244f, 5.4252f)
                curveTo(7.8695f, 3.9963f, 9.8563f, 3.114f, 12.0491f, 3.114f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9767f, 11.886f)
                curveTo(10.9767f, 11.3337f, 11.4244f, 10.886f, 11.9767f, 10.886f)
                curveTo(12.529f, 10.886f, 12.9767f, 11.3337f, 12.9767f, 11.886f)
                verticalLineTo(13.886f)
                horizontalLineTo(10.9767f)
                verticalLineTo(11.886f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9767f, 6.886f)
                curveTo(9.2153f, 6.886f, 6.9767f, 9.1246f, 6.9767f, 11.886f)
                verticalLineTo(15.886f)
                curveTo(6.9767f, 18.6474f, 9.2153f, 20.886f, 11.9767f, 20.886f)
                curveTo(14.7381f, 20.886f, 16.9767f, 18.6474f, 16.9767f, 15.886f)
                verticalLineTo(11.886f)
                curveTo(16.9767f, 9.1246f, 14.7381f, 6.886f, 11.9767f, 6.886f)
                close()
                moveTo(14.9767f, 15.886f)
                verticalLineTo(11.886f)
                curveTo(14.9767f, 10.2291f, 13.6335f, 8.886f, 11.9767f, 8.886f)
                curveTo(10.3198f, 8.886f, 8.9767f, 10.2291f, 8.9767f, 11.886f)
                verticalLineTo(15.886f)
                curveTo(8.9767f, 17.5428f, 10.3198f, 18.886f, 11.9767f, 18.886f)
                curveTo(13.6335f, 18.886f, 14.9767f, 17.5428f, 14.9767f, 15.886f)
                close()
            }
        }
        .build()
        return _tapSingle!!
    }

private var _tapSingle: ImageVector? = null
