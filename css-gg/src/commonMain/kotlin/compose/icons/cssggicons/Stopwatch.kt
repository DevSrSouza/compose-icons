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

public val CssGgIcons.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6214f, 2.5503f)
                lineTo(21.4498f, 5.3787f)
                lineTo(20.0356f, 6.7929f)
                lineTo(17.2071f, 3.9645f)
                lineTo(18.6214f, 2.5503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8225f, 8.6005f)
                horizontalLineTo(10.8225f)
                verticalLineTo(12.6005f)
                horizontalLineTo(12.8225f)
                verticalLineTo(8.6005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.1863f, 18.8137f)
                curveTo(8.701f, 22.3285f, 14.3995f, 22.3285f, 17.9143f, 18.8137f)
                curveTo(21.429f, 15.299f, 21.429f, 9.6005f, 17.9143f, 6.0858f)
                curveTo(14.3995f, 2.5711f, 8.701f, 2.5711f, 5.1863f, 6.0858f)
                curveTo(1.6716f, 9.6005f, 1.6716f, 15.299f, 5.1863f, 18.8137f)
                close()
                moveTo(6.6005f, 17.3995f)
                curveTo(9.3342f, 20.1332f, 13.7664f, 20.1332f, 16.5f, 17.3995f)
                curveTo(19.2337f, 14.6659f, 19.2337f, 10.2337f, 16.5f, 7.5f)
                curveTo(13.7664f, 4.7664f, 9.3342f, 4.7664f, 6.6005f, 7.5f)
                curveTo(3.8669f, 10.2337f, 3.8669f, 14.6659f, 6.6005f, 17.3995f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
