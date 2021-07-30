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

public val CssGgIcons.FontHeight: ImageVector
    get() {
        if (_fontHeight != null) {
            return _fontHeight!!
        }
        _fontHeight = Builder(name = "FontHeight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0001f, 7.3764f)
                curveTo(11.602f, 7.3521f, 11.2112f, 7.5687f, 11.0325f, 7.952f)
                lineTo(7.6515f, 15.2025f)
                curveTo(7.4181f, 15.7031f, 7.6347f, 16.2981f, 8.1352f, 16.5315f)
                curveTo(8.6358f, 16.7649f, 9.2307f, 16.5484f, 9.4642f, 16.0477f)
                lineTo(9.9528f, 14.9999f)
                horizontalLineTo(14.0473f)
                lineTo(14.5359f, 16.0477f)
                curveTo(14.7693f, 16.5484f, 15.3643f, 16.7649f, 15.8648f, 16.5315f)
                curveTo(16.3654f, 16.2981f, 16.5819f, 15.7031f, 16.3485f, 15.2025f)
                lineTo(12.9676f, 7.952f)
                curveTo(12.7888f, 7.5687f, 12.3981f, 7.3521f, 12.0001f, 7.3764f)
                close()
                moveTo(13.1147f, 12.9999f)
                horizontalLineTo(10.8854f)
                lineTo(12.0001f, 10.6095f)
                lineTo(13.1147f, 12.9999f)
                close()
            }
        }
        .build()
        return _fontHeight!!
    }

private var _fontHeight: ImageVector? = null
