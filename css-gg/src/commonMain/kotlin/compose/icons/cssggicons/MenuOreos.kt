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
                curveTo(5.3432f, 3.0f, 4.0f, 4.3432f, 4.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 4.3432f, 18.6569f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                curveTo(5.3432f, 11.0f, 4.0f, 9.6568f, 4.0f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 9.6568f, 18.6569f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                curveTo(5.3432f, 13.0f, 4.0f, 14.3431f, 4.0f, 16.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 14.3431f, 18.6569f, 13.0f, 17.0f, 13.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                curveTo(5.3432f, 21.0f, 4.0f, 19.6569f, 4.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 19.6569f, 18.6569f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _menuOreos!!
    }

private var _menuOreos: ImageVector? = null
