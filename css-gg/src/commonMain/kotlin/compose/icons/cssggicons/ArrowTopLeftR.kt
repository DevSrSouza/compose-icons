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

public val CssGgIcons.ArrowTopLeftR: ImageVector
    get() {
        if (_arrowTopLeftR != null) {
            return _arrowTopLeftR!!
        }
        _arrowTopLeftR = Builder(name = "ArrowTopLeftR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.963f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.963f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.963f)
                horizontalLineTo(11.414f)
                lineTo(16.744f, 15.293f)
                lineTo(15.33f, 16.707f)
                lineTo(10.0f, 11.377f)
                lineTo(10.0f, 13.963f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 19.0f)
                curveTo(1.0f, 21.209f, 2.791f, 23.0f, 5.0f, 23.0f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 23.0f, 23.0f, 21.209f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 2.791f, 21.209f, 1.0f, 19.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(2.791f, 1.0f, 1.0f, 2.791f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 21.0f, 21.0f, 20.105f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.895f, 20.105f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.105f, 3.895f, 21.0f, 5.0f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowTopLeftR!!
    }

private var _arrowTopLeftR: ImageVector? = null
