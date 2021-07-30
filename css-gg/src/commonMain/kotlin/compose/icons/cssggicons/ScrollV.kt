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

public val CssGgIcons.ScrollV: ImageVector
    get() {
        if (_scrollV != null) {
            return _scrollV!!
        }
        _scrollV = Builder(name = "ScrollV", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1715f, 16.8182f)
                lineTo(7.7573f, 18.2324f)
                lineTo(12.0f, 22.475f)
                lineTo(16.2426f, 18.2324f)
                lineTo(14.8284f, 16.8182f)
                lineTo(12.0f, 19.6466f)
                lineTo(9.1715f, 16.8182f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8284f, 7.182f)
                lineTo(16.2426f, 5.7678f)
                lineTo(12.0f, 1.5251f)
                lineTo(7.7573f, 5.7678f)
                lineTo(9.1715f, 7.182f)
                lineTo(12.0f, 4.3536f)
                lineTo(14.8284f, 7.182f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 9.0002f)
                curveTo(13.6569f, 9.0002f, 15.0f, 10.3433f, 15.0f, 12.0002f)
                curveTo(15.0f, 13.657f, 13.6569f, 15.0002f, 12.0f, 15.0002f)
                curveTo(10.3431f, 15.0002f, 9.0f, 13.657f, 9.0f, 12.0002f)
                curveTo(9.0f, 10.3433f, 10.3431f, 9.0002f, 12.0f, 9.0002f)
                close()
                moveTo(12.0f, 11.0002f)
                curveTo(12.5523f, 11.0002f, 13.0f, 11.4479f, 13.0f, 12.0002f)
                curveTo(13.0f, 12.5525f, 12.5523f, 13.0002f, 12.0f, 13.0002f)
                curveTo(11.4477f, 13.0002f, 11.0f, 12.5525f, 11.0f, 12.0002f)
                curveTo(11.0f, 11.4479f, 11.4477f, 11.0002f, 12.0f, 11.0002f)
                close()
            }
        }
        .build()
        return _scrollV!!
    }

private var _scrollV: ImageVector? = null
