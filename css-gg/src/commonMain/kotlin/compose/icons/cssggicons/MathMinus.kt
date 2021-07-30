package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MathMinus: ImageVector
    get() {
        if (_mathMinus != null) {
            return _mathMinus!!
        }
        _mathMinus = Builder(name = "MathMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 11.4477f, 4.4477f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 11.0f, 20.0f, 11.4477f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5523f, 19.5523f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 13.0f, 4.0f, 12.5523f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _mathMinus!!
    }

private var _mathMinus: ImageVector? = null
