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

public val CssGgIcons.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                curveTo(22.0f, 6.552f, 21.552f, 7.0f, 21.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 7.0f, 2.0f, 6.552f, 2.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.032f)
                curveTo(2.0f, 11.48f, 2.448f, 11.032f, 3.0f, 11.032f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 11.032f, 22.0f, 11.48f, 22.0f, 12.032f)
                curveTo(22.0f, 12.585f, 21.552f, 13.032f, 21.0f, 13.032f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 13.032f, 2.0f, 12.585f, 2.0f, 12.032f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.065f)
                curveTo(2.448f, 17.065f, 2.0f, 17.512f, 2.0f, 18.065f)
                curveTo(2.0f, 18.617f, 2.448f, 19.065f, 3.0f, 19.065f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 19.065f, 22.0f, 18.617f, 22.0f, 18.065f)
                curveTo(22.0f, 17.512f, 21.552f, 17.065f, 21.0f, 17.065f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
