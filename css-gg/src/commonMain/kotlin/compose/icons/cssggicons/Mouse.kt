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

public val CssGgIcons.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(11.448f, 5.0f, 11.0f, 5.448f, 11.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 10.552f, 11.448f, 11.0f, 12.0f, 11.0f)
                curveTo(12.552f, 11.0f, 13.0f, 10.552f, 13.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(13.0f, 5.448f, 12.552f, 5.0f, 12.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 3.582f, 7.582f, 0.0f, 12.0f, 0.0f)
                curveTo(16.418f, 0.0f, 20.0f, 3.582f, 20.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 20.418f, 16.418f, 24.0f, 12.0f, 24.0f)
                curveTo(7.582f, 24.0f, 4.0f, 20.418f, 4.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(18.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 19.314f, 15.314f, 22.0f, 12.0f, 22.0f)
                curveTo(8.686f, 22.0f, 6.0f, 19.314f, 6.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 4.686f, 8.686f, 2.0f, 12.0f, 2.0f)
                curveTo(15.314f, 2.0f, 18.0f, 4.686f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
