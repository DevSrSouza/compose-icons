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

public val CssGgIcons.FormatColor: ImageVector
    get() {
        if (_formatColor != null) {
            return _formatColor!!
        }
        _formatColor = Builder(name = "FormatColor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.9479f, 3.2095f)
                curveTo(12.7721f, 2.8324f, 12.391f, 2.6165f, 11.9997f, 2.6327f)
                curveTo(11.6086f, 2.6167f, 11.2278f, 2.8326f, 11.0521f, 3.2095f)
                lineTo(5.1354f, 15.8978f)
                curveTo(4.902f, 16.3983f, 5.1185f, 16.9933f, 5.6191f, 17.2267f)
                curveTo(6.1196f, 17.4601f, 6.7146f, 17.2436f, 6.948f, 16.743f)
                lineTo(8.3987f, 13.632f)
                horizontalLineTo(15.6013f)
                lineTo(17.052f, 16.743f)
                curveTo(17.2854f, 17.2435f, 17.8804f, 17.4601f, 18.3809f, 17.2267f)
                curveTo(18.8814f, 16.9933f, 19.098f, 16.3983f, 18.8646f, 15.8978f)
                lineTo(12.9479f, 3.2095f)
                close()
                moveTo(14.6687f, 11.632f)
                lineTo(12.0f, 5.909f)
                lineTo(9.3313f, 11.632f)
                horizontalLineTo(14.6687f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.3682f)
                curveTo(5.4477f, 19.3682f, 5.0f, 19.816f, 5.0f, 20.3682f)
                curveTo(5.0f, 20.9205f, 5.4477f, 21.3682f, 6.0f, 21.3682f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 21.3682f, 19.0f, 20.9205f, 19.0f, 20.3682f)
                curveTo(19.0f, 19.816f, 18.5523f, 19.3682f, 18.0f, 19.3682f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _formatColor!!
    }

private var _formatColor: ImageVector? = null
