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

public val CssGgIcons.MenuOreos: ImageVector
    get() {
        if (_menuOreos != null) {
            return _menuOreos!!
        }
        _menuOreos = Builder(name = "MenuOreos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                curveTo(5.343f, 3.0f, 4.0f, 4.343f, 4.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 4.343f, 18.657f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                curveTo(5.343f, 11.0f, 4.0f, 9.657f, 4.0f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 9.657f, 18.657f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                curveTo(5.343f, 13.0f, 4.0f, 14.343f, 4.0f, 16.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 14.343f, 18.657f, 13.0f, 17.0f, 13.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                curveTo(5.343f, 21.0f, 4.0f, 19.657f, 4.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 19.657f, 18.657f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _menuOreos!!
    }

private var _menuOreos: ImageVector? = null
