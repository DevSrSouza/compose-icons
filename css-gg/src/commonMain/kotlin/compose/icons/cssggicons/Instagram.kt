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

public val CssGgIcons.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 7.0f)
                curveTo(9.239f, 7.0f, 7.0f, 9.239f, 7.0f, 12.0f)
                curveTo(7.0f, 14.761f, 9.239f, 17.0f, 12.0f, 17.0f)
                curveTo(14.761f, 17.0f, 17.0f, 14.761f, 17.0f, 12.0f)
                curveTo(17.0f, 9.239f, 14.761f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                curveTo(17.448f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                curveTo(17.0f, 6.552f, 17.448f, 7.0f, 18.0f, 7.0f)
                curveTo(18.552f, 7.0f, 19.0f, 6.552f, 19.0f, 6.0f)
                curveTo(19.0f, 5.448f, 18.552f, 5.0f, 18.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 1.0f)
                curveTo(2.791f, 1.0f, 1.0f, 2.791f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 21.209f, 2.791f, 23.0f, 5.0f, 23.0f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 23.0f, 23.0f, 21.209f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 2.791f, 21.209f, 1.0f, 19.0f, 1.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.105f, 3.895f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 21.0f, 21.0f, 20.105f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.895f, 20.105f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
