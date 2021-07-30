package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.MenuCake: ImageVector
    get() {
        if (_menuCake != null) {
            return _menuCake!!
        }
        _menuCake = Builder(name = "MenuCake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveTo(13.1046f, 8.0f, 14.0f, 7.1046f, 14.0f, 6.0f)
                curveTo(14.0f, 4.8954f, 13.1046f, 4.0f, 12.0f, 4.0f)
                curveTo(10.8954f, 4.0f, 10.0f, 4.8954f, 10.0f, 6.0f)
                curveTo(10.0f, 7.1046f, 10.8954f, 8.0f, 12.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                curveTo(4.4477f, 10.0f, 4.0f, 10.4477f, 4.0f, 11.0f)
                curveTo(4.0f, 11.5523f, 4.4477f, 12.0f, 5.0f, 12.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 12.0f, 20.0f, 11.5523f, 20.0f, 11.0f)
                curveTo(20.0f, 10.4477f, 19.5523f, 10.0f, 19.0f, 10.0f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                curveTo(4.0f, 14.4477f, 4.4477f, 14.0f, 5.0f, 14.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 14.0f, 20.0f, 14.4477f, 20.0f, 15.0f)
                curveTo(20.0f, 15.5523f, 19.5523f, 16.0f, 19.0f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 16.0f, 4.0f, 15.5523f, 4.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                curveTo(4.4477f, 18.0f, 4.0f, 18.4477f, 4.0f, 19.0f)
                curveTo(4.0f, 19.5523f, 4.4477f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 20.0f, 20.0f, 19.5523f, 20.0f, 19.0f)
                curveTo(20.0f, 18.4477f, 19.5523f, 18.0f, 19.0f, 18.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _menuCake!!
    }

private var _menuCake: ImageVector? = null
