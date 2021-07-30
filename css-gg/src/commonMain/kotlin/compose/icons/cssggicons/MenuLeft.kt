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

public val CssGgIcons.MenuLeft: ImageVector
    get() {
        if (_menuLeft != null) {
            return _menuLeft!!
        }
        _menuLeft = Builder(name = "MenuLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.9952f)
                curveTo(2.0f, 5.4456f, 2.4456f, 5.0f, 2.9952f, 5.0f)
                horizontalLineTo(11.0048f)
                curveTo(11.5544f, 5.0f, 12.0f, 5.4456f, 12.0f, 5.9952f)
                curveTo(12.0f, 6.5448f, 11.5544f, 6.9904f, 11.0048f, 6.9904f)
                horizontalLineTo(2.9952f)
                curveTo(2.4456f, 6.9904f, 2.0f, 6.5448f, 2.0f, 5.9952f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.9998f)
                curveTo(2.0f, 11.4501f, 2.4456f, 11.0046f, 2.9952f, 11.0046f)
                horizontalLineTo(21.0048f)
                curveTo(21.5544f, 11.0046f, 22.0f, 11.4501f, 22.0f, 11.9998f)
                curveTo(22.0f, 12.5494f, 21.5544f, 12.9949f, 21.0048f, 12.9949f)
                horizontalLineTo(2.9952f)
                curveTo(2.4456f, 12.9949f, 2.0f, 12.5494f, 2.0f, 11.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9952f, 17.0096f)
                curveTo(2.4456f, 17.0096f, 2.0f, 17.4552f, 2.0f, 18.0048f)
                curveTo(2.0f, 18.5544f, 2.4456f, 19.0f, 2.9952f, 19.0f)
                horizontalLineTo(15.0048f)
                curveTo(15.5544f, 19.0f, 16.0f, 18.5544f, 16.0f, 18.0048f)
                curveTo(16.0f, 17.4552f, 15.5544f, 17.0096f, 15.0048f, 17.0096f)
                horizontalLineTo(2.9952f)
                close()
            }
        }
        .build()
        return _menuLeft!!
    }

private var _menuLeft: ImageVector? = null
