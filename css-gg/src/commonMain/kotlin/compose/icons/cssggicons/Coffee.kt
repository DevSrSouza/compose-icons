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
                curveTo(5.448f, 2.5f, 5.0f, 2.948f, 5.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 6.052f, 5.448f, 6.5f, 6.0f, 6.5f)
                curveTo(6.552f, 6.5f, 7.0f, 6.052f, 7.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(7.0f, 2.948f, 6.552f, 2.5f, 6.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 21.5f)
                curveTo(15.973f, 21.5f, 18.441f, 19.338f, 18.917f, 16.5f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 16.5f, 23.0f, 14.709f, 23.0f, 12.5f)
                curveTo(23.0f, 10.291f, 21.209f, 8.5f, 19.0f, 8.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.5f)
                curveTo(1.0f, 18.814f, 3.686f, 21.5f, 7.0f, 21.5f)
                horizontalLineTo(13.0f)
                close()
                moveTo(3.0f, 9.5f)
                verticalLineTo(15.5f)
                curveTo(3.0f, 17.709f, 4.791f, 19.5f, 7.0f, 19.5f)
                horizontalLineTo(13.0f)
                curveTo(15.209f, 19.5f, 17.0f, 17.709f, 17.0f, 15.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 12.5f)
                curveTo(21.0f, 13.605f, 20.105f, 14.5f, 19.0f, 14.5f)
                verticalLineTo(10.5f)
                curveTo(20.105f, 10.5f, 21.0f, 11.395f, 21.0f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.5f)
                curveTo(9.0f, 2.948f, 9.448f, 2.5f, 10.0f, 2.5f)
                curveTo(10.552f, 2.5f, 11.0f, 2.948f, 11.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(11.0f, 6.052f, 10.552f, 6.5f, 10.0f, 6.5f)
                curveTo(9.448f, 6.5f, 9.0f, 6.052f, 9.0f, 5.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.5f)
                curveTo(13.448f, 2.5f, 13.0f, 2.948f, 13.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(13.0f, 6.052f, 13.448f, 6.5f, 14.0f, 6.5f)
                curveTo(14.552f, 6.5f, 15.0f, 6.052f, 15.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(15.0f, 2.948f, 14.552f, 2.5f, 14.0f, 2.5f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
