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
                moveTo(2.0f, 5.995f)
                curveTo(2.0f, 5.446f, 2.446f, 5.0f, 2.995f, 5.0f)
                horizontalLineTo(11.005f)
                curveTo(11.554f, 5.0f, 12.0f, 5.446f, 12.0f, 5.995f)
                curveTo(12.0f, 6.545f, 11.554f, 6.99f, 11.005f, 6.99f)
                horizontalLineTo(2.995f)
                curveTo(2.446f, 6.99f, 2.0f, 6.545f, 2.0f, 5.995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.45f, 2.446f, 11.005f, 2.995f, 11.005f)
                horizontalLineTo(21.005f)
                curveTo(21.554f, 11.005f, 22.0f, 11.45f, 22.0f, 12.0f)
                curveTo(22.0f, 12.549f, 21.554f, 12.995f, 21.005f, 12.995f)
                horizontalLineTo(2.995f)
                curveTo(2.446f, 12.995f, 2.0f, 12.549f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.995f, 17.01f)
                curveTo(2.446f, 17.01f, 2.0f, 17.455f, 2.0f, 18.005f)
                curveTo(2.0f, 18.554f, 2.446f, 19.0f, 2.995f, 19.0f)
                horizontalLineTo(15.005f)
                curveTo(15.554f, 19.0f, 16.0f, 18.554f, 16.0f, 18.005f)
                curveTo(16.0f, 17.455f, 15.554f, 17.01f, 15.005f, 17.01f)
                horizontalLineTo(2.995f)
                close()
            }
        }
        .build()
        return _menuLeft!!
    }

private var _menuLeft: ImageVector? = null
