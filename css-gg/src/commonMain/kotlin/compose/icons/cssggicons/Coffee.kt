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

public val CssGgIcons.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.5f)
                curveTo(5.4477f, 2.5f, 5.0f, 2.9477f, 5.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 6.0523f, 5.4477f, 6.5f, 6.0f, 6.5f)
                curveTo(6.5523f, 6.5f, 7.0f, 6.0523f, 7.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(7.0f, 2.9477f, 6.5523f, 2.5f, 6.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 21.5f)
                curveTo(15.973f, 21.5f, 18.441f, 19.3377f, 18.917f, 16.5f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 16.5f, 23.0f, 14.7091f, 23.0f, 12.5f)
                curveTo(23.0f, 10.2909f, 21.2091f, 8.5f, 19.0f, 8.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.5f)
                curveTo(1.0f, 18.8137f, 3.6863f, 21.5f, 7.0f, 21.5f)
                horizontalLineTo(13.0f)
                close()
                moveTo(3.0f, 9.5f)
                verticalLineTo(15.5f)
                curveTo(3.0f, 17.7091f, 4.7909f, 19.5f, 7.0f, 19.5f)
                horizontalLineTo(13.0f)
                curveTo(15.2091f, 19.5f, 17.0f, 17.7091f, 17.0f, 15.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 12.5f)
                curveTo(21.0f, 13.6046f, 20.1046f, 14.5f, 19.0f, 14.5f)
                verticalLineTo(10.5f)
                curveTo(20.1046f, 10.5f, 21.0f, 11.3954f, 21.0f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.5f)
                curveTo(9.0f, 2.9477f, 9.4477f, 2.5f, 10.0f, 2.5f)
                curveTo(10.5523f, 2.5f, 11.0f, 2.9477f, 11.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(11.0f, 6.0523f, 10.5523f, 6.5f, 10.0f, 6.5f)
                curveTo(9.4477f, 6.5f, 9.0f, 6.0523f, 9.0f, 5.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.5f)
                curveTo(13.4477f, 2.5f, 13.0f, 2.9477f, 13.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(13.0f, 6.0523f, 13.4477f, 6.5f, 14.0f, 6.5f)
                curveTo(14.5523f, 6.5f, 15.0f, 6.0523f, 15.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(15.0f, 2.9477f, 14.5523f, 2.5f, 14.0f, 2.5f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
