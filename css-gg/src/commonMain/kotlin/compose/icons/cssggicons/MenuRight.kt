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

public val CssGgIcons.MenuRight: ImageVector
    get() {
        if (_menuRight != null) {
            return _menuRight!!
        }
        _menuRight = Builder(name = "MenuRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0048f)
                curveTo(22.0f, 18.5544f, 21.5544f, 19.0f, 21.0048f, 19.0f)
                horizontalLineTo(12.9952f)
                curveTo(12.4456f, 19.0f, 12.0f, 18.5544f, 12.0f, 18.0048f)
                curveTo(12.0f, 17.4552f, 12.4456f, 17.0096f, 12.9952f, 17.0096f)
                horizontalLineTo(21.0048f)
                curveTo(21.5544f, 17.0096f, 22.0f, 17.4552f, 22.0f, 18.0048f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0002f)
                curveTo(22.0f, 12.5499f, 21.5544f, 12.9954f, 21.0048f, 12.9954f)
                horizontalLineTo(2.9952f)
                curveTo(2.4456f, 12.9954f, 2.0f, 12.5499f, 2.0f, 12.0002f)
                curveTo(2.0f, 11.4506f, 2.4456f, 11.0051f, 2.9952f, 11.0051f)
                horizontalLineTo(21.0048f)
                curveTo(21.5544f, 11.0051f, 22.0f, 11.4506f, 22.0f, 12.0002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0048f, 6.9904f)
                curveTo(21.5544f, 6.9904f, 22.0f, 6.5448f, 22.0f, 5.9952f)
                curveTo(22.0f, 5.4456f, 21.5544f, 5.0f, 21.0048f, 5.0f)
                horizontalLineTo(8.9952f)
                curveTo(8.4456f, 5.0f, 8.0f, 5.4456f, 8.0f, 5.9952f)
                curveTo(8.0f, 6.5448f, 8.4456f, 6.9904f, 8.9952f, 6.9904f)
                horizontalLineTo(21.0048f)
                close()
            }
        }
        .build()
        return _menuRight!!
    }

private var _menuRight: ImageVector? = null
