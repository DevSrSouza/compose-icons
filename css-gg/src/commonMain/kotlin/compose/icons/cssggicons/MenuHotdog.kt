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

public val CssGgIcons.MenuHotdog: ImageVector
    get() {
        if (_menuHotdog != null) {
            return _menuHotdog!!
        }
        _menuHotdog = Builder(name = "MenuHotdog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveTo(5.3432f, 6.0f, 4.0f, 7.3432f, 4.0f, 9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.3432f, 18.6569f, 6.0f, 17.0f, 6.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                curveTo(5.3432f, 18.0f, 4.0f, 16.6569f, 4.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 16.6569f, 18.6569f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                curveTo(2.4477f, 11.0f, 2.0f, 11.4477f, 2.0f, 12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 12.5523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.4477f, 21.5523f, 11.0f, 21.0f, 11.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _menuHotdog!!
    }

private var _menuHotdog: ImageVector? = null
