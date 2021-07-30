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

public val CssGgIcons.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }
        _square = Builder(name = "Square", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 9.0f)
                curveTo(5.0f, 6.7909f, 6.7909f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(17.2091f, 5.0f, 19.0f, 6.7909f, 19.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 17.2091f, 17.2091f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(6.7909f, 19.0f, 5.0f, 17.2091f, 5.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 8.0f, 16.0f, 8.4477f, 16.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 15.5523f, 15.5523f, 16.0f, 15.0f, 16.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 16.0f, 8.0f, 15.5523f, 8.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(8.0f, 8.4477f, 8.4477f, 8.0f, 9.0f, 8.0f)
                close()
            }
        }
        .build()
        return _square!!
    }

private var _square: ImageVector? = null
