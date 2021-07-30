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

public val CssGgIcons.Today: ImageVector
    get() {
        if (_today != null) {
            return _today!!
        }
        _today = Builder(name = "Today", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                lineTo(16.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 10.0f)
                lineTo(17.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 18.0f)
                lineTo(7.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 3.0f, 5.0f, 3.4477f, 5.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 20.5523f, 5.4477f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 21.0f, 19.0f, 20.5523f, 19.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(19.0f, 3.4477f, 18.5523f, 3.0f, 18.0f, 3.0f)
                close()
                moveTo(6.0f, 1.0f)
                curveTo(4.3432f, 1.0f, 3.0f, 2.3431f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.6569f, 4.3432f, 23.0f, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 23.0f, 21.0f, 21.6569f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 2.3431f, 19.6569f, 1.0f, 18.0f, 1.0f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveTo(7.0f, 5.4477f, 7.4477f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 5.0f, 13.0f, 5.4477f, 13.0f, 6.0f)
                curveTo(13.0f, 6.5523f, 12.5523f, 7.0f, 12.0f, 7.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 7.0f, 7.0f, 6.5523f, 7.0f, 6.0f)
                close()
            }
        }
        .build()
        return _today!!
    }

private var _today: ImageVector? = null
