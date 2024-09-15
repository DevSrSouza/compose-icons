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

public val CssGgIcons.Desktop: ImageVector
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = Builder(name = "Desktop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                curveTo(7.448f, 15.0f, 7.0f, 15.448f, 7.0f, 16.0f)
                curveTo(7.0f, 16.552f, 7.448f, 17.0f, 8.0f, 17.0f)
                curveTo(8.552f, 17.0f, 9.0f, 16.552f, 9.0f, 16.0f)
                curveTo(9.0f, 15.448f, 8.552f, 15.0f, 8.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 15.448f, 11.448f, 15.0f, 12.0f, 15.0f)
                curveTo(12.552f, 15.0f, 13.0f, 15.448f, 13.0f, 16.0f)
                curveTo(13.0f, 16.552f, 12.552f, 17.0f, 12.0f, 17.0f)
                curveTo(11.448f, 17.0f, 11.0f, 16.552f, 11.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                curveTo(15.448f, 15.0f, 15.0f, 15.448f, 15.0f, 16.0f)
                curveTo(15.0f, 16.552f, 15.448f, 17.0f, 16.0f, 17.0f)
                curveTo(16.552f, 17.0f, 17.0f, 16.552f, 17.0f, 16.0f)
                curveTo(17.0f, 15.448f, 16.552f, 15.0f, 16.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 3.0f)
                curveTo(2.343f, 3.0f, 1.0f, 4.343f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.657f, 2.343f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.657f, 21.0f, 23.0f, 19.657f, 23.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 4.343f, 21.657f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 5.0f, 3.0f, 5.448f, 3.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 5.448f, 20.552f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 18.552f, 20.552f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 19.0f, 3.0f, 18.552f, 3.0f, 18.0f)
                close()
            }
        }
        .build()
        return _desktop!!
    }

private var _desktop: ImageVector? = null
