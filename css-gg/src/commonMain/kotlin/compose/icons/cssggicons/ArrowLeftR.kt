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

public val CssGgIcons.ArrowLeftR: ImageVector
    get() {
        if (_arrowLeftR != null) {
            return _arrowLeftR!!
        }
        _arrowLeftR = Builder(name = "ArrowLeftR", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.948f, 14.828f)
                lineTo(10.534f, 16.243f)
                lineTo(6.291f, 12.0f)
                lineTo(10.534f, 7.757f)
                lineTo(11.948f, 9.172f)
                lineTo(10.12f, 11.0f)
                horizontalLineTo(17.657f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.12f)
                lineTo(11.948f, 14.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 19.0f)
                curveTo(23.0f, 21.209f, 21.209f, 23.0f, 19.0f, 23.0f)
                horizontalLineTo(5.0f)
                curveTo(2.791f, 23.0f, 1.0f, 21.209f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 2.791f, 2.791f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 1.0f, 23.0f, 2.791f, 23.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 21.0f, 3.0f, 20.105f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.895f, 3.895f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 3.0f, 21.0f, 3.895f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.105f, 20.105f, 21.0f, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowLeftR!!
    }

private var _arrowLeftR: ImageVector? = null
