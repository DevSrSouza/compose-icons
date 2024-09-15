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
                moveTo(9.172f, 16.818f)
                lineTo(7.757f, 18.232f)
                lineTo(12.0f, 22.475f)
                lineTo(16.243f, 18.232f)
                lineTo(14.828f, 16.818f)
                lineTo(12.0f, 19.647f)
                lineTo(9.172f, 16.818f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 7.182f)
                lineTo(16.243f, 5.768f)
                lineTo(12.0f, 1.525f)
                lineTo(7.757f, 5.768f)
                lineTo(9.172f, 7.182f)
                lineTo(12.0f, 4.354f)
                lineTo(14.828f, 7.182f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 9.0f)
                curveTo(13.657f, 9.0f, 15.0f, 10.343f, 15.0f, 12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                curveTo(9.0f, 10.343f, 10.343f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.552f, 11.0f, 13.0f, 11.448f, 13.0f, 12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                curveTo(11.448f, 13.0f, 11.0f, 12.552f, 11.0f, 12.0f)
                curveTo(11.0f, 11.448f, 11.448f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _scrollV!!
    }

private var _scrollV: ImageVector? = null
