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

public val CssGgIcons.FormatSeparator: ImageVector
    get() {
        if (_formatSeparator != null) {
            return _formatSeparator!!
        }
        _formatSeparator = Builder(name = "FormatSeparator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(16.5523f, 5.0f, 17.0f, 4.5523f, 17.0f, 4.0f)
                curveTo(17.0f, 3.4477f, 16.5523f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 3.0f, 7.0f, 3.4477f, 7.0f, 4.0f)
                curveTo(7.0f, 4.5523f, 7.4477f, 5.0f, 8.0f, 5.0f)
                lineTo(16.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(16.5523f, 7.0f, 17.0f, 7.4477f, 17.0f, 8.0f)
                curveTo(17.0f, 8.5523f, 16.5523f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 9.0f, 7.0f, 8.5523f, 7.0f, 8.0f)
                curveTo(7.0f, 7.4477f, 7.4477f, 7.0f, 8.0f, 7.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.5523f, 16.5523f, 13.0f, 16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                curveTo(7.4477f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 7.4477f, 11.0f, 8.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                curveTo(16.5523f, 21.0f, 17.0f, 20.5523f, 17.0f, 20.0f)
                curveTo(17.0f, 19.4477f, 16.5523f, 19.0f, 16.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                curveTo(7.4477f, 19.0f, 7.0f, 19.4477f, 7.0f, 20.0f)
                curveTo(7.0f, 20.5523f, 7.4477f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 16.5523f, 20.5523f, 17.0f, 20.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                curveTo(3.4477f, 17.0f, 3.0f, 16.5523f, 3.0f, 16.0f)
                curveTo(3.0f, 15.4477f, 3.4477f, 15.0f, 4.0f, 15.0f)
                lineTo(20.0f, 15.0f)
                curveTo(20.5523f, 15.0f, 21.0f, 15.4477f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _formatSeparator!!
    }

private var _formatSeparator: ImageVector? = null
