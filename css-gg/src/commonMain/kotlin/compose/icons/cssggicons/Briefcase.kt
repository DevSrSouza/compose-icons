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

public val CssGgIcons.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 5.0f)
                verticalLineTo(4.0f)
                curveTo(7.0f, 2.8955f, 7.8954f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 2.0f, 17.0f, 2.8955f, 17.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 5.0f, 23.0f, 6.3431f, 23.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 19.6569f, 21.6569f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 21.0f, 1.0f, 19.6569f, 1.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(1.0f, 6.3431f, 2.3431f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.0f, 7.0f)
                curveTo(3.4478f, 7.0f, 3.0f, 7.4477f, 3.0f, 8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 7.4477f, 20.5522f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 18.5523f, 20.5522f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4478f, 19.0f, 3.0f, 18.5523f, 3.0f, 18.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
