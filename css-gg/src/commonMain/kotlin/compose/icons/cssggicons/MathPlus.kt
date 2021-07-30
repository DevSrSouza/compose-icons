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

public val CssGgIcons.MathPlus: ImageVector
    get() {
        if (_mathPlus != null) {
            return _mathPlus!!
        }
        _mathPlus = Builder(name = "MathPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(11.4477f, 4.0f, 11.0f, 4.4477f, 11.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 11.0f, 4.0f, 11.4477f, 4.0f, 12.0f)
                curveTo(4.0f, 12.5523f, 4.4477f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 19.5523f, 11.4477f, 20.0f, 12.0f, 20.0f)
                curveTo(12.5523f, 20.0f, 13.0f, 19.5523f, 13.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 13.0f, 20.0f, 12.5523f, 20.0f, 12.0f)
                curveTo(20.0f, 11.4477f, 19.5523f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 4.4477f, 12.5523f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _mathPlus!!
    }

private var _mathPlus: ImageVector? = null
