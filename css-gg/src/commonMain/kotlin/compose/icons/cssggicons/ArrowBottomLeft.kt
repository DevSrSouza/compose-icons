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

public val CssGgIcons.ArrowBottomLeft: ImageVector
    get() {
        if (_arrowBottomLeft != null) {
            return _arrowBottomLeft!!
        }
        _arrowBottomLeft = Builder(name = "ArrowBottomLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2426f, 7.1715f)
                lineTo(16.8284f, 5.7573f)
                lineTo(7.7574f, 14.8283f)
                lineTo(7.7574f, 10.2427f)
                horizontalLineTo(5.7574f)
                lineTo(5.7574f, 18.2427f)
                horizontalLineTo(13.7574f)
                verticalLineTo(16.2427f)
                lineTo(9.1714f, 16.2427f)
                lineTo(18.2426f, 7.1715f)
                close()
            }
        }
        .build()
        return _arrowBottomLeft!!
    }

private var _arrowBottomLeft: ImageVector? = null
