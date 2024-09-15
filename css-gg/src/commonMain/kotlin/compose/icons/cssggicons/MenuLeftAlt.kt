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

public val CssGgIcons.MenuLeftAlt: ImageVector
    get() {
        if (_menuLeftAlt != null) {
            return _menuLeftAlt!!
        }
        _menuLeftAlt = Builder(name = "MenuLeftAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 5.448f, 4.448f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 5.0f, 20.0f, 5.448f, 20.0f, 6.0f)
                curveTo(20.0f, 6.552f, 19.552f, 7.0f, 19.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 7.0f, 4.0f, 6.552f, 4.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                curveTo(4.0f, 17.448f, 4.448f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 17.0f, 20.0f, 17.448f, 20.0f, 18.0f)
                curveTo(20.0f, 18.552f, 19.552f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 19.0f, 4.0f, 18.552f, 4.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                curveTo(4.448f, 11.0f, 4.0f, 11.448f, 4.0f, 12.0f)
                curveTo(4.0f, 12.552f, 4.448f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 13.0f, 14.0f, 12.552f, 14.0f, 12.0f)
                curveTo(14.0f, 11.448f, 13.552f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _menuLeftAlt!!
    }

private var _menuLeftAlt: ImageVector? = null
