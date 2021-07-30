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
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                curveTo(22.0f, 6.5523f, 21.5523f, 7.0f, 21.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 6.5523f, 2.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0322f)
                curveTo(2.0f, 11.4799f, 2.4477f, 11.0322f, 3.0f, 11.0322f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 11.0322f, 22.0f, 11.4799f, 22.0f, 12.0322f)
                curveTo(22.0f, 12.5845f, 21.5523f, 13.0322f, 21.0f, 13.0322f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 13.0322f, 2.0f, 12.5845f, 2.0f, 12.0322f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0645f)
                curveTo(2.4477f, 17.0645f, 2.0f, 17.5122f, 2.0f, 18.0645f)
                curveTo(2.0f, 18.6167f, 2.4477f, 19.0645f, 3.0f, 19.0645f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 19.0645f, 22.0f, 18.6167f, 22.0f, 18.0645f)
                curveTo(22.0f, 17.5122f, 21.5523f, 17.0645f, 21.0f, 17.0645f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
