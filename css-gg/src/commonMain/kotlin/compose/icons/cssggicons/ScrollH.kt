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

public val CssGgIcons.ScrollH: ImageVector
    get() {
        if (_scrollH != null) {
            return _scrollH!!
        }
        _scrollH = Builder(name = "ScrollH", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.182f, 9.172f)
                lineTo(5.768f, 7.757f)
                lineTo(1.525f, 12.0f)
                lineTo(5.768f, 16.243f)
                lineTo(7.182f, 14.828f)
                lineTo(4.353f, 12.0f)
                lineTo(7.182f, 9.172f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.818f, 14.828f)
                lineTo(18.232f, 16.243f)
                lineTo(22.475f, 12.0f)
                lineTo(18.232f, 7.757f)
                lineTo(16.818f, 9.172f)
                lineTo(19.646f, 12.0f)
                lineTo(16.818f, 14.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                curveTo(9.0f, 10.343f, 10.343f, 9.0f, 12.0f, 9.0f)
                curveTo(13.657f, 9.0f, 15.0f, 10.343f, 15.0f, 12.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                curveTo(11.448f, 13.0f, 11.0f, 12.552f, 11.0f, 12.0f)
                curveTo(11.0f, 11.448f, 11.448f, 11.0f, 12.0f, 11.0f)
                curveTo(12.552f, 11.0f, 13.0f, 11.448f, 13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _scrollH!!
    }

private var _scrollH: ImageVector? = null
